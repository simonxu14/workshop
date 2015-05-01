package com.dynamic_workshop.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import com.db.DBUtils;

public class DynamicWorkshopDao {
	public boolean insert(DynamicWorkshop user){
		try {
			Connection conn = DBUtils.getConnection();
			String sql = "insert into dynamic_workshop_information values(?,?,?,?,?)";
			PreparedStatement ps = conn.prepareStatement(sql);
			
			ps.setString(1, user.getID());
			ps.setString(2, user.getWorkshopID());
			ps.setString(3, user.getTemperature());
			ps.setString(4, user.getHumidity());
			ps.setString(5, user.getNoise());
			
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
			String sql = "delete from dynamic_workshop_information where ID=?";
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
	
	
	
	public boolean update(DynamicWorkshop user){
		try {
			Connection conn = DBUtils.getConnection();
			String sql = "update dynamic_workshop_information set workshopID=?,temperature=?,humidity=?,noise=? where ID=?";
			PreparedStatement ps = conn.prepareStatement(sql);
		
			ps.setString(1, user.getWorkshopID());
			ps.setString(2, user.getTemperature());
			ps.setString(3, user.getHumidity());
			ps.setString(4, user.getNoise());
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
	
	public DynamicWorkshop queryById(String ID){
		DynamicWorkshop u = new DynamicWorkshop();
		try {
			Connection conn = DBUtils.getConnection();
			String sql = "select * from dynamic_workshop_information where ID=?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, ID);
			ResultSet rs = ps.executeQuery();
			if(rs.next()){
				u.setID(rs.getString("ID"));
				u.setWorkshopID(rs.getString("workshopID"));
				u.setTemperature(rs.getString("temperature"));
				u.setHumidity(rs.getString("humidity"));
				u.setNoise(rs.getString("noise"));
			}
			rs.close();
			ps.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return u;
	}
	
	public ArrayList<DynamicWorkshop> query(DynamicWorkshop u){
		String ID = u.getID();
		String workshopID = u.getWorkshopID();
		String temperature = u.getTemperature();
		String humidity = u.getHumidity();
		String noise = u.getNoise();
		
		ArrayList<DynamicWorkshop> users = new ArrayList<DynamicWorkshop>();
		ArrayList<String> params = new ArrayList<String>();
		try {
			Connection conn = DBUtils.getConnection();
			StringBuffer sql =new StringBuffer("select ID,workshopID,temperature,humidity,noise from dynamic_workshop_information where 1=1");
			if(ID != null && !"".equals(ID) ){
				sql.append(" and ID=?");
				params.add(ID);
			}
			if(workshopID != null && !"".equals(workshopID) ){
				sql.append(" and workshopID=?");
				params.add(workshopID);
			}
			if(temperature != null && !"".equals(temperature) ){
				sql.append(" and temperature=?");
				params.add(temperature);
			}
			if(humidity != null && !"".equals(humidity) ){
				sql.append(" and humidity=?");
				params.add(humidity);
			}
			if(noise != null && !"".equals(noise) ){
				sql.append(" and noise=?");
				params.add(noise);
			}

			PreparedStatement ps = conn.prepareStatement(sql.toString());
			for(int i=0; i< params.size(); i++){
				ps.setString(i+1,params.get(i));
			}
			
			ResultSet rs = ps.executeQuery();
			while(rs.next()){
				DynamicWorkshop u1 = new DynamicWorkshop();
				u1.setID(rs.getString("ID"));
				u1.setWorkshopID(rs.getString("workshopID"));
				u1.setTemperature(rs.getString("temperature"));
				u1.setHumidity(rs.getString("humidity"));
				u1.setNoise(rs.getString("noice"));
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
	
	public ArrayList<DynamicWorkshop> find(){
		try {
			Connection conn = DBUtils.getConnection();
			Statement stmt = conn.createStatement();
			String sql = "select * from dynamic_workshop_information";
			ResultSet rs = stmt.executeQuery(sql);
			ArrayList<DynamicWorkshop> users = new ArrayList<DynamicWorkshop>();
			while(rs.next()){
				DynamicWorkshop user = new DynamicWorkshop();
				user.setID(rs.getString("ID"));
				user.setWorkshopID(rs.getString("workshopID"));
				user.setTemperature(rs.getString("temperature"));
				user.setHumidity(rs.getString("humidity"));
				user.setNoise(rs.getString("noise"));
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
