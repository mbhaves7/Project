package Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import DAO.UserDAO;
import Model.User;

@WebServlet("/AdminController")
public class AdminController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public AdminController() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
		String action = request.getParameter("action");
		if (action.equalsIgnoreCase("register")) {

			User u = new User();

			u.setFname(request.getParameter("fname"));
			u.setLname(request.getParameter("lname"));
			u.setEmail(request.getParameter("email"));
			u.setPassword(request.getParameter("password"));

			System.out.println(u);

			String email = request.getParameter("email");
			Boolean flag = UserDAO.checkEmail(email);

			if (flag == false) {
				UserDAO.insertUser(u);
				response.sendRedirect("Login.jsp");
			} else {
				request.setAttribute("msg", "Error");
				request.getRequestDispatcher("Register.jsp").forward(request, response);
			}
		}

		else if (action.equalsIgnoreCase("login")) {
			User u = new User();
			u.setEmail(request.getParameter("email"));
			u.setPassword(request.getParameter("password"));
			String email = request.getParameter("email");
			boolean flag = UserDAO.checkEmail(email);
			if (flag == true) {
				User u1 = UserDAO.LoginCheck(u);
				if (u1 == null) {
					request.setAttribute("msg", "check your password");
					request.getRequestDispatcher("Login.jsp").forward(request, response);
				} else {
					HttpSession sess = request.getSession();
					sess.setAttribute("data", u1);
					request.getRequestDispatcher("index.jsp").forward(request, response);
				}
			} else {
				request.setAttribute("msg1", "invalid email");
				request.getRequestDispatcher("Login.jsp").forward(request, response);

			}
		}

	}

}
