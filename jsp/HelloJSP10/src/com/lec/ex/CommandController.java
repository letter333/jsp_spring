package com.lec.ex;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FrontController
 */
@WebServlet("*.do")
public class CommandController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CommandController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String uri = request.getRequestURI();
		String conPath = request.getContextPath();
		String command = uri.substring(conPath.length());
		System.out.println(uri);
		System.out.println(conPath);
		System.out.println(command);
		
		ExecutePrintable ex;
		if(command.equals("/insert.do")) {
			ex = new InsertPrint();
			//response.getWriter().println("My Insert");
		} else if(command.equals("/test.do")) {
			//response.getWriter().println("T E  S T");
			ex = new TestPrint();
		} else {
			ex = new ExecutePrintable() {
				
				@Override
				public void execute() {
					// TODO Auto-generated method stub
					System.out.println("E X");
				}
			};
		}
		
		ex.execute();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
