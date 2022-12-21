package com.hanul.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC03_Update {

	public static void main(String[] args) {

		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
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
			// 100번 사원의 급여, 이메일, 전화번호를 변경한다
			String sql = "update employees set " + "salary=26000, email = 'king@naver.com', phone_number='010-4567-9852' "
						+ " where employee_id = 100";
			
			// 3-1 Statement 객체생성
			stmt = conn.createStatement();
			// insert, update, delete 문을 실행할때는 Statement 객체의 executeUpdate() 메소드 사용해야한다
			// 3-2 쿼리문 실행
			int cnt = stmt.executeUpdate(sql);
			if(cnt>0) {
				System.out.println("업데이트 성공");
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			// 7. DB 연결 해제
			try {
				if(rs != null) {
					rs.close();
				}
				if(stmt != null) {
					stmt.close();
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
