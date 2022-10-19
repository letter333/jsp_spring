<%@page import="com.javalec.daodto.MemberDTO"%>
<%@page import="java.util.List"%>
<%@page import="com.javalec.daodto.MemberDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%! MemberDAO memberDAO = new MemberDAO(); %>

<table border=1>
<tr>
<th>이름</th>
<th>아이디</th> 
<th>비밀번호</th>
<th>성별</th>
</tr>

<%
List<MemberDTO> mList = memberDAO.memberSelect();
for(int i = 0; i < mList.size(); i++) { 
MemberDTO m = mList.get(i);
%>
<tr>
<td><%=m.getName() %></td>
<td><%=m.getId() %></td>
<td><%=m.getPw() %></td>
<td><%=m.getGender() %></td>
</tr>
<%}%>

</table>
</body>
</html>