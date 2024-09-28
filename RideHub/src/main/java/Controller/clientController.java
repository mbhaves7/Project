package Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import DAO.clientDAO;
import DAO.vendorDAO;
import Model.client;

/**
 * Servlet implementation class clientController
 */
@WebServlet("/clientController")
public class clientController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public clientController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);

		String action = request.getParameter("action");
		if (action.equalsIgnoreCase("Sign Up")) {
			client c = new client();

			c.setCname(request.getParameter("name"));
			c.setEmail(request.getParameter("email"));
			c.setPassword(request.getParameter("password"));
			c.setPassword(request.getParameter("confirmnp"));
			c.setCity(request.getParameter("city"));
			c.setContact(Long.parseLong(request.getParameter("contact")));

			String email = request.getParameter("email");
			boolean flag = clientDAO.checkEmail(email);

			String np = request.getParameter("newp");
			String cnp = request.getParameter("confirmnp");
			if (flag == false) {
				if (np.equals(cnp)) {
					request.setAttribute("msg2", "suss");
					clientDAO.insertClient(c);
					response.sendRedirect("client-login.jsp");
				} else {
					request.setAttribute("msg1", "password are not same");
					request.getRequestDispatcher("client-register.jsp").forward(request, response);
				}
			} else {
				request.setAttribute("msg", "account already registered");
				request.getRequestDispatcher("client-register.jsp").forward(request, response);
			}
		} else if (action.equalsIgnoreCase("Sign In")) {

			client c = new client();
			c.setEmail(request.getParameter("email"));
			c.setPassword(request.getParameter("password"));
			String email = request.getParameter("email");
			boolean flag = clientDAO.checkEmail(email);
			if (flag == true) {
				client c1 = clientDAO.clientLogin(c);
				if (c1 == null) {
					request.setAttribute("msg1", "Error: Password is invalid");
					request.getRequestDispatcher("client-login.jsp").forward(request, response);
				} else {
					HttpSession session = request.getSession();
					session.setAttribute("data", c1);
					request.getRequestDispatcher("client-index.jsp").forward(request, response);
				}

			} else {
				request.setAttribute("msg", "email is not correct");
				request.getRequestDispatcher("client-login.jsp").forward(request, response);
			}
		}

		else if (action.equalsIgnoreCase("Update profile")) {
			try {

				client c = new client();
				c.setCid(Integer.parseInt(request.getParameter("cid")));
				c.setCname(request.getParameter("name"));
				c.setContact(Long.parseLong(request.getParameter("contact")));
				c.setCity(request.getParameter("city"));
				System.out.println(c);

				clientDAO.updateclient(c);
				HttpSession session = request.getSession();
				session.setAttribute("data", c);
				request.getRequestDispatcher("client-index.jsp").forward(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		else if (action.equalsIgnoreCase("Change Password")) {
			int id = Integer.parseInt(request.getParameter("cid"));
			String op = request.getParameter("op");
			String np = request.getParameter("np");
			String cnp = request.getParameter("cnp");
			boolean flag = clientDAO.checkOP(id, op);
			if (flag == true) {
				if (np.equals(cnp)) {
					clientDAO.updatePassword(id, np);
					response.sendRedirect("client-index.jsp");
				} else {
					request.setAttribute("msg1", "np and cnp is not matched");
					request.getRequestDispatcher("c-cp.jsp").forward(request, response);
				}
			} else {
				request.setAttribute("msg", "Old password is incorrect");
				request.getRequestDispatcher("c-cp.jsp").forward(request, response);
			}
		}
	}

}
