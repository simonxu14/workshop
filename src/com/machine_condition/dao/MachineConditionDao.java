package com.machine_condition.dao;
	
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.db.DBUtils;

public class MachineConditionDao {
	public boolean insert(MachineCondition user){
		try {
			Connection conn = DBUtils.getConnection();
			String sql = "insert into machine_condition values(?,?,?,?,?,?,?)";
			PreparedStatement ps = conn.prepareStatement(sql);
			
			ps.setString(1, user.getMachineID());
			ps.setString(2, user.getTime());
			ps.setString(3, user.getMoveTime());
			ps.setString(4, user.getRestTime());
			ps.setString(5, user.getDisplacement());
			ps.setString(6, user.getsTime());
			ps.setString(7, user.getCondition());
			
			int x  = ps.executeUpdate();
			ps.close();
			conn.close();
			if(x > 0)
				return true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	public boolean delete(String machineID){
		try {
			Connection conn = DBUtils.getConnection();
			String sql = "delete from machine_condition where machineID=?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, machineID);
			int x = ps.executeUpdate();
			ps.close();
			conn.close();
			if(x > 0 )
				return true;			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
	
	
	
	public boolean update(MachineCondition user){
		try {
			Connection conn = DBUtils.getConnection();
			String sql = "update machine_condition set time=?,moveTime=?,restTime=?,displacement=?,sTime=?,condition=? where machineID=?";
			PreparedStatement ps = conn.prepareStatement(sql);
			
			ps.setString(1, user.getTime());
			ps.setString(2, user.getMoveTime());
			ps.setString(3, user.getRestTime());
			ps.setString(4, user.getDisplacement());
			ps.setString(5, user.getsTime());
			ps.setString(6, user.getCondition());
			ps.setString(7, user.getMachineID());
			
			int x  = ps.executeUpdate();
			ps.close();
			conn.close();
			if(x > 0)
				return true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
	
	public MachineCondition queryById(String machineID){
		MachineCondition u = new MachineCondition();
		try {
			Connection conn = DBUtils.getConnection();
			String sql = "select * from machine_condition where machineID=?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, machineID);
			ResultSet rs = ps.executeQuery();
			if(rs.next()){
				u.setMachineID(rs.getString("machineID"));
				u.setTime(rs.getString("time"));
				u.setMoveTime(rs.getString("moveTime"));
				u.setRestTime(rs.getString("restTime"));
				u.setDisplacement(rs.getString("displacement"));
				u.setsTime(rs.getString("sTime"));
				u.setCondition(rs.getString("condition"));
				
			}
			rs.close();
			ps.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return u;
	}
	
	public ArrayList<MachineCondition> query(MachineCondition u){
		String machineID = u.getMachineID();
		String time = u.getTime();
		String moveTime = u.getMoveTime();
		String restTime = u.getRestTime();
		String displacement = u.getDisplacement();
		String sTime = u.getsTime();
		String condition = u.getCondition();
		
		ArrayList<MachineCondition> users = new ArrayList<MachineCondition>();
		ArrayList<String> params = new ArrayList<String>();
		try {
			Connection conn = DBUtils.getConnection();
			StringBuffer sql =new StringBuffer("select machineID,time,moveTime,restTime,displacement,sTime,condition from machine_condition where 1=1");
			if(machineID != null && !"".equals(machineID) ){
				sql.append(" and machineID=?");
				params.add(machineID);
			}
			if(time != null && !"".equals(time) ){
				sql.append(" and time=?");
				params.add(time);
			}
			if(moveTime != null && !"".equals(moveTime) ){
				sql.append(" and moveTime=?");
				params.add(moveTime);
			}
			if(restTime != null && !"".equals(restTime) ){
				sql.append(" and restTime=?");
				params.add(restTime);
			}
			if(displacement != null && !"".equals(displacement) ){
				sql.append(" and displacement=?");
				params.add(displacement);
			}
			if(sTime != null && !"".equals(sTime) ){
				sql.append(" and sTime=?");
				params.add(sTime);
			}
			if(machineID != null && !"".equals(condition) ){
				sql.append(" and condition=?");
				params.add(condition);
			}

			PreparedStatement ps = conn.prepareStatement(sql.toString());
			for(int i=0; i< params.size(); i++){
				ps.setString(i+1,params.get(i));
			}
			
			ResultSet rs = ps.executeQuery();
			while(rs.next()){
				MachineCondition u1 = new MachineCondition();
				u1.setMachineID(rs.getString("machineID"));
				u1.setTime(rs.getString("time"));
				u1.setMoveTime(rs.getString("moveTime"));
				u1.setRestTime(rs.getString("restTime"));
				u1.setDisplacement(rs.getString("displacement"));
				u1.setsTime(rs.getString("sTime"));
				u1.setCondition(rs.getString("condition"));
				users.add(u1);
			}
			rs.close();
			ps.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return users;
	}
	
	public ArrayList<MachineCondition> find(){
		try {
			Connection conn = DBUtils.getConnection();
			Statement stmt = conn.createStatement();
			String sql = "select * from machine_condition";
			ResultSet rs = stmt.executeQuery(sql);
			ArrayList<MachineCondition> users = new ArrayList<MachineCondition>();
			while(rs.next()){
				MachineCondition user = new MachineCondition();
				user.setMachineID(rs.getString("machineID"));
				user.setTime(rs.getString("time"));
				user.setMoveTime(rs.getString("moveTime"));
				user.setRestTime(rs.getString("restTime"));
				user.setDisplacement(rs.getString("displacement"));
				user.setsTime(rs.getString("sTime"));
				user.setCondition(rs.getString("condition"));
				users.add(user);
				
			}
			rs.close();
			stmt.close();
			conn.close();
			return users;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;

	}

}
