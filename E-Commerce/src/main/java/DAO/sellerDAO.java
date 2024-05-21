package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Connection.DBConnection;
import Model.seller;

public class sellerDAO {

	public static void insertseller(seller s) {
		try {
			Connection conn = DBConnection.DriverConnection();

			String sql = "insert into seller (name,contact,address,city,email,password)values(?,?,?,?,?,?)";
			PreparedStatement pst = conn.prepareStatement(sql);
			//pst.setInt(1, s.getSid());
			pst.setString(1, s.getName());
			pst.setLong(2, s.getContact());
			pst.setString(3, s.getAddress());
			pst.setString(4, s.getCity());
			pst.setString(5, s.getEmail());
			pst.setString(6, s.getPassword());
			pst.executeUpdate();
			System.out.println("added data");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static boolean checkEmail(String email) {

		boolean flag = false;
		try {
			Connection conn = DBConnection.DriverConnection();
			String sql = "select * from seller where email=?";
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

	public static seller sellerLogin(seller s) {
		seller s1 = null;
		try {
			Connection conn = DBConnection.DriverConnection();
			String sql = "select * from seller where email=? and password=?";

			PreparedStatement pst = conn.prepareStatement(sql);

			pst.setString(1, s.getEmail());
			pst.setString(2, s.getPassword());

			ResultSet rs = pst.executeQuery();
			if (rs.next()) {
				s1 = new seller();
				s1.setSid(rs.getInt("sid"));
				s1.setName(rs.getString("name"));
				s1.setContact(Long.parseLong(rs.getString("contact")));
				s1.setAddress(rs.getString("address"));
				s1.setCity(rs.getString("city"));
				s1.setEmail(rs.getString("email"));
				s1.setPassword(rs.getString("password"));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return s1;
	}

	public static void updateSeller(seller s) {

		try {

			Connection conn = DBConnection.DriverConnection();
			String sql = "update seller set name=?,contact=?,city=?,address=?,email=? where sid =?";

			PreparedStatement pst = conn.prepareStatement(sql);

			pst.setString(1, s.getName());
			pst.setLong(2, s.getContact());
			pst.setString(3, s.getCity());
			pst.setString(4, s.getAddress());
			pst.setString(5, s.getEmail());
			pst.setInt(6, s.getSid());
			pst.executeUpdate();
			System.out.println("update your profile");
		} catch (Exception e) {

			e.printStackTrace();
		}
	}

	public static boolean checkPassword(int sid, String op) {

		boolean flag = false;

		try {

			Connection conn = DBConnection.DriverConnection();
			String sql = "select * from seller where sid =? and password=?";

			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setInt(1, sid);
			pst.setString(2, op);
			ResultSet rs = pst.executeQuery();
			if (rs.next()) {
				flag = true;
			}
			System.out.println("check password");
		} catch (Exception e) {

			e.printStackTrace();
		}
		return flag;
	}

	public static void updatePassword(int sid, String np) {

		try {

			Connection conn = DBConnection.DriverConnection();
			String sql = "update seller set password=? where sid=?";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, np);
			pst.setInt(2, sid);

			pst.executeUpdate();
			System.out.println("update your password");
		} catch (Exception e) {

			e.printStackTrace();
		}

	}

}
