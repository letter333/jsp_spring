<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%request.setCharacterEncoding("utf-8"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="testBean" class="ch10.bean.TestBean">
<jsp:setProperty name="testBean" property="name"/>
</jsp:useBean>
<h2>자바빈을 사용하는 JSP페이지</h2>
입력된 이름은 <jsp:getProperty name="testBean" property="name"/>입니다.
</body>
</html>