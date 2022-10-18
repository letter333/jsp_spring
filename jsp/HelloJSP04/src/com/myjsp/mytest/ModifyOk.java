package com.myjsp.mytest;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ModifyOk
 */
@WebServlet("/ModifyOk")
public class ModifyOk extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ModifyOk() {
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
	
	protected void doAction(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession();
		
		request.setCharacterEncoding("utf-8");
		String strName = request.getParameter("name");
		String strId= (String)session.getAttribute("id");
		String strPw = request.getParameter("pw");
		String strPhone = request.getParameter("phone") + "-" + request.getParameter("phone2") + "-" + request.getParameter("phone3");
		String strGender = request.getParameter("gender");
		
		System.out.println(strName );
		System.out.println(strId);
		System.out.println(strPw);
		System.out.println(strPhone);
		System.out.println(strGender);
		
		String strQuery = String.format("update member set name = '%s', pw = '%s', hp = '%s', gender = '%s' where id = '%s'", strName, strPw, strPhone, strGender, strId);
		
		System.out.println(strQuery); 
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");   
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;

		
		try {
			String jdbcDriver = "jdbc:mysql://localhost:3306/jspdb?" +
								"useUnicode=true&characterEncoding=utf8&" +
								"serverTimezone=UTC";
			String dbUser = "root";
			String dbPass = "1234";
			conn = DriverManager.getConnection(jdbcDriver, dbUser, dbPass);
			stmt = conn.createStatement();
			int i = stmt.executeUpdate(strQuery);
			
			if(i == 1) {
				System.out.println("성공");
				response.sendRedirect("modifyResult.jsp");
			} else {
				System.out.println("실패");
				response.sendRedirect("modify.jsp");
			}
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
			rs.close();
			stmt.close();
			conn.close();
			} catch(Exception e) {
				
			}
		}
	}

}
