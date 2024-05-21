package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import Connection.DBConnection;
import Model.Client;

public class ClientDAO {

	public static void insertClient(Client c) {
		try {
			Connection conn = DBConnection.DriverConnection();

			String sql = "insert into client (first_name,last_name,email,password,city,contact)values(?,?,?,?,?,?)";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setInt(1, c.getId());
			pst.setString(1, c.getFname());
			pst.setString(2, c.getLname());
			pst.setString(3, c.getEmail());
			pst.setString(4, c.getPassword());
			pst.setString(5, c.getCity());
			pst.setLong(6, c.getContact());
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
			String sql = "select * from Client where email=? ";
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

	public static Client ClientLogin(Client c) {

		Client c1 = null;

		try {
			Connection conn = DBConnection.DriverConnection();

			String sql = "select * from client where email=? and password=?";

			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, c.getEmail());
			pst.setString(2, c.getPassword());

			ResultSet rs = pst.executeQuery();
			if (rs.next()) {
				c1 = new Client();
				c1.setId(rs.getInt("id"));
				c1.setFname(rs.getString("first_name"));
				c1.setLname(rs.getString("last_name"));
				c1.setEmail(rs.getString("email"));
				c1.setPassword(rs.getString("password"));
				c1.setCity(rs.getString("city"));
				c1.setContact(rs.getLong("contact"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return c1;

	}

	public static void updateProfile(Client c) {

		try {

			Connection conn = DBConnection.DriverConnection();
			String sql = "update client set first_name=?,last_name=?,email=?,city=?,contact=? where id=?";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, c.getFname());
			pst.setString(2, c.getLname());
			pst.setString(3, c.getEmail());
			pst.setString(4, c.getCity());
			pst.setLong(5, c.getContact());
			pst.setInt(6, c.getId());
			pst.executeUpdate();
			System.out.println("updated your profile");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static boolean checkPassword(int id, String op) {
		boolean flag = false;
		try {
			Connection conn = DBConnection.DriverConnection();
			String sql = "select * from client where id=? and password=?";

			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setInt(1, id);
			pst.setString(2, op);

			ResultSet rs = pst.executeQuery();
			if (rs.next()) {
				flag = true;
			}
			System.out.println("password checked");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return flag;
	}

	public static void UpdatePassword(int id, String np) {

		try {
			Connection conn = DBConnection.DriverConnection();
			String sql = "update client set password =? where id=? ";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, np);
			pst.setInt(2, id);
			pst.executeUpdate();
			System.out.println("updated password ");
		} catch (Exception e) {

			e.printStackTrace();
		}
	}

}
