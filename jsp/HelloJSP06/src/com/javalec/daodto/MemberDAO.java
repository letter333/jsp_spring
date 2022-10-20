package com.javalec.daodto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class MemberDAO {	
	private Connection conn = null;
	private PreparedStatement pstmt = null;
	private ResultSet rs = null;
	private DataSource ds = null;
	
	public MemberDAO() {
		try {
			Context ctx = new InitialContext();
			ds = (DataSource)ctx.lookup("java:comp/env/jdbc/mysql");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	public int memberInsert(MemberDTO m) {
		int result = -1;
		conn = null;
		pstmt = null;
		try {
//			conn = DriverManager.getConnection(url, uid, upw);
			conn = ds.getConnection();
			String query = "insert into memberDTO values (?, ?, ?, ?)";
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, m.getName());
			pstmt.setString(2, m.getId());
			pstmt.setString(3, m.getPw());
			pstmt.setString(4, m.getGender());
			
			result = pstmt.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				pstmt.close();
				conn.close();				
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		
		return result;
	}
	
	public List<MemberDTO> memberSelect() {
		                            
		List<MemberDTO> mList = new ArrayList<MemberDTO>();
		try {
//			conn = DriverManager.getConnection(url, uid, upw);
			conn = ds.getConnection();
			String query = "select * from memberdto";
			pstmt = conn.prepareStatement(query);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				do {
					MemberDTO m = new MemberDTO();
					m.setName(rs.getString("name"));
					m.setId(rs.getString("id"));
					m.setPw(rs.getString("pw"));
					m.setGender(rs.getString("gender"));
					
					mList.add(m);
				} while(rs.next());
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				pstmt.close();
				conn.close() ;
			} catch (Exception e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
		}
		
		return mList;
	}
	
	public MemberDTO memberSelect2(String id) {
		MemberDTO member = new MemberDTO();
		
		try {
//			conn = DriverManager.getConnection(url, uid, upw);
			conn = ds.getConnection();
			String query = "select * from memberdto where id = ?";
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			
			rs.next();
			
			member.setName(rs.getString("name"));
			member.setId(rs.getString("id"));
			member.setPw(rs.getString("pw"));
			member.setGender(rs.getString("gender"));
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				pstmt.close();
				conn.close() ;
			} catch (Exception e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
		}
		return member;
	}
	
	// DJT
	public MemberDTO checkMember(MemberDTO m) {
		MemberDTO dto = new MemberDTO();
		conn = null;
		pstmt = null;
		try {
//			conn = DriverManager.getConnection(url, uid, upw);
			conn = ds.getConnection();
			String query = "select * from memberdto where id = ?";
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, m.getId());
			rs = pstmt.executeQuery();
			rs.next();
			dto.setName(rs.getString("name"));
			dto.setId(rs.getString("id"));
			dto.setPw(rs.getString("pw"));
			dto.setGender(rs.getString("gender"));
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				pstmt.close();
				conn.close();
			} catch (Exception e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
		}
		
		return dto;
	}
	
	public int updateMember(MemberDTO m) {
		conn = null;
		pstmt = null;
		
		int result = -1;
		
		try {
			conn = ds.getConnection();
			String query = "update memberdto set name= ?, gender = ? where id = ?";
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, m.getName());
			pstmt.setString(2, m.getGender());
			pstmt.setString(3, m.getId());
			result = pstmt.executeUpdate();
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			try {
				pstmt.close();
				conn.close();
			} catch (Exception e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
		}
		
		return result;
	}
	
	public int updatePassword(MemberDTO m) {
		conn =  null;
		pstmt = null;
		
		int result = -1;
		
		try {
			conn = ds.getConnection();
			String query = "update memberdto set pw = ? where id = ?";
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, m.getPw());
			pstmt.setString(2, m.getId());
			result = pstmt.executeUpdate();
						
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			try {
				pstmt.close();
				conn.close();
			} catch (Exception e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
		}
		return result;
	}
}
