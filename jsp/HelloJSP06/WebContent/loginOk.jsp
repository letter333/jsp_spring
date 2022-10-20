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
String strId = (String)session.getAttribute("id");
String strName= (String)session.getAttribute("name");
String strGender = (String)session.getAttribute("gender");
%>

<table border=1>
<tr>
<th>이름</th>
<th>아이디</th>
<th>성별</th>
</tr>
<tr <%=(strGender.equals("man") ? "style='color:blue;'" : "style='color:hotpink;'")%>>
<td><%=strName %></td>
<td><%=strId %></td>
<td><%=strGender %></td>
</tr>
</table>
<br />
<input type="button" value="회원정보수정" onclick="document.location.href='modify.jsp'"/>
<%
if(strId.equals("admin")) {
%>
<%@ include file="/memberSelect.jsp" %>
<% } %>
</body>
</html>