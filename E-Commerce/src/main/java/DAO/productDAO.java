package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;

import Connection.DBConnection;
import Model.product;

public class productDAO {

	public static void insertProduct(product p) {

		try {

			Connection conn = DBConnection.DriverConnection();
			String sql = "insert into product (sid,pname,pprice,pimage,pcategory,pdesc) value (?,?,?,?,?,?)";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setInt(1, p.getSid());
			pst.setString(2, p.getPname());
			pst.setInt(3, p.getPprice());
			pst.setString(4, p.getPimage());
			pst.setString(5, p.getPcategory());
			pst.setString(6, p.getPdesc());
			pst.executeUpdate();
			System.out.println("insert data  ");

		} catch (Exception e) {
			e.printStackTrace();

		}
	}
}












