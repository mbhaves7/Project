package Core;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

class FirstDesktopApp implements ActionListener {

	JLabel l1, l2, l3, l4;
	JTextField t1, t2, t3, t4;
	JButton b1, b2, b3, b4;

	public FirstDesktopApp() {

		JFrame fr = new JFrame("Facebook");
		fr.setVisible(true);
		fr.setSize(700, 500);
		fr.setLayout(null);

		l1 = new JLabel("Id");
		l1.setBounds(100, 100, 120, 20);
		fr.add(l1);

		l2 = new JLabel("Name");
		l2.setBounds(100, 130, 120, 20);
		fr.add(l2);

		l3 = new JLabel("Contact");
		l3.setBounds(100, 160, 120, 20);
		fr.add(l3);

		l4 = new JLabel("City");
		l4.setBounds(100, 190, 120, 20);
		fr.add(l4);

		t1 = new JTextField();
		t1.setBounds(190, 100, 120, 20);
		fr.add(t1);
		t2 = new JTextField();
		t2.setBounds(190, 130, 120, 20);
		fr.add(t2);

		t3 = new JTextField();
		t3.setBounds(190, 160, 120, 20);
		fr.add(t3);

		t4 = new JTextField();
		t4.setBounds(190, 190, 120, 20);
		fr.add(t4);

		b1 = new JButton("Insert");
		b1.setBounds(100, 250, 120, 20);
		fr.add(b1);

		b2 = new JButton("Search");
		b2.setBounds(100, 280, 120, 20);
		fr.add(b2);

		b3 = new JButton("Update");
		b3.setBounds(250, 250, 120, 20);
		fr.add(b3);
		b4 = new JButton("Delete");
		b4.setBounds(250, 280, 120, 20);
		fr.add(b4);

		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
	}

	public static Connection connectionSql() {
		Connection con = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/windowapp", "root", "");
		} catch (Exception e) {
			e.printStackTrace();
		}

		return con;

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == b1) {

			System.out.println("Click insert button");
			int id = Integer.parseInt(t1.getText());
			String name = t2.getText();
			long contact = Long.parseLong(t3.getText());
			String city = t4.getText();

			System.out.println("id :" + id + "\nName :" + name + "\nContact :" + contact + "\nCity :" + city);

			try {

				Connection con = FirstDesktopApp.connectionSql();

				String sql = "insert into employee(Id,Name,Contact,City) values (?,?,?,?)";

				PreparedStatement pre = con.prepareStatement(sql);

				pre.setInt(1, id);
				pre.setString(2, name);
				pre.setLong(3, contact);
				pre.setString(4, city);
				pre.executeQuery();
				System.out.println("Data insert ");

				t1.setText("");
				t2.setText("");
				t3.setText("");
				t4.setText("");

				// pre.setInt(1, id);
//				ResultSet rs = pre.executeQuery();

//				if (rs.next()) {
//
//					t1.setText(String.valueOf(rs.getInt("Id")));
//					t2.setText(rs.getString("Name"));
//					t3.setText(String.valueOf(rs.getLong("Contact")));
//					t4.setText(rs.getString("City"));
//				} else {
//
//					System.out.println("data not Found");
//					t1.setText("");
//					t2.setText("");
//					t3.setText("");
//					t4.setText("");
//					
//					
//				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}

	}
}

public class FirstSwingExample {

	public static void main(String[] args) {

		new FirstDesktopApp();

	}
}
