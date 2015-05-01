package com.message;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import com.db.DBUtils;
public class ManufacturerDao {

	
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
