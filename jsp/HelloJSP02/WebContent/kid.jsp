<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%=request.getAttribute("result") %>
<img src="data:image/jpeg;base64,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" alt="" />
</body>
</html>