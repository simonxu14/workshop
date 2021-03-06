package com.message;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import com.db.DBUtils;
public class ActiveMachineDao {
	public ArrayList<ActiveMachine> find(){
		try {
			Connection conn = DBUtils.getConnection();
			Statement stmt = conn.createStatement();
			String sql = "select * from active_machine_tool_information";
			ResultSet rs = stmt.executeQuery(sql);
			ArrayList<ActiveMachine> users = new ArrayList<ActiveMachine>();
			while(rs.next()){
				ActiveMachine user = new ActiveMachine();
				user.setID(rs.getString("ID"));
				user.setTime(rs.getString("time"));
				user.setMoveTime(rs.getString("moveTime"));
				user.setRestTime(rs.getString("restTime"));
				user.setDisplacement(rs.getString("displacement"));
				user.setsTime(rs.getString("sTime"));
				user.setMachineID(rs.getString("machine"));
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
