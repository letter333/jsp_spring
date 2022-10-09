<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>레코드 표시</title>
</head>
<body>
<h2>member 테이블의 레코드 표시</h2>
<table border="1">
<tr>
<td width="100">아이디</td>
<td width="100">패드워드</td>
<td width="100">이름</td>
<td width="250">가입일자</td>
</tr>
<%
Connection conn = null;
PreparedStatement pstmt = null;
ResultSet rs = null;

try {
String jdbcUrl="jdbc:oracle:thin:@localhost:1521:xe";
String dbId="c##scott";
String dbPassword="seryong0217";

Class.forName("oracle.jdbc.driver.OracleDriver");
conn=DriverManager.getConnection(jdbcUrl, dbId, dbPassword);

String sql = "select * from member";
pstmt=conn.prepareStatement(sql);
rs=pstmt.executeQuery();

while(rs.next()) {
String id = rs.getString("id");
String password = rs.getString("password");
String name = rs.getString("name");
Timestamp register = rs.getTimestamp("reg_date");
%>
<tr>
<td width="100"><%=id %></td>
<td width="100"><%=password %></td>
<td width="100"><%=name %></td>
<td width="250"><%=register.toString() %></td>
</tr>
<%}
}catch(Exception e) {
e.printStackTrace();
} finally {
if(rs != null) {
try{
rs.close();
} catch(SQLException sqle) {}
}
if(pstmt != null) {
try {
pstmt.close();
} catch(SQLException sqle) {}
}
if(conn != null) {
	try{
		conn.close();
	} catch(SQLException sqle) {}
}
}%>

</table>

</body>
</html>