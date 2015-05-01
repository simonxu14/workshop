package com.machine.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import com.db.DBUtils;
public class MachineDao {
	public boolean insert(Machine user){
		try {
			Connection conn = DBUtils.getConnection();
			String sql = "insert into machine_tool_information values(?,?,?,?,?,?,?,?)";
			PreparedStatement ps = conn.prepareStatement(sql);
			
			ps.setString(1, user.getID());
			ps.setString(2, user.getType());
			ps.setString(3, user.getmNumber());
			ps.setString(4, user.getsNumber());
			ps.setString(5, user.getWorkshop());
			ps.setString(6, user.getManufacturer());
			ps.setString(7, user.getpDate());
			ps.setString(8, user.getWorkerID());
			
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
			String sql = "delete from machine_tool_information where ID=?";
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
	
	
	
	public boolean update(Machine user){
		try {
			Connection conn = DBUtils.getConnection();
			String sql = "update machine_tool_information set type=?,mNumber=?,sNumber=?,workshop=?,manufacture=?,pDate=?,workerID=? where ID=?";
			PreparedStatement ps = conn.prepareStatement(sql);
		
			ps.setString(1, user.getType());
			ps.setString(2, user.getmNumber());
			ps.setString(3, user.getsNumber());
			ps.setString(4, user.getWorkshop());
			ps.setString(5, user.getManufacturer());
			ps.setString(6, user.getpDate());
			ps.setString(7, user.getID());
			ps.setString(8, user.getWorkerID());
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
	
	public Machine queryById(String ID){
		Machine u = new Machine();
		try {
			Connection conn = DBUtils.getConnection();
			String sql = "select * from machine_tool_information where ID=?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, ID);
			ResultSet rs = ps.executeQuery();
			if(rs.next()){
				u.setID(rs.getString("ID"));
				u.setType(rs.getString("type"));
				u.setmNumber(rs.getString("mNumber"));
				u.setsNumber(rs.getString("sNumber"));
				u.setWorkshop(rs.getString("workshop"));
				u.setManufacturer(rs.getString("manufacture"));
				u.setpDate(rs.getString("pDate"));
				u.setWorkerID(rs.getString("workerID"));
			}
			rs.close();
			ps.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return u;
	}
	
	public ArrayList<Machine> query(Machine u){
		String ID = u.getID();
		String type = u.getType();
		String mNumber = u.getmNumber();
		String sNumber = u.getsNumber();
		String workshop = u.getWorkshop();
		String manufacturer = u.getManufacturer();
		String pDate = u.getpDate();
		String workerID = u.getWorkerID();
		
		ArrayList<Machine> users = new ArrayList<Machine>();
		ArrayList<String> params = new ArrayList<String>();
		try {
			Connection conn = DBUtils.getConnection();
			StringBuffer sql =new StringBuffer("select ID,type,mNumber,sNumber,workshop,manufacture,pDate,workerID from machine_tool_information where 1=1");
			if(ID != null && !"".equals(ID) ){
				sql.append(" and ID=?");
				params.add(ID);
			}
			if(type != null && !"".equals(type) ){
				sql.append(" and type=?");
				params.add(type);
			}
			if(mNumber != null && !"".equals(mNumber) ){
				sql.append(" and mNumber=?");
				params.add(mNumber);
			}
			if(sNumber != null && !"".equals(sNumber) ){
				sql.append(" and sNumber=?");
				params.add(sNumber);
			}
			if(workshop != null && !"".equals(workshop) ){
				sql.append(" and workshop=?");
				params.add(workshop);
			}
			if(manufacturer != null && !"".equals(manufacturer) ){
				sql.append(" and manufacture=?");
				params.add(manufacturer);
			}
			if(pDate != null && !"".equals(pDate) ){
				sql.append(" and pDate=?");
				params.add(pDate);
			}
			if(workerID != null && !"".equals(workerID) ){
				sql.append(" and workerID=?");
				params.add(workerID);
			}

			PreparedStatement ps = conn.prepareStatement(sql.toString());
			for(int i=0; i< params.size(); i++){
				ps.setString(i+1,params.get(i));
			}
			
			ResultSet rs = ps.executeQuery();
			while(rs.next()){
				Machine u1 = new Machine();
				u1.setID(rs.getString("ID"));
				u1.setType(rs.getString("type"));
				u1.setmNumber(rs.getString("mNumber"));
				u1.setsNumber(rs.getString("sNumber"));
				u1.setWorkshop(rs.getString("workshop"));
				u1.setManufacturer(rs.getString("manufacture"));
				u1.setpDate(rs.getString("pDate"));
				u1.setWorkerID(rs.getString("WorkerID"));
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
	
	public ArrayList<Machine> find(){
		try {
			Connection conn = DBUtils.getConnection();
			Statement stmt = conn.createStatement();
			String sql = "select * from machine_tool_information";
			ResultSet rs = stmt.executeQuery(sql);
			ArrayList<Machine> users = new ArrayList<Machine>();
			while(rs.next()){
				Machine user = new Machine();
				user.setID(rs.getString("ID"));
				user.setType(rs.getString("type"));
				user.setmNumber(rs.getString("mNumber"));
				user.setsNumber(rs.getString("sNumber"));
				user.setWorkshop(rs.getString("workshop"));
				user.setManufacturer(rs.getString("manufacture"));
				user.setpDate(rs.getString("pDate"));
				user.setWorkerID(rs.getString("workerID"));
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
