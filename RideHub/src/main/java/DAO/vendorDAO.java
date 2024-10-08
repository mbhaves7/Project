package DAO;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Connection.DBConnection;
import Model.vendor;

public class vendorDAO {

	public static void vendorInsert(vendor v) {
		try {

			Connection con = DBConnection.DriverConnection();
			String sql = "insert into vendor (name,email,password,contact,upload_image,join_date)values(?,?,?,?,?,?)";

			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, v.getName());
			pst.setString(2, v.getEmail());
			pst.setString(3, v.getPassword());
			pst.setLong(4, v.getContact());
			pst.setString(5, v.getUpload_image());
			pst.setDate(6, Date.valueOf(v.getJoin_date()));
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
			String sql = "select * from vendor where email=?";
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

	public static vendor vendorLogin(vendor v) {
		vendor v1 = null;
		try {
			Connection conn = DBConnection.DriverConnection();
			String sql = "select * from vendor where email=? and password=?";

			PreparedStatement pst = conn.prepareStatement(sql);

			pst.setString(1, v.getEmail());
			pst.setString(2, v.getPassword());

			ResultSet rs = pst.executeQuery();
			if (rs.next()) {
				v1 = new vendor();
				v1.setVid(rs.getInt("vid"));
				v1.setName(rs.getString("name"));
				v1.setEmail(rs.getString("email"));
				v1.setPassword(rs.getString("password"));
				v1.setContact(Long.parseLong(rs.getString("contact")));
				//v1.setUpload_image(rs.getString("image"));

			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return v1;
	}

	public static void updateVendor(vendor v) {
		try {

			Connection conn = DBConnection.DriverConnection();
			String sql = "update vendor set name=?,email=?,contact=?,upload_image where vid =?";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, v.getName());
			pst.setString(2, v.getEmail());
			pst.setLong(3, v.getContact());
			pst.setString(4, v.getUpload_image());
			pst.setInt(5, v.getVid());
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
			String sql = "select * from vendor where vid=? and password=?";
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
			String sql = "update vendor set password=? where vid=?";
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
			String sql = "update vendor set password=? where email=?";
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
