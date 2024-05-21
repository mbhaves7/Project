package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import Connection.DBConnection;
import Model.User;

public class UserDAO {

	public static void insertUser(User u) {

		try {

			Connection con = DBConnection.drivercConnection();

			String sql = "insert into User(first_name,last_name,email,password)values(?,?,?,?)";
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, u.getFname());
			pst.setString(2, u.getLname());
			pst.setString(3, u.getEmail());
			pst.setString(4, u.getPassword());

			pst.executeUpdate();
			System.out.println("user data added");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static boolean checkEmail(String email) {

		boolean flag = false;
		try {
			Connection conn = DBConnection.drivercConnection();
			String sql = "select * from user where email=?";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, email);
			ResultSet rs = pst.executeQuery();
			if (rs.next()) {
				flag = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return flag;
	}

	public static User LoginCheck(User u) {

		User u1 = null;
		try {

			Connection conn = DBConnection.drivercConnection();

			String sql = "select * from user where email=? and password =?";

			PreparedStatement pst = conn.prepareStatement(sql);

			pst.setString(1, u.getEmail());
			pst.setString(2, u.getPassword());

			ResultSet rs = pst.executeQuery();

			if (rs.next()) {
				u1 = new User();
				u1.setId(rs.getInt("id"));
				u1.setFname(rs.getString("fname"));
				u1.setLname(rs.getString("lname"));
				u1.setEmail(rs.getString("email"));
				u1.setPassword(rs.getString("password"));

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;

	}

}