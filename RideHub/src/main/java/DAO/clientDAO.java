package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Connection.DBConnection;
import Model.client;
import Model.vendor;

public class clientDAO {

	public static boolean checkEmail(String email) {
		boolean flag = false;
		try {
			Connection conn = DBConnection.DriverConnection();
			String sql = "select * from client where email=?";
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

	public static void insertClient(client c) {
		try {
			Connection conn = DBConnection.DriverConnection();
			String sql = "insert into client(cname,email,password,city,contact) values(?,?,?,?,?)";
			PreparedStatement pst = conn.prepareStatement(sql);

			pst.setString(1, c.getCname());
			pst.setString(2, c.getEmail());
			pst.setString(3, c.getPassword());
			pst.setString(4, c.getCity());
			pst.setLong(5, c.getContact());
			pst.executeUpdate();
			System.out.println("data inserted");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static client clientLogin(client c) {
		client c1 = null;
		try {
			Connection conn = DBConnection.DriverConnection();
			String sql = "select * from client where email=? and password=?";

			PreparedStatement pst = conn.prepareStatement(sql);

			pst.setString(1, c.getEmail());
			pst.setString(2, c.getPassword());

			ResultSet rs = pst.executeQuery();
			if (rs.next()) {
				c1 = new client();
				c1.setCid(rs.getInt("cid"));
				c1.setCname(rs.getString("cname"));
				c1.setEmail(rs.getString("email"));
				c1.setPassword(rs.getString("password"));
				c1.setContact(Long.parseLong(rs.getString("contact")));
				c1.setCity(rs.getString("city"));
				// v1.setUpload_image(rs.getString("image"));

			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return c1;
	}

	public static void updateclient(client c) {
		try {

			Connection conn = DBConnection.DriverConnection();
			String sql = "update client set cname=?,contact=?,city=? where cid =?";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, c.getCname());
			pst.setLong(2, c.getContact());
			pst.setString(3, c.getCity());
			pst.setInt(4, c.getCid());
			pst.executeUpdate();
			System.out.println("update your profile");
		} catch (Exception e) {

			e.printStackTrace();
		}
	}

	public static boolean checkOP(int id, String op) {
		boolean flag = false;
		try {
			Connection conn = DBConnection.DriverConnection();
			String sql = "select * from client where cid=? and password=?";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setInt(1, id);
			pst.setString(2, op);
			ResultSet rs = pst.executeQuery();
			if (rs.next()) {
				flag = true;
			}
			System.out.println("data updated");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return flag;
	}

	public static void updatePassword(int id, String np) {
		try {
			Connection conn = DBConnection.DriverConnection();
			String sql = "update client set password=? where cid=?";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, np);
			pst.setInt(2, id);
			pst.executeUpdate();
			System.out.println("pass updated");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void newPassword(String email, String np) {
		try {
			Connection conn = DBConnection.DriverConnection();
			String sql = "update client set password=? where email=?";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, np);
			pst.setString(2, email);
			pst.executeUpdate();
			System.out.println("pass updated");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
