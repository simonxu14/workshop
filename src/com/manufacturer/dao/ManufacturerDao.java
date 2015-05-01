package com.manufacturer.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import com.db.DBUtils;

public class ManufacturerDao {
	public boolean insert(Manufacturer user){
		try {
			Connection conn = DBUtils.getConnection();
			String sql = "insert into manufacture values(?,?,?,?,?)";
			PreparedStatement ps = conn.prepareStatement(sql);
			
			ps.setString(1, user.getID());
			ps.setString(2, user.getName());
			ps.setString(3, user.getPrincipal());
			ps.setString(4, user.getPhone());
			ps.setString(5, user.getAddress());
			
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
			String sql = "delete from manufacture where ID=?";
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
	
	
	
	public boolean update(Manufacturer user){
		try {
			Connection conn = DBUtils.getConnection();
			String sql = "update manufacture set name=?,pancipal=?,phone=?,address=? where ID=?";
			PreparedStatement ps = conn.prepareStatement(sql);
		
			ps.setString(1, user.getName());
			ps.setString(2, user.getPrincipal());
			ps.setString(3, user.getPhone());
			ps.setString(4, user.getAddress());
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
	
	public Manufacturer queryById(String ID){
		Manufacturer u = new Manufacturer();
		try {
			Connection conn = DBUtils.getConnection();
			String sql = "select * from manufacture where ID=?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, ID);
			ResultSet rs = ps.executeQuery();
			if(rs.next()){
				u.setID(rs.getString("ID"));
				u.setName(rs.getString("name"));
				u.setPrincipal(rs.getString("pancipal"));
				u.setPhone(rs.getString("phone"));
				u.setAddress(rs.getString("address"));
			}
			rs.close();
			ps.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return u;
	}
	
	public ArrayList<Manufacturer> query(Manufacturer u){
		String ID = u.getID();
		String name = u.getName();
		String principal = u.getPrincipal();
		String phone = u.getPhone();
		String address = u.getAddress();
		
		ArrayList<Manufacturer> users = new ArrayList<Manufacturer>();
		ArrayList<String> params = new ArrayList<String>();
		try {
			Connection conn = DBUtils.getConnection();
			StringBuffer sql =new StringBuffer("select ID,name,pancipal,phone,address from manufacture where 1=1");
			if(ID != null && !"".equals(ID) ){
				sql.append(" and ID=?");
				params.add(ID);
			}
			if(name != null && !"".equals(name) ){
				sql.append(" and name=?");
				params.add(name);
			}
			if(principal != null && !"".equals(principal) ){
				sql.append(" and pancipal=?");
				params.add(principal);
			}
			if(phone != null && !"".equals(phone) ){
				sql.append(" and phone=?");
				params.add(phone);
			}
			if(address != null && !"".equals(address) ){
				sql.append(" and address=?");
				params.add(address);
			}

			PreparedStatement ps = conn.prepareStatement(sql.toString());
			for(int i=0; i< params.size(); i++){
				ps.setString(i+1,params.get(i));
			}
			
			ResultSet rs = ps.executeQuery();
			while(rs.next()){
				Manufacturer u1 = new Manufacturer();
				u1.setID(rs.getString("ID"));
				u1.setName(rs.getString("name"));
				u1.setPrincipal(rs.getString("pancipal"));
				u1.setPhone(rs.getString("phone"));
				u1.setAddress(rs.getString("address"));
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
	
	public ArrayList<Manufacturer> find(){
		try {
			Connection conn = DBUtils.getConnection();
			Statement stmt = conn.createStatement();
			String sql = "select * from manufacture";
			ResultSet rs = stmt.executeQuery(sql);
			ArrayList<Manufacturer> users = new ArrayList<Manufacturer>();
			while(rs.next()){
				Manufacturer user = new Manufacturer();
				user.setID(rs.getString("ID"));
				user.setName(rs.getString("name"));
				user.setPrincipal(rs.getString("pancipal"));
				user.setPhone(rs.getString("phone"));
				user.setAddress(rs.getString("address"));
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
