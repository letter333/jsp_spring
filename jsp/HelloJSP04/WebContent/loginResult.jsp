<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%! String name, phone, gender, hobby; %>
<%
name = (String)session.getAttribute("name");
phone = (String)session.getAttribute("phone");
gender = (String)session.getAttribute("gender");
hobby = (String)session.getAttribute("hobby");
%>
<%=name %>
<%=phone %>
<h1><%=gender %></h1>
<h1><%=hobby %></h1>
<a href="modify.jsp">회원정보수정</a>
<a href="MWOk">회원탈퇴</a>
</body>
</html>