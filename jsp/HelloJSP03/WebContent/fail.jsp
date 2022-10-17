<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%! String birth; %>
<%
birth = request.getParameter("birth");
System.out.println(birth + "값은 이상함");
%>
<h1>실패!</h1>
입력한 birth값 <%=birth %>
<a href="requestex.html">돌아가기</a>
</body>
</html>