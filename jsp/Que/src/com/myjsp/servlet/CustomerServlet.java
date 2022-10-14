package com.myjsp.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.myjsp.myjava.Customer;

/**
 * Servlet implementation class CustomerServlet
 */
@WebServlet("/CustomerServlet")
public class CustomerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CustomerServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doAction(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doAction(request, response);
	}

	public void doAction(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		String age = request.getParameter("age");
		String id = request.getParameter("id");
		
		Customer c = new Customer(name, Integer.parseInt(age), id);
		
		request.setAttribute("name", c.getName());
		request.setAttribute("age", age);
		request.setAttribute("id", id);
		
		ServletContext context =getServletContext();
		if(c.getId().equals("admin")) {
			RequestDispatcher dispatcher = context.getRequestDispatcher("/admin.jsp");
			dispatcher.forward(request, response);
		} else {
			if(c.getAge() < 20) {
				RequestDispatcher dispatcher = context.getRequestDispatcher("/under20.jsp");
				dispatcher.forward(request, response);
			} else {
				RequestDispatcher dispatcher = context.getRequestDispatcher("/over20.jsp");
				dispatcher.forward(request, response);
			}
		}
	}
}
