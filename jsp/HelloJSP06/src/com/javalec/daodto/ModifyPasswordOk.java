package com.javalec.daodto;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * Servlet implementation class ModifyPasswordOk
 */
@WebServlet("/ModifyPasswordOk")
public class ModifyPasswordOk extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ModifyPasswordOk() {
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
		MemberDAO dao = new MemberDAO();
		MemberDTO m = new MemberDTO();
		
		HttpSession session = request.getSession();
		String strId = (String)session.getAttribute("id");
		String strPw = request.getParameter("pw");
		m.setId(strId);
		PasswordEncoder p = new BCryptPasswordEncoder();
		String cPassword = p.encode(strPw);
		
		m.setPw(cPassword);
		
		int result = dao.updatePassword(m);
		if(result == 1) {
			response.sendRedirect("login.html");
		} else {
			response.sendRedirect("modifyPassword.jsp");
		}
		
	}

}
