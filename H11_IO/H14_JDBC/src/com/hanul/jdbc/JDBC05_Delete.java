package com.hanul.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBC05_Delete {

	public static void main(String[] args) {

		//PreparedStatement 를 사용하여 employee_id 가 700인 사람을 삭제하라
		
		Connection conn = null;
		PreparedStatement ps = null;
		
		try {
			// 1. 드라이버 생성 : Class.forName(로드하는 드라이버명) 메소드
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			// 2. 데이터베이스 연결 : Connection 객체 필요
			//					  DriverManager.getConnection(연결하는 데이터베이스 url, DB의 사용자이름, 패스워드) 메소드
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			//String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe"; 위와 같음
			//String url = "jdbc:oracle:thin:@ㅁㅁㅁㅁ:1521:xe"; 위와 같음
			//ㅁㅁㅁㅁ => cmd에 ipconfig 해서 해당컴퓨터의 IP 주소를 넣어도 같음
			conn = DriverManager.getConnection(url,"hr","0000");
			
			// 3. SQL문 선언
			String sql = "select * from employees where employee_id=?";
			
			
			// 4. DB에 SQL문 실행 : SQL문 실행 기능이 있는 Statement 클래스  -> import 할때 java.sql로, executeQuery() 사용
			ps = conn.prepareStatement(sql);
			ps.setInt(1, 700);
			
			// 5. 만약 받아오는 결과물이 있으면 받음 : ResultSet 타입의 객체에 담는다
			
			int cnt = ps.executeUpdate();
			if(cnt>0) {
				System.out.println("삭제 성공");
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			// 7. DB 연결 해제
			try {
				if(ps != null) {
					ps.close();
				}
				if(conn != null) {
					conn.close();
				}
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		
	}

}
