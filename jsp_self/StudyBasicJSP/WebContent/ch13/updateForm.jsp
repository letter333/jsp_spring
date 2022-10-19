<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="ch13.board.BoardDBBean" %>
<%@ page import="ch13.board.BoardDataBean" %>
<%@ include file="color.jspf" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시판</title>
<link rel="stylesheet" href="style.css" />
<script src="script.js"></script>
</head>
<body bgcolor="<%=bodyback_c %>">
<%
int num = Integer.parseInt(request.getParameter("num"));
String pageNum = request.getParameter("pageNum");
try {
	BoardDBBean dbPro = BoardDBBean.getInstance();
	BoardDataBean article = dbPro.updateGetArticle(num);
%>
<p>글수정</p>
<br />
<form action="updatePro.jsp?pageNum=<%=pageNum %>" method="post" name="writeform" onsubmit="return writeSave()">
<table>
<tr>
<td width="70" bgcolor="<%=value_c%>">이름</td>
<td align="left" width="330">
<input type="text" size="10" maxlength="10" name="writer" value="<%=article.getWriter() %>" style="ime-mode:active;" />
<input type="hidden" name="num" value="<%=article.getNum() %>" />
</td>
</tr>
<tr>
<td width="70" align="center" bgcoloor="<%=value_c%>">제목</td>
<td align="left" width="330">
<input type="text" size="40" maxlength="50" name="subject" style="ime-mode:active;" value="<%=article.getSubject()%>" />
</td>
</tr>
<tr>
<td width="70" align="center" bgcolor="<%=value_c%>">Email</td>
<td align="left" width="330">
<input type="text" size="40" maxlength="30" name="email" style="ime-mode:inactive;" value="<%=article.getEmail() %>" />
</td>
</tr>
<tr>
<td width="70" align="center" bgcolor="<%=value_c %>">내용</td>
<td align="left" width="330">
<textarea name="content" id="" cols="40" rows="13" style="ime-mode:active;"><%=article.getContent() %></textarea>
</td>
</tr>
<tr>
<td width="70" align="center" bgcolor="<%=value_c%>">비밀번호</td>
<td align="left" width="330">
<input type="password" size="8" maxlength="12" name="password" style="ime-mode:inactive;" />
</td>
</tr>
<tr>
<td colspan="2" align="center" bgcolor="<%=value_c %>">
<input type="submit" value="글수정" />
<input type="reset" value="다시작성" />
<input type="button" value="목록보기" onclick="document.location.href='list.jsp?pageNum=<%=pageNum %>'" />
</td>
</tr>
</table>
</form>

<% } catch(Exception e) {} %>
</body>
</html>