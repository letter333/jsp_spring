<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% String strGender = (String)session.getAttribute("gender"); %>

<form action="ModifyOk" method="post">
이름 : <input type="text" name="name" value=<%=(String)session.getAttribute("name") %> /><br />
ID : <input type="text" name="id" value="<%=(String)session.getAttribute("id") %>" readonly/><br />
PW : <input type="password" name="pw" /><br />
<%if(strGender.equals("man")) { %>
성별 : 남자<input type="radio" name="gender" value="man" id="man" checked />
여자<input type="radio" name="gender" value="woman" id="woman" />
<%} else { %>
성별 : 남자<input type="radio" name="gender" value="man" id="man" />
여자<input type="radio" name="gender" value="woman" id="woman" checked />
<%} %>
<br />
<input type="submit" value="수정하기" />
</form>
</body>
</html>