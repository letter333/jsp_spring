<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
<%! int age; %>
<%
String str = request.getParameter("age");
try {
	age = Integer.parseInt(str);
	
	if(age >= 20) {
		response.sendRedirect("pass.jsp?age="+age);
	} else {
		response.sendRedirect("ng.jsp?age="+age);
	}
} catch(Exception e) {
	response.sendRedirect("requestex.html");
}
%>
</body>
</html>