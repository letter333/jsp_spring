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
 * Servlet implementation class LogInOk
 */
@WebServlet("/LogInOk")
public class LogInOk extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LogInOk() {
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
		request.setCharacterEncoding("utf-8");
		
		String strId = request.getParameter("id");
		String strPw = request.getParameter("pw");
		
		System.out.println(strId + strPw);
		
		String strQuery = String.format("select * from member where id = '%s' and pw = '%s'", strId, strPw);
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
			rs = stmt.executeQuery(strQuery);
			
			rs.next();
			
			String strName = rs.getString("name");
			String strPhone = rs.getString("hp");
			String strGender = rs.getString("gender");
			String strHobby = rs.getString("hobby");
			
			if(strName != null) {
				HttpSession httpSession = request.getSession();
				httpSession.setAttribute("name", strName);
				httpSession.setAttribute("phone", strPhone);
				httpSession.setAttribute("gender", strGender);
				httpSession.setAttribute("hobby", strHobby);
				httpSession.setAttribute("id", strId);
				response.sendRedirect("loginResult.jsp");
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
