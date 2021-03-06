package org.comstudy21.db_select;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import org.comstudy21.util.JdbcUtil;

public class DBInsertEx {
	public static Connection conn = JdbcUtil.getConnection();
	public static PreparedStatement pstmt;
	public static String sql = "INSERT INTO MEMBERS(name, email, phone) VALUES(?,?,?)";
	
	// DAO 역할
	public static void insert(String name, String email, String phone) {
//		String name = "test1";
//		String email = "test@shop.com";
//		String phone = "010-5555-5555";
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, name);
			pstmt.setString(2, email);
			pstmt.setString(3, phone);
			int cnt = pstmt.executeUpdate();
			if(cnt >0) {
				System.out.println("입력 성공!");
			} else {
				System.out.println("입력 실패!");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			
				try {
					if(pstmt != null) pstmt.close();
					if(conn != null) conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
		}
		
	}
	
	
	// Controller 역할
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("성명 입력 : ");
		String name = scan.next();
		System.out.print("이메일 입력 : ");
		String email = scan.next();
		System.out.print("전화번호 입력 : ");
		String phone = scan.next();
		
		insert(name, email, phone);
		
		System.out.println("----- 입력 성공 -----");
		DBSelectEx2.main(null); // 출력 
	}

}
