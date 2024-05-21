package Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import DAO.ClientDAO;
import DAO.sellerDAO;
import Model.Client;
import Model.seller;

@WebServlet("/sellerController")
public class sellerController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public sellerController() {
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
			seller s = new seller();
			s.setName(request.getParameter("name"));
			s.setContact(Long.parseLong(request.getParameter("contact")));
			s.setAddress(request.getParameter("address"));
			s.setCity(request.getParameter("city"));
			s.setEmail(request.getParameter("email"));
			s.setPassword(request.getParameter("password"));

			System.out.println(s);

			String email = request.getParameter("email");
			boolean flag = sellerDAO.checkEmail(email);

			if (flag == false) {
				sellerDAO.insertseller(s);
				response.sendRedirect("seller-login.jsp");
			} else {
				request.setAttribute("msg", "Email already Register");
				request.getRequestDispatcher("seller-registration.jsp").forward(request, response);
			}
		} else if (action.equalsIgnoreCase("login")) {
			seller s = new seller();
			s.setEmail(request.getParameter("email"));
			s.setPassword(request.getParameter("password"));
			String email = request.getParameter("email");
			boolean flag = sellerDAO.checkEmail(email);
			if (flag == true) {
				seller s1 = sellerDAO.sellerLogin(s);
				if (s1 == null) {
					request.setAttribute("msg1", "Error: Password is invalid");
					request.getRequestDispatcher("seller-login.jsp").forward(request, response);
				} else {
					HttpSession session = request.getSession();
					session.setAttribute("data", s1);
					request.getRequestDispatcher("seller-home.jsp").forward(request, response);
				}

			} else {
				request.setAttribute("msg", "email is not correct");
				request.getRequestDispatcher("seller-login.jsp").forward(request, response);
			}
		} else if (action.equalsIgnoreCase("update")) {

			try {

				seller s = new seller();
				s.setSid(Integer.parseInt(request.getParameter("id")));
				s.setName(request.getParameter("name"));
				s.setContact(Long.parseLong(request.getParameter("contact")));
				s.setEmail(request.getParameter("email"));
				s.setAddress(request.getParameter("address"));
				s.setCity(request.getParameter("city"));
				System.out.println(s);

				sellerDAO.updateSeller(s);
				HttpSession session = request.getSession();
				session.setAttribute("data", s);
				request.getRequestDispatcher("seller-home.jsp").forward(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		else if (action.equalsIgnoreCase("cp")) {
			try {

				int id = Integer.parseInt(request.getParameter("id"));
				String op = request.getParameter("op");
				String np = request.getParameter("np");
				String cnp = request.getParameter("cnp");
				boolean flag = sellerDAO.checkPassword(id, op);
				if (flag == true) {
					if (np.equals(cnp)) {
						request.setAttribute("msg", "suss");
						sellerDAO.updatePassword(id, cnp);
						response.sendRedirect("seller-home.jsp");
					} else {
						request.setAttribute("msg1", "password are not same");
						request.getRequestDispatcher("seller-change-password.jsp").forward(request, response);
					}
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		else if(action.equalsIgnoreCase("seller-upload-product.jsp")) {
			
		}
		
	}
}
