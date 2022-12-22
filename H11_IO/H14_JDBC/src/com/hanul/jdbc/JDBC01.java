package com.hanul.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

import oracle.net.nt.ConnectDescription;

public class JDBC01 {
	
	public static void main(String[] args) {
		
		// 1. 오라클 드라이버(ojdbc8.jar)를 다운로드 하여 lib 폴더에 넣는다
		// 2. 마우스우클릭 Build path -> Configure Build path -> 라이브러리 -> classpath -> Add External JARs
		//				-> 3파일 추가 -> 어플라이엔클로우즈
		
		try {
			// 1. 드라이버 생성 : Class.forName(로드하는 드라이버명) 메소드
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이브 생성 완료");
			
			// 2. 데이터베이스 연결 : Connection 객체 필요
			//					  DriverManager.getConnection(연결하는 데이터베이스 url, DB의 사용자이름, 패스워드) 메소드
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			Connection conn = DriverManager.getConnection(url,"hr","0000");
			System.out.println("DB접속성공");
			
			// 3. SQL문 선언
			
			
			
			// 4. DB에 SQL문 실행
			
			
			// 5. 만약 받아오는 결과물이 있으면 받음
			
			// 6. DB 연결 해제
			conn.close();
			
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
