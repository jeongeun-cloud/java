package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCUtil {

	public static Connection getConnection() {
		try {
			Class.forName("org.h2.Driver");	
			String url = "jdbc:h2:tcp://localhost/~/test";
			String user = "sa";
			String password = "";
			return DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 검색 실패!");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("DB 컨넥션 실패");
			e.printStackTrace();
		} 
		return null;
	}
	
	
	// 오버로딩 (다른 db컨넥할 경우)
	public static Connection getConnection(String driver, String url, String user, String password) {
		try {
			Class.forName(driver);	
			return DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 검색 실패!");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("DB 컨넥션 실패");
			e.printStackTrace();
		} 
		return null;
	}

}
