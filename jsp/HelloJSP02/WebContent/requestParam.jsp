<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="mytest.myjava.*" %>
<%@ page import="java.util.Arrays" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%! 
	String name, pw, major, protocol;
	String[] hobbys;
	Student s = new Student();
%>

<%! public String korMajor(String major) {
	if(major.equals("eng")) {
		return "영어";
	} else if(major.equals("math")) {
		return "수학";
	} else if(major.equals("kor")) {
		return "국어";
	} else {
		return major;
	}
}
%>

<%! 
public String korHobby(String[] hobbys) {
	String hobby = "";
	for(int i = 0; i < hobbys.length; i++) {
		switch(hobbys[i]){
		case "cook":
			hobby += "요리";
			break;
		case "run":
			hobby += "달리기";
			break;
		case "swim":
			hobby += "수영";
			break;
		case "sleep":
			hobby += "잠자기";
			break;
		}
		if(i != hobbys.length - 1) {
			hobby += ",";
		}
	}
	return hobby;
}
%>

<%
	request.setCharacterEncoding("utf-8");
	name = request.getParameter("name");
	pw = request.getParameter("pw");
	major = request.getParameter("major");
	protocol = request.getParameter("protocol");
	hobbys = request.getParameterValues("hobby");

	s.setName(name);
	s.setPw(pw);
	s.setMajor(major);
	s.setProtocol(protocol);
	s.setHobbys(hobbys);
%>

이름 : <%=s.getName() %> <br />
비밀번호 : <%=s.getPw() %> <br />
전공 : <%=korMajor(s.getMajor()) %> <br />
규약 : <%=s.getProtocol() %> <br />
취미 : <%=korHobby(s.getHobbys()) %>
</body>
</html>