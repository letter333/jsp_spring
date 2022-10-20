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
if(strId != null) {
out.println(strId + "님의 비밀번호가 틀렸습니다.");
} else {
	out.println("존재하지 않는 아이디" + (String)session.getAttribute("tryid"));
}
%>
</body>
</html>