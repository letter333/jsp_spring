<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<% request.setCharacterEncoding("utf-8"); %>

<%
String id = request.getParameter("id");
String password = request.getParameter("password");
String name = request.getParameter("name");

Connection conn = null;
PreparedStatement pstmt = null;
ResultSet rs = null;

try {
String jdbcUrl="jdbc:oracle:thin:@localhost:1521:xe";
String dbId="c##scott";
String dbPassword="seryong0217";

Class.forName("oracle.jdbc.driver.OracleDriver");
conn=DriverManager.getConnection(jdbcUrl, dbId, dbPassword);

String sql = "select id, password from member where id=?";
pstmt=conn.prepareStatement(sql);
pstmt.setString(1, id);
rs=pstmt.executeQuery();

if(rs.next()) {
	String rId = rs.getString("id");
	String rPassword = rs.getString("password");
	if(id.equals(rId) && password.equals(rPassword)) {
		sql = "update member set name= ? where id=?";
		pstmt=conn.prepareStatement(sql);
		pstmt.setString(1, name);
		pstmt.setString(2, id);
		pstmt.executeUpdate();
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>레코드 수정</title>
</head>
<body>
member 태아블의 레코드를 수정했습니다.
</body>
</html>
<% 
}else
out.println("패스워드가 틀렸습니다.");
} else 
out.println("아이디가 틀렸습니다.");
}catch (Exception e) {
e.printStackTrace();
} finally {
if(rs != null)
try{rs.close();}catch(SQLException sqle) {}
if(pstmt != null)
try{pstmt.close();}catch(SQLException sqle) {}
if(conn != null)
try{conn.close();} catch(SQLException sqle){}
}
%>