package UserDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;

import Connection.DBConnection;
import Model.User;

public class DAO {

	public static void insertUser(User u) {

		try {

			Connection conn = DBConnection.drivercConnection();

			String sql = "insert into user(first_name,last_name,email,password)values(?,?,?,?)";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, u.getFirst_name());
			pst.setString(2, u.getLast_name());
			pst.setString(3, u.getEmail());
			pst.setString(4, u.getPassword());
		
			pst.executeUpdate();
			System.out.println("user data added");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
