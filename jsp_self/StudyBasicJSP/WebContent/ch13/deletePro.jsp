<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="ch13.board.BoardDBBean" %>
<%@ page import="java.sql.Timestamp" %>

<% request.setCharacterEncoding("utf-8"); %>

<% 
int num = Integer.parseInt(request.getParameter("num"));
String pageNum = request.getParameter("pageNum");
String password = request.getParameter("password");

BoardDBBean dbPro = BoardDBBean.getInstance();
int check = dbPro.deleteArticle(num, password);

if(check == 1) {
%>
<meta http-equiv="Refresh" content="0;url=list.jsp?pageNum=<%=pageNum %>">
<%} else { %>
<script>
<!--
alert("비밀번호가 맞지 않습니다.");
history.go(-1);
-->
</script>

<%} %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>