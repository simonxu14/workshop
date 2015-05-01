package com.data;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.db.DBUtils;

public class ActiveMachineDataFactory {
	
	public static void dataFactory(){
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		String sql = "SELECT COUNT(*) AS total FROM active_machine_tool_information";
		
		try{
			conn = DBUtils.getConnection();
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			rs.next();
			System.out.println(rs.getInt("total"));
		} catch(SQLException se){
			se.printStackTrace();
		}
	}
	
	public static void addData(){
		
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		String sql1 = "DELETE FROM active_machine_tool_information";
		String sql2 = "INSERT INTO active_machine_tool_information VALUES(?,?,?,?,?,?,?)";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date = new Date();
		int month = date.getMonth() + 1;
		
		try{
			int movetime = 0;
			int restTime = 0;
			conn = DBUtils.getConnection();
			ps = conn.prepareStatement(sql1);
			ps.executeUpdate();
			
			Date date1 = sdf.parse("2013-01-01 00:00:00");
			ps = conn.prepareStatement(sql2);
			
			date1.setMonth(month);
			if(month == 1 || month == 3 || month == 5 || month == 7 
					|| month == 8 || month == 10 || month == 12){
				int index = 1;
				for(int d = 1;d <= 31;d++){
					date1.setDate(d);
					for(int h = 0;h < 24;h++){
						date1.setHours(h);
						for(int m = 0;m < 60;m++){
							System.out.println(index);
							date1.setMinutes(m);
							movetime = (int)(1 + Math.random() * 59);
							restTime = 60 - movetime;
							ps.setString(1, String.valueOf(index));
							ps.setString(2,sdf.format(date1));
							ps.setInt(3, movetime);
							ps.setInt(4, restTime);
							ps.setInt(5, (int)(1 + Math.random() * 9));
							ps.setInt(6, (int)(1 + Math.random() * 19));
							ps.setString(7, "1");
							ps.executeUpdate();
							index++;
							
						}
					}
				}
			} else{
				int index = 1;
				for(int d = 1;d <= 30;d++){
					date1.setDate(d);
					for(int h = 0;h < 24;h++){
						date1.setHours(h);
						for(int m = 0;m < 60;m++){
							date1.setMinutes(h);
							for(int s = 0;s < 60;s++){
								date1.setSeconds(s);
								movetime = (int)(1 + Math.random() * 59);
								restTime = 60 - movetime;
								ps.setString(1, String.valueOf(index));
								ps.setString(2,sdf.format(date1));
								ps.setInt(3, movetime);
								ps.setInt(4, restTime);
								ps.setInt(5, (int)(1 + Math.random() * 9));
								ps.setInt(6, (int)(1 + Math.random() * 19));
								ps.setString(7, "1");
								ps.executeUpdate();
								index++;
							}
						}
					}
				}
			}
		} catch(Exception se){
			se.printStackTrace();
		}
		
	}
}
