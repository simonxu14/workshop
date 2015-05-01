package com.active_machine.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.db.DBUtils;

public class ActiveMachineDao {
	public boolean insert(ActiveMachine user){
		try {
			Connection conn = DBUtils.getConnection();
			String sql = "insert into active_machine_tool_information values(?,?,?,?,?,?,?)";
			PreparedStatement ps = conn.prepareStatement(sql);
			
			ps.setString(1, user.getID());
			ps.setString(2, user.getTime());
			ps.setString(3, user.getMoveTime());
			ps.setString(4, user.getRestTime());
			ps.setString(5, user.getDisplacement());
			ps.setString(6, user.getsTime());
			ps.setString(7, user.getMachineID());
			
			int x  = ps.executeUpdate();
			ps.close();
			conn.close();
			if(x > 0)
				update_MachineCondition(user);
				return true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
	
	public boolean update_MachineCondition(ActiveMachine user){
		try {
			Connection conn = DBUtils.getConnection();
			String sql = "update machine_condition set time=?,moveTime=?,restTime=?,displacement=?,sTime=?,conditon=? where machineID=?";
			PreparedStatement ps = conn.prepareStatement(sql);
			
			String temp;
			if(Integer.parseInt(user.getDisplacement()) >= 3)
				temp = "on";
			else temp = "down";
		
			ps.setString(1, user.getTime());
			ps.setString(2, user.getMoveTime());
			ps.setString(3, user.getRestTime());
			ps.setString(4, user.getDisplacement());
			ps.setString(5, user.getsTime());
			ps.setString(6, temp);
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

	public boolean delete(String ID){
		try {
			Connection conn = DBUtils.getConnection();
			String sql = "delete from active_machine_tool_information where ID=?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, ID);
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
	
	
	
	public boolean update(ActiveMachine user){
		try {
			Connection conn = DBUtils.getConnection();
			String sql = "update active_machine_tool_information set time=?,moveTime=?,restTime=?,displacement=?,sTime=?,machine=? where ID=?";
			PreparedStatement ps = conn.prepareStatement(sql);
		
			ps.setString(1, user.getTime());
			ps.setString(2, user.getMoveTime());
			ps.setString(3, user.getRestTime());
			ps.setString(4, user.getDisplacement());
			ps.setString(5, user.getsTime());
			ps.setString(6, user.getMachineID());
			ps.setString(7, user.getID());
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
	
	public ActiveMachine queryById(String ID){
		ActiveMachine u = new ActiveMachine();
		try {
			Connection conn = DBUtils.getConnection();
			String sql = "select * from active_machine_tool_information where ID=?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, ID);
			ResultSet rs = ps.executeQuery();
			if(rs.next()){
				u.setID(rs.getString("ID"));
				u.setTime(rs.getString("time"));
				u.setMoveTime(rs.getString("moveTime"));
				u.setRestTime(rs.getString("restTime"));
				u.setDisplacement(rs.getString("displacement"));
				u.setsTime(rs.getString("sTime"));
				u.setMachineID(rs.getString("machine"));
			}
			rs.close();
			ps.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return u;
	}
	
	public ArrayList<ActiveMachine> query(ActiveMachine u){
		String ID = u.getID();
		String time = u.getTime();
		String moveTime = u.getMoveTime();
		String restTime = u.getRestTime();
		String displacement = u.getDisplacement();
		String sTime = u.getsTime();
		String machineID = u.getMachineID();
		
		ArrayList<ActiveMachine> users = new ArrayList<ActiveMachine>();
		ArrayList<String> params = new ArrayList<String>();
		try {
			Connection conn = DBUtils.getConnection();
			StringBuffer sql =new StringBuffer("select ID,time,moveTime,restTime,displacement,sTime,machine from machine_tool_information where 1=1");
			if(ID != null && !"".equals(ID) ){
				sql.append(" and ID=?");
				params.add(ID);
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
			if(machineID != null && !"".equals(machineID) ){
				sql.append(" and machine=?");
				params.add(machineID);
			}

			PreparedStatement ps = conn.prepareStatement(sql.toString());
			for(int i=0; i< params.size(); i++){
				ps.setString(i+1,params.get(i));
			}
			
			ResultSet rs = ps.executeQuery();
			while(rs.next()){
				ActiveMachine u1 = new ActiveMachine();
				u1.setID(rs.getString("ID"));
				u1.setTime(rs.getString("time"));
				u1.setMoveTime(rs.getString("moveTime"));
				u1.setRestTime(rs.getString("restTime"));
				u1.setDisplacement(rs.getString("displacement"));
				u1.setsTime(rs.getString("sTime"));
				u1.setMachineID(rs.getString("machine"));
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
	
	public ArrayList<ActiveMachine> find(){
		try {
			Connection conn = DBUtils.getConnection();
			Statement stmt = conn.createStatement();
			String sql = "select * from active_machine_tool_information";
			ResultSet rs = stmt.executeQuery(sql);
			ArrayList<ActiveMachine> users = new ArrayList<ActiveMachine>();
			while(rs.next()){
				ActiveMachine user = new ActiveMachine();
				user.setID(rs.getString("ID"));
				user.setTime(rs.getString("time"));
				user.setMoveTime(rs.getString("moveTime"));
				user.setRestTime(rs.getString("restTime"));
				user.setDisplacement(rs.getString("displacement"));
				user.setsTime(rs.getString("sTime"));
				user.setMachineID(rs.getString("machine"));
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
