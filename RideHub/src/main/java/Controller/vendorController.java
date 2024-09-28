package Controller;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;

import DAO.vendorDAO;
import Model.vendor;

/**
 * Servlet implementation class vendorController
 */
@WebServlet("/vendorController")
@MultipartConfig(fileSizeThreshold = 1024 * 1024 * 512, maxFileSize = 1024 * 1024 * 512, maxRequestSize = 1024 * 1024
		* 512)
public class vendorController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public vendorController() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */

	private String extractfilename(Part file) {
		String cd = file.getHeader("content-disposition");
		System.out.println(cd);
		String[] items = cd.split(";");
		for (String string : items) {
			if (string.trim().startsWith("filename")) {
				return string.substring(string.indexOf("=") + 2, string.length() - 1);
			}
		}
		return "";
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		String action = request.getParameter("action");
		if (action.equalsIgnoreCase("register")) {
			vendor v = new vendor();
			v.setName(request.getParameter("name"));
			v.setContact(Long.parseLong(request.getParameter("contact")));
			v.setEmail(request.getParameter("email"));
			String savePath = "C:\\Users\\HP\\eclipse-workspace\\RideHub\\src\\main\\webapp\\vendor\\vendorProfile";
			File fileSaveDir = new File(savePath);
			if (!fileSaveDir.exists()) {
				fileSaveDir.mkdir();
			}
			Part file1 = request.getPart("image");
			String fileName = extractfilename(file1);
			file1.write(savePath + File.separator + fileName);
			String filePath = savePath + File.separator + fileName;

			String savePath2 = "C:\\Users\\HP\\eclipse-workspace\\RideHub\\src\\main\\webapp\\vendor\\vendorProfile";
			File imgSaveDir = new File(savePath2);
			if (!imgSaveDir.exists()) {
				imgSaveDir.mkdir();
			}
			v.setUpload_image(fileName);
			v.setPassword(request.getParameter("confirmnp"));
			LocalDate date = LocalDate.now();
			System.out.println(v);
			v.setJoin_date(date);
			String email = request.getParameter("email");
			boolean flag = vendorDAO.checkEmail(email);
			String np = request.getParameter("newp");
			String cnp = request.getParameter("confirmnp");
			if (flag == false) {
				if (np.equals(cnp)) {
					request.setAttribute("msg", "suss");
					vendorDAO.vendorInsert(v);
					response.sendRedirect("vendor-login.jsp");
				} else {
					request.setAttribute("msg1", "password are not same");
					request.getRequestDispatcher("vendor-register.jsp").forward(request, response);
				}

			} else {
				request.setAttribute("msg1", "Email already Register");
				request.getRequestDispatcher("vendor-register.jsp").forward(request, response);
			}
		}

		else if (action.equalsIgnoreCase("login")) {

			vendor v = new vendor();
			v.setEmail(request.getParameter("email"));
			v.setPassword(request.getParameter("password"));
			String email = request.getParameter("email");
			boolean flag = vendorDAO.checkEmail(email);
			if (flag == true) {
				vendor v1 = vendorDAO.vendorLogin(v);
				if (v1 == null) {
					request.setAttribute("msg1", "Error: Password is invalid");
					request.getRequestDispatcher("vendor-login.jsp").forward(request, response);
				} else {
					HttpSession session = request.getSession();
					session.setAttribute("data", v1);
					request.getRequestDispatcher("vendor-index.jsp").forward(request, response);
				}

			} else {
				request.setAttribute("msg", "email is not correct");
				request.getRequestDispatcher("vendor-login.jsp").forward(request, response);
			}
		}

		else if (action.equalsIgnoreCase("Update profile")) {
			try {

				vendor v = new vendor();
				v.setVid(Integer.parseInt(request.getParameter("id")));
				v.setName(request.getParameter("name"));
				v.setContact(Long.parseLong(request.getParameter("contact")));
				v.setEmail(request.getParameter("email"));
				String savePath = "C:\\Users\\HP\\eclipse-workspace\\RideHub\\src\\main\\webapp\\vendor\\vendorProfile";
				File fileSaveDir = new File(savePath);
				if (!fileSaveDir.exists()) {
					fileSaveDir.mkdir();
				}
				Part file1 = request.getPart("image");
				String fileName = extractfilename(file1);
				file1.write(savePath + File.separator + fileName);
				String filePath = savePath + File.separator + fileName;

				String savePath2 = "C:\\Users\\HP\\eclipse-workspace\\RideHub\\src\\main\\webapp\\vendor\\vendorProfile";
				File imgSaveDir = new File(savePath2);
				if (!imgSaveDir.exists()) {
					imgSaveDir.mkdir();
				}
				v.setUpload_image(fileName);
				System.out.println(v);

				vendorDAO.updateVendor(v);
				HttpSession session = request.getSession();
				session.setAttribute("data", v);
				request.getRequestDispatcher("vendor-index.jsp").forward(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		else if (action.equalsIgnoreCase("Change Password")) {
			int id = Integer.parseInt(request.getParameter("vid"));
			String op = request.getParameter("op");
			String np = request.getParameter("np");
			String cnp = request.getParameter("cnp");
			boolean flag = vendorDAO.checkOP(id, op);
			if (flag == true) {
				if (np.equals(cnp)) {
					vendorDAO.updatePassword(id, np);
					response.sendRedirect("vendor-index.jsp");
				} else {
					request.setAttribute("msg1", "np and cnp is not matched");
					request.getRequestDispatcher("v-cp.jsp").forward(request, response);
				}
			} else {
				request.setAttribute("msg", "Old password is incorrect");
				request.getRequestDispatcher("v-cp.jsp").forward(request, response);
			}
		}
	}

}
