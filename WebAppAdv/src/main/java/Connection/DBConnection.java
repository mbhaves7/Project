package Connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

	public static Connection drivercConnection() {
		Connection conn = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/webapp","root","");

		} catch (Exception e) {
			e.printStackTrace();
		}

		return conn;

	}

}
