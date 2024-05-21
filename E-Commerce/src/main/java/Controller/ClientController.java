package Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import DAO.ClientDAO;
import Model.Client;

@WebServlet("/ClientController")
public class ClientController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ClientController() {
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
			Client c = new Client();
			c.setFname(request.getParameter("fname"));
			c.setLname(request.getParameter("lname"));
			c.setEmail(request.getParameter("email"));
			c.setPassword(request.getParameter("password"));
			c.setCity(request.getParameter("city"));

			System.out.println(c);

			String email = request.getParameter("email");
			boolean flag = ClientDAO.checkEmail(email);

			if (flag == false) {
				ClientDAO.insertClient(c);
				response.sendRedirect("Client-login.jsp");
			} else {
				request.setAttribute("msg", "Email already Register");
				request.getRequestDispatcher("Client-registration.jsp").forward(request, response);
			}
		} else if (action.equalsIgnoreCase("login")) {
			Client c = new Client();
			c.setEmail(request.getParameter("email"));
			c.setPassword(request.getParameter("password"));
			String email = request.getParameter("email");
			boolean flag = ClientDAO.checkEmail(email);
			if (flag == true) {
				Client c1 = ClientDAO.ClientLogin(c);
				if (c1 == null) {
					request.setAttribute("msg1", "invalid Password");
					request.getRequestDispatcher("Client-login.jsp").forward(request, response);
				} else {
					HttpSession session = request.getSession();
					session.setAttribute("data", c1);
					request.getRequestDispatcher("Client-Home.jsp").forward(request, response);
				}
			} else {
				request.setAttribute("msg", "invalid email");
				request.getRequestDispatcher("Client-login.jsp").forward(request, response);
			}
		} else if (action.equalsIgnoreCase("update")) {
			Client c = new Client();
			c.setId(Integer.parseInt(request.getParameter("id")));
			c.setFname(request.getParameter("fname"));
			c.setLname(request.getParameter("lname"));
			c.setEmail(request.getParameter("email"));
			c.setContact(Long.parseLong(request.getParameter("contact")));
			c.setCity(request.getParameter("city"));
			ClientDAO.updateProfile(c);
			HttpSession session = request.getSession();
			session.setAttribute("data", c);
			request.getRequestDispatcher("Client-Home.jsp").forward(request, response);
		} else if (action.equalsIgnoreCase("cp")) {

			int id = Integer.parseInt(request.getParameter("id"));
			String op = request.getParameter("op");
			String np = request.getParameter("np");
			String cnp = request.getParameter("cnp");

			boolean flag = ClientDAO.checkPassword(id, op);

			if (flag == true) {
				if (np.equals(cnp)) {
					ClientDAO.UpdatePassword(id, cnp);
					response.sendRedirect("Client-Home.jsp");
				} else {

					request.setAttribute("msg1", "New password and cnp not matched");
					request.getRequestDispatcher("change-password.jsp").forward(request, response);
				}
			} else {
				request.setAttribute("msg", "old password is in valid");
				request.getRequestDispatcher("change-password.jsp").forward(request, response);
			}
		}
	}

}
