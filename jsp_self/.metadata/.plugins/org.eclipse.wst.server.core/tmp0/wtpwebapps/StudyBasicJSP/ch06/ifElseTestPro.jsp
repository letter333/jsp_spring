<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%request.setCharacterEncoding("utf-8"); %>

<%
String name = request.getParameter("name");
int age = Integer.parseInt(request.getParameter("age"));

if(age >= 20) {
out.println("<b>" + name + "</b> 님의 나이는 20세이상입니다.");
} else {
out.println("<b>" + name + "</b> 님은 미성년입니다.");
}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title></title>
</head>
<body>

</body>
</html>