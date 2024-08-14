package net.java.controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import net.java.Dao.Dao;

import net.java.DaoImpl.DaoImpl;
import net.java.model.Employee;

import java.io.IOException;
import java.util.List;

/**
 * Servlet implementation class EmployeeServ
 */
@WebServlet("/EmployeeServ")
public class EmployeeServ extends HttpServlet {
	private static final long serialVersionUID = 1L;
	 private Dao employeeDao;

	 public void init() {
	        employeeDao = new DaoImpl();
	    }
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmployeeServ() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
//		 try {
//	            // Fetch the list of employees
//	            List<Employee> employeeList = employeeDao.getAll();
//	            System.err.println("servler wala hai");
//	            System.out.println(employeeList);
//
//	            // Set the employee list as a request attribute
//	            request.setAttribute("employeeList", employeeList);
//
//	            // Forward the request to the JSP page
//	            RequestDispatcher dispatcher = request.getRequestDispatcher("employeedetails.jsp");
//	            dispatcher.forward(request, response);
//	        } catch (Exception e) {
//	            e.printStackTrace();
//	            // Handle exceptions and errors
//	            response.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR, "Unable to fetch employee data.");
//	        }
		
		
//		RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");
//		dispatcher.forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		  String name = request.getParameter("name");
	        int quantity = Integer.parseInt(request.getParameter("quantity"));
	        float price = Float.parseFloat(request.getParameter("price"));
	        String date = request.getParameter("date");
	        
	        Employee employee = new Employee();
	        employee.setName(name);
	        employee.setQuantity(quantity);
	        employee.setPrice(price);
	        employee.setDate(date);
	        
	        try {
	            // Register the employee using the DAO
	            employeeDao.save(employee);
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	        
	       // response.sendRedirect("employeedetails.jsp");
	        response.sendRedirect("employeedetails.jsp");
	        
	        
	        
	}

}
