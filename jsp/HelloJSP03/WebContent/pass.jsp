<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%! int age; %>
<%
age = Integer.parseInt(request.getParameter("age"));
%>

입력한 나이 : <%=age %> <br />
술담배 가능
</body>
</html>