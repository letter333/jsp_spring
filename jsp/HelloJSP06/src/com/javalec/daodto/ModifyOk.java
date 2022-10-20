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
		request.setCharacterEncoding("utf-8");
		MemberDAO dao = new MemberDAO();
		MemberDTO m = new MemberDTO();
		
		String strId = request.getParameter("id");
		String strPw = request.getParameter("pw");
		String strName = request.getParameter("name");
		String strGender = request.getParameter("gender");
		
		m.setId(strId);
		m.setPw(strPw);
		m.setName(strName);
		m.setGender(strGender);
		
		PasswordEncoder p = new BCryptPasswordEncoder();
		
		HttpSession session = request.getSession(); 
		if(p.matches(m.getPw(), dao.checkMember(m).getPw())) {
			dao.updateMember(m);
			session.setAttribute("id", m.getId());
			session.setAttribute("name", m.getName());
			session.setAttribute("gender", m.getGender());
			response.sendRedirect("loginOk.jsp");
		} else {
			
			response.sendRedirect("modifyFail.jsp");
		}
	}

}
