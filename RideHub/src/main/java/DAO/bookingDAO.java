package DAO;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;

import Connection.DBConnection;
import Model.booking;

public class bookingDAO {

	public static void addBooking(booking b) {
		try {
			Connection conn = DBConnection.DriverConnection();
			String sql = "insert into booking(vid,cid,vehicleId,PickUpLocation,DropOffLocation,,Date,Passenger,Distance) values(?,?,?,?,?,?,?,?)";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setInt(1, b.getVid());
			pst.setInt(2, b.getCid());
			pst.setInt(3, b.getVehicleId());
			pst.setString(4, b.getPickUpLocation());
			pst.setString(5, b.getDropOffLocation());
			pst.setDate(6, Date.valueOf(b.getPickDate()));
			pst.setInt(7, b.getPassenger());
			pst.setInt(8, b.getDistance());
			pst.executeUpdate();
			System.out.println("vehicle uploaded");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
