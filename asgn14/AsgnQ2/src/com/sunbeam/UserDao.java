package com.sunbeam;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserDao implements AutoCloseable {
	Connection con;

	public UserDao() throws SQLException {
		con = DbUtil.getConnection();
	}

	@Override
	public void close() throws SQLException {
		if (con != null)
			con.close();
	}

	// add user
	public int addUser(String fname, String lname, String email, String passwd, String date)
			throws SQLException, ParseException {
		String sql = "insert into users values(default,?,?,?,?,?,0,'voter');";
		try (PreparedStatement stmt = con.prepareStatement(sql)) {
			SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
			java.util.Date udate = sdf.parse(date);
			java.sql.Date sdate = new Date(udate.getTime());

			stmt.setString(1, fname);
			stmt.setString(2, lname);
			stmt.setString(3, email);
			stmt.setString(4, passwd);
			stmt.setDate(5, sdate);
			int cnt = stmt.executeUpdate();
			return cnt;
		}
	}

	// del user
	public int delUser(int id) throws SQLException {
		String sql = "delete from users where id = ?";
		try (PreparedStatement stmt = con.prepareStatement(sql)) {
			stmt.setInt(1, id);
			int cnt = stmt.executeUpdate();
			return cnt;
		}
	}

	// update user
	public int updateUser(int id, String fname, String lname, String email, String passwd, String date)
			throws SQLException, ParseException {
		String sql = "update users set first_name = ?,last_name= ?, email=?,password= ?,dob=? where id = ?";
		try (PreparedStatement stmt = con.prepareStatement(sql)) {
			SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
			java.util.Date udate = sdf.parse(date);
			java.sql.Date sdate = new java.sql.Date(udate.getTime());
			stmt.setString(1, fname);
			stmt.setString(2, lname);
			stmt.setString(3, email);
			stmt.setString(4, passwd);
			stmt.setDate(5, sdate);
			stmt.setInt(6, id);
			int cnt = stmt.executeUpdate();
			return cnt;

		}
	}

	// Display all
	public List<User> displayAllUsers() throws SQLException {
		List<User> list = new ArrayList<User>();
		String sql = "select * from users ";
		try (PreparedStatement stmt = con.prepareStatement(sql)) {
			try (ResultSet rs = stmt.executeQuery()) {
				while (rs.next()) {
					int id = rs.getInt("id");
					String fname = rs.getString("first_name");
					String lname = rs.getString("last_name");
					String email = rs.getString("email");
					java.sql.Date date = rs.getDate("dob");
					SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
					String sdate = sdf.format(date);
					boolean status = rs.getBoolean("status");
					String role = rs.getString("role");
					User u = new User(id, fname, lname, email, "", sdate, status, role);
					list.add(u);

				}
			}

			return list;
		}
	}

	// display custom
	public List<User> displayCustomUsers(int userid) throws SQLException {
		List<User> list = new ArrayList<User>();
		String sql = "select * from users where id= ?";
		try (PreparedStatement stmt = con.prepareStatement(sql)) {
			stmt.setInt(1, userid);
			try (ResultSet rs = stmt.executeQuery()) {
				while (rs.next()) {
					int id = rs.getInt("id");
					String fname = rs.getString("first_name");
					String lname = rs.getString("last_name");
					String email = rs.getString("email");
					java.sql.Date date = rs.getDate("dob");
					SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
					String sdate = sdf.format(date);
					boolean status = rs.getBoolean("status");
					String role = rs.getString("role");
					User u = new User(id, fname, lname, email, "", sdate, status, role);
					list.add(u);

				}
			}

			return list;
		}
	}

	// vote Status
	public int changeVoteStatus(int userid) throws SQLException {
		String sql = "update users set status =true where id=?";
		try (PreparedStatement stmt = con.prepareStatement(sql)) {
			stmt.setInt(1, userid);
			int cnt = stmt.executeUpdate();
			return cnt;
		}
	}

}
