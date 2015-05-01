package com.workshop.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import com.db.DBUtils;
public class WorkshopDao {
	public boolean insert(Workshop user){
		try {
			Connection conn = DBUtils.getConnection();
			String sql = "insert into workshop values(?,?,?,?,?)";
			PreparedStatement ps = conn.prepareStatement(sql);
			
			ps.setString(1, user.getID());
			ps.setString(2, user.getType());
			ps.setString(3, user.getbTime());
			ps.setString(4, user.getManufacturer());
			ps.setString(5, user.getPrincipal());
			
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
			String sql = "delete from workshop where ID=?";
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
	
	
	
	public boolean update(Workshop user){
		try {
			Connection conn = DBUtils.getConnection();
			String sql = "update workshop set type=?,bTime=?,manufacturer=?,principal=? where ID=?";
			PreparedStatement ps = conn.prepareStatement(sql);
		
			ps.setString(1, user.getType());
			ps.setString(2, user.getbTime());
			ps.setString(3, user.getManufacturer());
			ps.setString(4, user.getPrincipal());
			ps.setString(5, user.getID());
			
			
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
	
	public Workshop queryById(String ID){
		Workshop u = new Workshop();
		try {
			Connection conn = DBUtils.getConnection();
			String sql = "select * from workshop where ID=?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, ID);
			ResultSet rs = ps.executeQuery();
			if(rs.next()){
				u.setID(rs.getString("ID"));
				u.setType(rs.getString("type"));
				u.setbTime(rs.getString("bTime"));
				u.setManufacturer(rs.getString("manufacture"));
				u.setPrincipal(rs.getString("principal"));
			}
			rs.close();
			ps.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return u;
	}
	
	public ArrayList<Workshop> query(Workshop u){
		String ID = u.getID();
		String type = u.getType();
		String bTime = u.getbTime();
		String manufacturer = u.getManufacturer();
		String principal = u.getPrincipal();
		
		ArrayList<Workshop> users = new ArrayList<Workshop>();
		ArrayList<String> params = new ArrayList<String>();
		try {
			Connection conn = DBUtils.getConnection();
			StringBuffer sql =new StringBuffer("select ID,type,bTime,manufacturer,principal from workshop where 1=1");
			if(ID != null && !"".equals(ID) ){
				sql.append(" and ID=?");
				params.add(ID);
			}
			if(type != null && !"".equals(type) ){
				sql.append(" and type=?");
				params.add(type);
			}
			if(bTime != null && !"".equals(bTime) ){
				sql.append(" and bTime=?");
				params.add(bTime);
			}
			if(manufacturer != null && !"".equals(manufacturer) ){
				sql.append(" and manufacture=?");
				params.add(manufacturer);
			}
			if(principal != null && !"".equals(principal) ){
				sql.append(" and principal=?");
				params.add(principal);
			}

			PreparedStatement ps = conn.prepareStatement(sql.toString());
			for(int i=0; i< params.size(); i++){
				ps.setString(i+1,params.get(i));
			}
			
			ResultSet rs = ps.executeQuery();
			while(rs.next()){
				Workshop u1 = new Workshop();
				u1.setID(rs.getString("ID"));
				u1.setType(rs.getString("type"));
				u1.setbTime(rs.getString("bTime"));
				u1.setManufacturer(rs.getString("manufacture"));
				u1.setPrincipal(rs.getString("principal"));
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
	
	public ArrayList<Workshop> find(){
		try {
			Connection conn = DBUtils.getConnection();
			Statement stmt = conn.createStatement();
			String sql = "select * from workshop";
			ResultSet rs = stmt.executeQuery(sql);
			ArrayList<Workshop> users = new ArrayList<Workshop>();
			while(rs.next()){
				Workshop user = new Workshop();
				user.setID(rs.getString("ID"));
				user.setType(rs.getString("type"));
				user.setbTime(rs.getString("bTime"));
				user.setManufacturer(rs.getString("manufacture"));
				user.setPrincipal(rs.getString("principal"));
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
