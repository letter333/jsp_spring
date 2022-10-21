<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<c:set var="vatName2" value="aaa"/>
<c:out value="${vatName2 }" />
<br />

<%-- no jstl --%>
<% 
try {
	int a = 2;
	int b = 0;
	int c = a/b;
} catch(Exception e) {
	out.println(e.getMessage());
}

%>
<br />
<%-- jstl --%>
<c:catch var="myerror" >
<%=2/0 %>
</c:catch>
<c:out value="${myerror }"/>
<br />
<c:if test="${1+2==3 }">
맞음
</c:if>
<br />
<c:forEach var="fEach" begin="1" end="10" step="3">
${fEach }
</c:forEach>
<br />
<c:choose>
<c:when test="${10 > 100 }" > 거짓1 </c:when>
<c:when test="${10 == 10 }" > 참1 </c:when>
<c:otherwise>이도저도 아님</c:otherwise>
</c:choose>
</body>
</html>