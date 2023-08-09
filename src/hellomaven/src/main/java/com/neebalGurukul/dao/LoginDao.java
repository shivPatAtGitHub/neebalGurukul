package com.neebalGurukul.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.neebalGurukul.model.Login;
import com.neebalGurukul.dao.UserNotFoundException;

public class LoginDao {

	Connection conn = null;
	Statement stmt = null;
	ResultSet rs = null;
	DataSource ds = new DataSource();

	public List<Login> getLoginDetails() throws SQLException {
		String query = "select username, password from login";
		conn = ds.getConnection();
		List<Login> LoginList = new ArrayList<Login>();
		try {
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			if (rs != null) {
				while (rs.next()) {
					Login loginObj = new Login();
					loginObj.setuName(rs.getString("username"));
					loginObj.setPswd(rs.getString("password"));
// 					System.out.println(loginObj.getuName() + ", " + loginObj.getPswd());
					LoginList.add(loginObj);
				}
			}
		} catch (SQLException e) {
			System.out.println("SQLException in LoginDAO:" + e.getMessage());
		}
		return LoginList;
	}

	public Login getLoginPassword(String username) throws Exception {
		String query1 = "select username, password from login where username = ?";
		conn = ds.getConnection();

		Login obj = null;
		try {
			PreparedStatement pstmt = conn.prepareStatement(query1);
			pstmt.setString(1, username);
			ResultSet rs = pstmt.executeQuery();
			if (rs != null) {
				obj = new Login();
				while (rs.next()) {
					obj.setuName(rs.getString("username"));
					obj.setPswd(rs.getString("password"));
				}
			}

		} catch (SQLException e) {
			throw new UserNotFoundException();
		} finally {
			conn.close();
		}
		return obj;
	}

	public boolean insertUser(String username, String password, boolean active) throws SQLException {
		String insert = "insert into login(username, password, lastModifiedDate, active) values (?, ?, ?, ?)";
		conn = ds.getConnection();

//		java.util.Date utilDate = new Date();
//		java.sql.Date date = new java.sql.Date(utilDate.getTime());

		try {
			PreparedStatement pstmt = conn.prepareStatement(insert);
			pstmt.setString(1, username);
			pstmt.setString(2, password);
//			pstmt.setDate(3, date);
			pstmt.setDate(3, java.sql.Date.valueOf("2023-08-08"));
			pstmt.setInt(4, 1);
			if (pstmt.executeUpdate() <= 0) {
				return false;
			}
		} catch (SQLException e) {
			System.out.println("SQLException: " + e.getMessage());
			return false;
		} finally {
			conn.close();
		}
		return true;

	}

//	public void deleteUser(int id) throws SQLException {
//		String delete = "delete from login where id = ?";
//		conn = ds.getConnection();
//
//		try {
//			PreparedStatement pstmt = conn.prepareStatement(delete);
//
//		} catch (SQLException e) {
//
//			e.printStackTrace();
//		}
//
//	}

	public boolean deleteRecordSoft(String username) throws Exception {

		String query = "update login set active = false where username = ?";
		conn = ds.getConnection();

		try {

			// check if username exists
			LoginDao dao = new LoginDao();
			Login check = dao.getLoginPassword(username);

			PreparedStatement pstmt = conn.prepareStatement(query);

			pstmt.setString(1, username);
			pstmt.executeUpdate();

		} catch (UserNotFoundException e) {

			throw new UserNotFoundException();
		}

		catch (SQLException e) {
			e.printStackTrace();
			throw new SQLException(e);
		} finally {
			conn.close();
		}
		return true;

	}

	public boolean deleteRecordHard(String username) throws Exception {

		String query = "delete from login where username = ?";
		conn = ds.getConnection();

		try {
			// check if username exists
			LoginDao dao = new LoginDao();
			Login check = dao.getLoginPassword(username);

			PreparedStatement pstmt = conn.prepareStatement(query);

			pstmt.setString(1, username);
			pstmt.executeUpdate();
		} catch (UserNotFoundException e) {
			throw new UserNotFoundException();
		} catch (SQLException e) {
			e.printStackTrace();
			throw new SQLException(e);
		} finally {
			conn.close();
		}
		return true;

	}

//	
//	public  boolean updateRecords(String username) throws Exception{
//		
//		String query = "update login set active = false where username = ?";
//		conn=ds.getConnection();
//		
//		try {
//			
//			//check if username exists
//			LoginDao dao = new LoginDao();
//			Login check = dao.getLoginPassword(username);
//			
//			PreparedStatement pstmt = conn.prepareStatement(query);
//
//			pstmt.setString(1, username);
//			if(pstmt.executeUpdate()<=0) {
//				throw new Exception("Username does not exist");
//			}
//			}
//		catch (SQLException e) {
//			System.out.println("SQLException: "+e.getMessage());
//			e.printStackTrace();
//		}
//		finally {
//			conn.close();
//		}
//		return true;
//	
//	}

}
