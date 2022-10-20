<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% String strId = (String)session.getAttribute("id"); %>
<%= strId %>님의 비밀번호를 잘못입력했습니다.
</body>
</html>