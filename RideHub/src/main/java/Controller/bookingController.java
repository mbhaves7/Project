package Controller;

import java.io.IOException;
import java.time.LocalDate;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.bookingDAO;
import DAO.vehicleDAO;
import Model.booking;
import Model.vehicle;


/**
 * Servlet implementation class bookingController
 */
@WebServlet("/bookingController")
public class bookingController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public bookingController() {
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
		if (action.equalsIgnoreCase("Booking")) {

			
			booking b = new booking();
			
			
			b.setCid(Integer.parseInt(request.getParameter("cid")));
			System.out.println("sa");
			b.setId(Integer.parseInt(request.getParameter("id")));
			int vehicleid = Integer.parseInt(request.getParameter("vehicleid"));
			
			vehicle v = vehicleDAO.getVehicleById(vehicleid);
			b.setDistance(300);
			b.setPickUpLocation(action);
			LocalDate date = LocalDate.now();
			b.setPickDate(date);
			b.setPassenger(Integer.parseInt(request.getParameter("Passenger")));

			bookingDAO.addBooking(b);
			System.out.println("insert your booking");
			response.sendRedirect("client-index.jsp");

			
			
			
			
			
			
//			b.setVname(request.getParameter("vname"));
//			b.setVprice(Integer.parseInt(request.getParameter("vprice")));

		}
	}

}
