package com.message;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import com.db.DBUtils;
public class WorkshopDao {

	
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
