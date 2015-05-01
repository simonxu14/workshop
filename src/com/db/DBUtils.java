package com.db;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtils {
	static{
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	public static Connection getConnection() throws SQLException{
		String url ="jdbc:mysql://localhost:3306/workshop";
		String username = "root";
		String password = "xuxinlong302718";
		Connection conn = DriverManager.getConnection(url,username,password);
		return conn;
	}
}
