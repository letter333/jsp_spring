package com.myjava.myservlet;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RequestResponse
 */
@WebServlet("/RequestResponse")
public class RequestResponse extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RequestResponse() {
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
		// TODO Auto-generated method stub
		String str = request.getParameter("birth");
		int birth;
		int year;
		int age;
		
		try {
			
			birth = Integer.parseInt(str);
			year = 2022;
			Date now = new Date();
			SimpleDateFormat formatter = new SimpleDateFormat("yyyy");
			String nowYear = formatter.format(now);
			age = Integer.parseInt(nowYear) - birth + 1;
						
			if(age >= 20) {
				response.sendRedirect("pass.jsp?age=" + age);
			} else {
				response.sendRedirect("ng.jsp?age=" + age);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			request.setCharacterEncoding("utf-8");
			response.setCharacterEncoding("text/html;charset=utf-8");
			response.sendRedirect("fail.jsp?birth=" + str);
		}
			
		
	}

}
