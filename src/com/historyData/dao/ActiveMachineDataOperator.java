package com.historyData.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import com.db.DBUtils;
public class ActiveMachineDataOperator{
	
	private Connection conn;
	private PreparedStatement ps;
	private ResultSet rs;
	
	private StringBuffer sendActiveMachineDataToClient;
	
	private String machineID;
	private Date requestTime;
	
	public ActiveMachineDataOperator(String machineID,String requestTime){
		this.machineID = machineID;
		setRequestTime(requestTime);
		sendActiveMachineDataToClient = new StringBuffer("");
	}
	
	public void openDB(){
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date startDate = (Date)requestTime.clone();
		startDate.setHours(0);
		startDate.setMinutes(0);
		startDate.setSeconds(0);
		Date endDate = (Date)requestTime.clone();
		try {
			conn = DBUtils.getConnection();
			String sql = "SELECT * FROM active_machine_tool_information WHERE time BETWEEN ? AND ? AND machine = ?";
			ps = conn.prepareStatement(sql);
			ps.setString(1, sdf.format(startDate));
			ps.setString(2, sdf.format(endDate));
			ps.setString(3, machineID);
			rs = ps.executeQuery();//查询machineID的所有数据
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void closeDB(){
		try {
			conn.close();
			ps.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public boolean findActiveMachineData(){
		try {
			sendActiveMachineDataToClient.append("<html><title>ActiveMachineData</title>");
			while(rs.next()){
				sendActiveMachineDataToClient.append("<br><active_machine_data></br>");
				sendActiveMachineDataToClient.append("<br><machine_ID>" + rs.getString("machine") + "</machine_ID></br>");
				sendActiveMachineDataToClient.append("<br><time>" + rs.getString("time") + "</time></br>");
				sendActiveMachineDataToClient.append("<br><moveTime>" + rs.getInt("moveTime") + "</moveTime></br>");
				sendActiveMachineDataToClient.append("<br><restTime>" + rs.getInt("restTime") + "</restTime></br>");
				sendActiveMachineDataToClient.append("<br><displacement>" + rs.getInt("displacement") + "</displacement></br>");
				sendActiveMachineDataToClient.append("<br><sTime>" + rs.getInt("sTime") + "</sTime></br>");
				sendActiveMachineDataToClient.append("<br></active_machine_data></br>");
//				sendActiveMachineDataToClient.append("\n");
			}
			sendActiveMachineDataToClient.append("</html>");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		return true;
	}
	
	/*
	 * 按时间段整合数据
	 */
	public boolean findActiveMachineDataByTimeSpace(int timespace){
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date startTime = null;
		Date endTime = null;
		int totalMoveTime = 0;
		int totalRestTime = 0;
		int totalDisplacement = 0;
		int totalSTime = 0;
		boolean flag = true;
		boolean start = true;
		int count = 0;//数据计数器
		int totalAmount = 0;//获取总数据的行数
		int tempCount = 0;//时间段内计数器
		
		try {
			rs.last();
			totalAmount = rs.getRow();
			rs.beforeFirst();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		try {
			sendActiveMachineDataToClient.append("<html><title>ActiveMachineData</title>");
			while(rs.next()){
				count++;
				tempCount++;
				endTime = sdf.parse(rs.getString("time"));
				totalMoveTime = totalMoveTime + rs.getInt("moveTime");
				totalRestTime = totalRestTime + rs.getInt("restTime");
				totalDisplacement = totalDisplacement + rs.getInt("displacement");
				totalSTime = totalSTime + rs.getInt("sTime");
				
				
				if(flag){
					if(start){
						startTime = sdf.parse(rs.getString("time"));
						start = false;
					}else{
						startTime = (Date)endTime.clone();
						totalMoveTime = rs.getInt("moveTime");
						totalRestTime = rs.getInt("restTime");
						totalDisplacement = rs.getInt("displacement");
						totalSTime = rs.getInt("sTime");
						tempCount = 1;
					}
				}
				if(((endTime.getTime()/1000 - startTime.getTime()/1000) / 60 < timespace - 1)){
					flag = false;
					if(count == totalAmount){
						sendActiveMachineDataToClient.append("\n");
						sendActiveMachineDataToClient.append("<br><active_machine_data></br>");
						sendActiveMachineDataToClient.append("<br><machine_ID>" + rs.getString("machine") + "</machine_ID></br>");
						sendActiveMachineDataToClient.append("<br><time>" + rs.getString("time") + "</time></br>");
						sendActiveMachineDataToClient.append("<br><moveTime>" + totalMoveTime / tempCount + "</moveTime></br>");
						sendActiveMachineDataToClient.append("<br><restTime>" + totalRestTime / tempCount + "</restTime></br>");
						sendActiveMachineDataToClient.append("<br><displacement>" + totalDisplacement / tempCount + "</displacement></br>");
						sendActiveMachineDataToClient.append("<br><sTime>" + totalSTime / tempCount + "</sTime></br>");
						sendActiveMachineDataToClient.append("<br></active_machine_data></br>");
//						sendActiveMachineDataToClient.append("\n");
//						System.out.println(tempCount);
					}
				} else{
					flag = true;
					sendActiveMachineDataToClient.append("\n");
					sendActiveMachineDataToClient.append("<br><active_machine_data></br>");
					sendActiveMachineDataToClient.append("<br><machine_ID>" + rs.getString("machine") + "</machine_ID></br>");
					sendActiveMachineDataToClient.append("<br><time>" + rs.getString("time") + "</time></br>");
					sendActiveMachineDataToClient.append("<br><moveTime>" + totalMoveTime / tempCount + "</moveTime></br>");
					sendActiveMachineDataToClient.append("<br><restTime>" + totalRestTime / tempCount + "</restTime></br>");
					sendActiveMachineDataToClient.append("<br><displacement>" + totalDisplacement / tempCount + "</displacement></br>");
					sendActiveMachineDataToClient.append("<br><sTime>" + totalSTime / tempCount + "</sTime></br>");
					sendActiveMachineDataToClient.append("<br></active_machine_data></br>");
//					sendActiveMachineDataToClient.append("\n");
//					System.out.println(tempCount);
				}
			}
			sendActiveMachineDataToClient.append("</html>");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		return true;
	}
	
	public String getActiveMachineHistoryData(){
		return null;
	}
	
	public void setRequestTime(String dateString){
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		try {
			this.requestTime = sdf.parse(dateString);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public String getSendActiveMachineDataToClient(){
		return sendActiveMachineDataToClient.toString();
	}
}
