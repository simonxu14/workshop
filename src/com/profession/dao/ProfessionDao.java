package com.profession.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import com.db.DBUtils;
public class ProfessionDao {
	public boolean insert(Profession user){
		try {
			Connection conn = DBUtils.getConnection();
			String sql = "insert into profession values(?,?)";
			PreparedStatement ps = conn.prepareStatement(sql);
			
			ps.setString(1, user.getID());
			ps.setString(2, user.getName());

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
			String sql = "delete from profession where ID=?";
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
	
	
	
	public boolean update(Profession user){
		try {
			Connection conn = DBUtils.getConnection();
			String sql = "update profession set name=? where ID=?";
			PreparedStatement ps = conn.prepareStatement(sql);
		
			ps.setString(1, user.getName());
			ps.setString(2, user.getID());
			
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
	
	public Profession queryById(String ID){
		Profession u = new Profession();
		try {
			Connection conn = DBUtils.getConnection();
			String sql = "select * from profession where ID=?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, ID);
			ResultSet rs = ps.executeQuery();
			if(rs.next()){
				u.setID(rs.getString("ID"));
				u.setName(rs.getString("name"));
			}
			rs.close();
			ps.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return u;
	}
	
	public ArrayList<Profession> query(Profession u){
		String ID = u.getID();
		String name = u.getName();
		
		ArrayList<Profession> users = new ArrayList<Profession>();
		ArrayList<String> params = new ArrayList<String>();
		try {
			Connection conn = DBUtils.getConnection();
			StringBuffer sql =new StringBuffer("select ID,name from profession where 1=1");
			if(ID != null && !"".equals(ID) ){
				sql.append(" and ID=?");
				params.add(ID);
			}
			if(name != null && !"".equals(name) ){
				sql.append(" and name=?");
				params.add(name);
			}

			PreparedStatement ps = conn.prepareStatement(sql.toString());
			for(int i=0; i< params.size(); i++){
				ps.setString(i+1,params.get(i));
			}
			
			ResultSet rs = ps.executeQuery();
			while(rs.next()){
				Profession u1 = new Profession();
				u1.setID(rs.getString("ID"));
				u1.setName(rs.getString("name"));

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
	
	public ArrayList<Profession> find(){
		try {
			Connection conn = DBUtils.getConnection();
			Statement stmt = conn.createStatement();
			String sql = "select * from profession";
			ResultSet rs = stmt.executeQuery(sql);
			ArrayList<Profession> users = new ArrayList<Profession>();
			while(rs.next()){
				Profession user = new Profession();
				user.setID(rs.getString("ID"));
				user.setName(rs.getString("name"));
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
