<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
.man {

}

.woman {

}
</style>
</head>
<body>
<%
String strId = (String)session.getAttribute("id");
String strName= (String)session.getAttribute("name");
String strGender = (String)session.getAttribute("gender");
%>

<h1 class=<%=strGender %>><%=strName%></h1>
<h1 class=<%=strGender %>><%=strId%></h1>
<h1 class=<%=strGender %>><%=strGender %></h1>
</body>
</html>