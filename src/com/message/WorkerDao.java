package com.message;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import com.db.DBUtils;

public class WorkerDao {
	public ArrayList<Worker> find(){
		try {
			Connection conn = DBUtils.getConnection();
			Statement stmt = conn.createStatement();
			String sql = "select * from worker";
			ResultSet rs = stmt.executeQuery(sql);
			ArrayList<Worker> users = new ArrayList<Worker>();
			while(rs.next()){
				Worker user = new Worker();
				user.setID(rs.getString("ID"));
				user.setName(rs.getString("name"));
				user.setAuthority(rs.getString("Authority"));
				user.setIDCard(rs.getString("IDCard"));
				user.setProfession(rs.getString("profession"));
				user.setpNumber(rs.getString("pNumber"));
				user.setSex(rs.getString("sex"));
				user.setAge(rs.getString("age"));
				user.setAddress(rs.getString("address"));
				user.setEmail(rs.getString("email"));
				
				String profession = rs.getString("profession");
				System.out.println(profession);
				try {
					Connection conn1 = DBUtils.getConnection();
					String sql1 = "select name from profession where ID=?";
					PreparedStatement ps1 = conn1.prepareStatement(sql1);
					ps1.setString(1, profession);
					ResultSet rs1 = ps1.executeQuery();
					if(rs1.next()){
						user.setProfession(rs1.getString("name"));
					}
					rs1.close();
					ps1.close();
					conn1.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
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
