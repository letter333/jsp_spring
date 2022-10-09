<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ page import = "java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<%
Connection conn = null;
try{
String url = "jdbc:oracle:thin:@localhost:1521:xe";
String user = "c##scott";
String password = "seryong0217";

Class.forName("oracle.jdbc.driver.OracleDriver");
conn = DriverManager.getConnection(url, user, password);
out.print("성공");
} catch (SQLException ex) {
	out.print("실패");
	out.print("SQLException : " + ex.getMessage());
} finally {
	if(conn != null) {
		conn.close();
	}
}
%>
</body>
</html>