<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.Date, java.text.SimpleDateFormat" %>
<%@ page errorPage="eerror.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
Date date = new Date();
SimpleDateFormat simpleDate = new SimpleDateFormat("yyyy-MM-dd");
String strdate = simpleDate.format(date);
%>
보통의 jsp 페이지의 형태입니다.
<%--고의로 에러를 발생시킨 라인으로 strdate변수명을 strdat로 틀리게 입력했다. --%>
오늘 날짜는 <%=strdat %>입니다.
</body>
</html>