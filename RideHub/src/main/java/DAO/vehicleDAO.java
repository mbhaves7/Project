package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import Connection.DBConnection;
import Model.vehicle;

public class vehicleDAO {

	public static void uploadVehicle(vehicle v) {
		try {
			Connection conn = DBConnection.DriverConnection();
			String sql = "insert into vehicle(vid,vname,vimage,vprice,vcategory,vdesc) values(?,?,?,?,?,?)";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setInt(1, v.getVid());
			pst.setString(2, v.getVimage());
			pst.setString(3, v.getVname());
			pst.setInt(4, v.getVprice());
			pst.setString(5, v.getVcategory());
			pst.setString(6, v.getVdesc());
			pst.executeUpdate();
			System.out.println("vehicle uploaded");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static List<vehicle> getvehicleByVid(int vid) {
		List<vehicle> list = new ArrayList<vehicle>();
		try {
			Connection conn = DBConnection.DriverConnection();
			String sql = "select * from vehicle where vid=?";
			PreparedStatement pst = conn.prepareStatement(sql);

			pst.setInt(1, vid);
			ResultSet rs = pst.executeQuery();
			while (rs.next()) {
				vehicle v = new vehicle();
				v.setVehicleId(rs.getInt("vehicleId"));
				v.setVid(rs.getInt("vid"));
				v.setVimage(rs.getString("vimage"));
				v.setVname(rs.getString("vname"));
				v.setVprice(rs.getInt("vprice"));
				v.setVcategory(rs.getString("vcategory"));
				v.setVdesc(rs.getString("vdescription"));
				list.add(v);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	public static vehicle getVehicleById(int id) {
		vehicle v = null;
		try {
			Connection conn = DBConnection.DriverConnection();
			String sql = "select * from vehicle where vehicleid=?";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setInt(1, id);
			ResultSet rs = pst.executeQuery();
			if (rs.next()) {
				v = new vehicle();
				v.setVid(rs.getInt("vehicleid"));
				v.setVimage(rs.getString("image"));
				v.setVname(rs.getString("pname"));
				v.setVprice(rs.getInt("pprice"));
				v.setVcategory(rs.getString("pcategory"));
				v.setVdesc(rs.getString("pdescription"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return v;
	}

	public static List<vehicle> getAllVehicle() {
		List<vehicle> list = new ArrayList<vehicle>();

		try {
			Connection conn = DBConnection.DriverConnection();
			String sql = "select * from vehicle";
			PreparedStatement pst = conn.prepareStatement(sql);
			ResultSet rs = pst.executeQuery();
			while (rs.next()) {
				vehicle v = new vehicle();

				v.setVehicleId(rs.getInt("vehicleId"));
				v.setVid(rs.getInt("vid"));
				v.setVimage(rs.getString("vimage"));
				v.setVname(rs.getString("vname"));
				v.setVprice(rs.getInt("vprice"));
				v.setVcategory(rs.getString("vcategory"));
				v.setVdesc(rs.getString("vdesc"));
				list.add(v);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

//	public static vehicle getVehicleById(int id) {
//		vehicle p = null;
//		try {
//			Connection conn = DBConnection.DriverConnection();
//			String sql = "select * from vehicle where vehicleId=?";
//			PreparedStatement pst = conn.prepareStatement(sql);
//			pst.setInt(1, id);
//			ResultSet rs = pst.executeQuery();
//			if (rs.next()) {
//				p = new vehicle();
//				p.setVehicleId(rs.getInt("VehicleId"));
//				p.setVid(rs.getInt("vid"));
//				p.setVimage(rs.getString("vimage"));
//				p.setVname(rs.getString("vname"));
//				p.setVprice(rs.getInt("vprice"));
//				p.setVcategory(rs.getString("vcategory"));
//				p.setVdesc(rs.getString("vdesc"));
//			}
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		return p;
//	}
}
