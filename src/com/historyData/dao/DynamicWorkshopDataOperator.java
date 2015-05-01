package com.historyData.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.db.DBUtils;
public class DynamicWorkshopDataOperator {
	private Connection conn;
	private PreparedStatement ps;
	private ResultSet rs;
	
	private String workshopID;
	
	private StringBuffer sendDynamicWorkshopDataToClient;
	
	public DynamicWorkshopDataOperator(String workshopID){
		this.workshopID = workshopID;
		sendDynamicWorkshopDataToClient = new StringBuffer("");
	}
	
	public void openDB(){
		try {
			conn = DBUtils.getConnection();
			String sql = "SELECT * FROM dynamic_workshop_information WHERE workshopID = ?";
			ps = conn.prepareStatement(sql);
			ps.setString(1,workshopID);
			rs = ps.executeQuery();
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
	
	public boolean findDynamicWorkshopData(){
		try {
			sendDynamicWorkshopDataToClient.append("<html><title>workshopData</title><body>");
			while(rs.next()){
				sendDynamicWorkshopDataToClient.append("<br><dynamic_workshop_data></br>");
				sendDynamicWorkshopDataToClient.append("<br><workshop_ID>" + rs.getString("workshopID") + "</workshop_ID></br>");
				sendDynamicWorkshopDataToClient.append("<br><temperature>" + rs.getInt("temperature") + "</temperature></br>");
				sendDynamicWorkshopDataToClient.append("<br><humidity>" + rs.getInt("humidity") + "</humidity></br>");
				sendDynamicWorkshopDataToClient.append("<br><noise>" + rs.getInt("noise") + "</noise></br>");
				sendDynamicWorkshopDataToClient.append("<br></dynamic_workshop_data></br>");
//				sendDynamicWorkshopDataToClient.append("\n");
			}
			sendDynamicWorkshopDataToClient.append("</body></html>");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		return true;
	}
	
	public String getDynamicWorkshopHistoryData(){
		return null;
	}
	
	public String getSendDynamicWorkshopDataToClient(){
		return sendDynamicWorkshopDataToClient.toString();
	}
}
