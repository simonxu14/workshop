package com.message;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import com.db.DBUtils;
public class MachineDao {

	
	public ArrayList<Machine> find(){
		try {
			Connection conn = DBUtils.getConnection();
			Statement stmt = conn.createStatement();
			String sql = "select * from machine_tool_information";
			ResultSet rs = stmt.executeQuery(sql);
			ArrayList<Machine> users = new ArrayList<Machine>();
			while(rs.next()){
				Machine user = new Machine();
				user.setID(rs.getString("ID"));
				user.setType(rs.getString("type"));
				user.setmNumber(rs.getString("mNumber"));
				user.setsNumber(rs.getString("sNumber"));
				user.setWorkshop(rs.getString("workshop"));
				user.setManufacturer(rs.getString("manufacture"));
				user.setpDate(rs.getString("pDate"));
				user.setWorkerID(rs.getString("workerID"));
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
