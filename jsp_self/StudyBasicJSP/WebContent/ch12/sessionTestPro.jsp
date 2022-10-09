<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>세션 속성 설정 및 사용</title>
</head>
<body>
<%
String id = request.getParameter("id");
String password = request.getParameter("password");

session.setAttribute("id", id);
session.setAttribute("password", password);
%>
id와 password 세션 속성을 설정하였습니다.<br>

id 속성의 값은 <%=session.getAttribute("id") %> 이고<br>
password 속성의 값은 <%=session.getAttribute("password") %> 입니다.
</body>
</html>