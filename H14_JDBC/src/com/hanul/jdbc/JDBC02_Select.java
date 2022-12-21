package com.hanul.jdbc;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class JDBC02_Select {

	public static void main(String[] args) {

		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		ArrayList<Employees> empArr = new ArrayList<Employees>();
		
		try {
			// 1. 드라이버 생성 : Class.forName(로드하는 드라이버명) 메소드
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			// 2. 데이터베이스 연결 : Connection 객체 필요
			//					  DriverManager.getConnection(연결하는 데이터베이스 url, DB의 사용자이름, 패스워드) 메소드
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			conn = DriverManager.getConnection(url,"hr","0000");

			// 3. SQL문 선언
			String sql = "select * from employees";
			
			
			// 4. DB에 SQL문 실행 : SQL문 실행 기능이 있는 Statement 클래스  -> import 할때 java.sql로, executeQuery() 사용
			stmt = conn.createStatement();
			
			// 5. 만약 받아오는 결과물이 있으면 받음 : ResultSet 타입의 객체에 담는다
			rs = stmt.executeQuery(sql);
			
			// 6. 결과 데이터행을 출력해보자
			while(rs.next()) {
				int emp_id = rs.getInt("EMPLOYEE_ID");
				String firstname = rs.getString("first_name");
				String lasttname = rs.getString("last_name");
				String email = rs.getString("email");
				String phone_number = rs.getString("phone_number");
				Date hire_date = rs.getDate("hire_date");
				String job_id = rs.getString("job_id");
				int salary = rs.getInt("salary");
				int commission_pct = rs.getInt("commission_pct");
				int manager_id = rs.getInt("manager_id");
				int department_id = rs.getInt("department_id");
				
				empArr.add(new Employees(emp_id, salary, commission_pct, manager_id, department_id, 
								firstname, lasttname, email, phone_number, job_id, hire_date));
				
				//System.out.println(emp_id + ", " + name + ", " + + salary + ", " + hire_date);
				
			}
			System.out.println(empArr.size());
			
			for(int i=0; i<empArr.size(); i++) {
				if(empArr.get(i).getDepartment_id() == 110) {
					System.out.println(empArr.get(i).getDepartment_id() +
							", " + empArr.get(i).getEmployee_id() +
							", " + empArr.get(i).getEmail() +
							", " + empArr.get(i).getFirst_name() +
							", " + empArr.get(i).getHire_date() );
				}
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
