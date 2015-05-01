package com.data;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.db.DBUtils;

public class DynamicWorkshopDataFactory {
	
	public static void addData(){
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		String sql = "SELECT COUNT(*) AS total FROM dynamic_workshop_information";
		String add_data_sql = "INSERT INTO dynamic_workshop_information VALUES (?,?,?,?,?)";
		try{
			conn = DBUtils.getConnection();
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			rs.next();
//			System.out.println(rs.getInt("total"));
			ps = conn.prepareStatement(add_data_sql);
			for(int i = rs.getInt("total");i < rs.getInt("total") + 100;i++){
				ps.setString(1, String.valueOf(i));
				ps.setString(2, "1");
				ps.setInt(3, (int)(1 + Math.random() * 49));
				ps.setInt(4, (int)(1 + Math.random() * 99));
				ps.setInt(5, (int)(1 + Math.random() * 149));
				ps.executeUpdate();
			}
		} catch(SQLException se){
			se.printStackTrace();
		}
		System.out.println("SCUESS");
	}
}
