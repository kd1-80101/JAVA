package com.sunbeam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbUtil {
	public static final String DB_DRIVER = "com.mysql.cj.jdbc.Driver";
	public static final String DB_URL = "jdbc:mysql://localhost:3306/sunbeam";
	public static final String DB_USER = "kd1-80101";
	public static final String DB_PASSWD = "123";
	static {
		try {
			Class.forName(DB_DRIVER);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.exit(1);
		}

	}

	public static Connection getConnection() throws SQLException {
		Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWD);
		return conn;
	}
}
