<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% request.setCharacterEncoding("utf-8"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title></title>
</head>
<body>
<%
String id = "Kingdora";
String hobby = "만화보기";
%>
포워딩하는 페이지 forwardTest2.jsp입니다.<br>
<jsp:forward page="forwardToTest2.jsp">
<jsp:param name="id" value="<%=id %>"/>
<jsp:param name="hobby" value="<%=hobby %>"/>
</jsp:forward>
</body>
</html>