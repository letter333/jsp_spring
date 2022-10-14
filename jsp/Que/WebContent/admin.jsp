<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% 
String name=request.getParameter("name");
String age = request.getParameter("age");
String id = request.getParameter("id");
%>
이름 : <%=name %> <br />
나이 : <%=age %> <br />
id : <%=id %> <br />
<h1>관리자 페이지</h1>
</body>
</html>