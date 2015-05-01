package com.message;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import com.db.DBUtils;
public class DynamicWorkshopDao {
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
