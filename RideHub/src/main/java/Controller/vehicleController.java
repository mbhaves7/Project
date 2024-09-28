package Controller;

import java.io.File;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import DAO.vehicleDAO;
import Model.booking;
import Model.vehicle;

/**
 * Servlet implementation class vehicleController
 */
@WebServlet("/vehicleController")
@MultipartConfig(fileSizeThreshold = 1024 * 1024 * 512, maxFileSize = 1024 * 1024 * 512, maxRequestSize = 1024 * 1024
		* 512)
public class vehicleController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public vehicleController() {
		super();
		// TODO Auto-generated constructor stub
	}


	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}


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
		if (action.equalsIgnoreCase("upload vehicle")) {
			String savePath = "C:\\Users\\HP\\eclipse-workspace\\RideHub\\src\\main\\webapp\\images\\vehicle";
			File fileSaveDir = new File(savePath);
			if (!fileSaveDir.exists()) {
				fileSaveDir.mkdir();
			}
			Part file1 = request.getPart("image");
			String fileName = extractfilename(file1);
			file1.write(savePath + File.separator + fileName);
			String filePath = savePath + File.separator + fileName;

			String savePath2 = "C:\\Users\\HP\\eclipse-workspace\\RideHub\\src\\main\\webapp\\images\\vehicle";
			File imgSaveDir = new File(savePath2);
			if (!imgSaveDir.exists()) {
				imgSaveDir.mkdir();
			}
			vehicle v = new vehicle();
			v.setVid(Integer.parseInt(request.getParameter("vid")));
			v.setVimage(fileName);
			v.setVname(request.getParameter("vname"));
			v.setVprice(Integer.parseInt(request.getParameter("vprice")));
			v.setVcategory(request.getParameter("vcategory"));
			v.setVdesc(request.getParameter("vdesc"));
			vehicleDAO.uploadVehicle(v);
			;
			response.sendRedirect("vendor-index.jsp");
		}

		

	}

}
