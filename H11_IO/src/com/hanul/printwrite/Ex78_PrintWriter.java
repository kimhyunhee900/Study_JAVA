package com.hanul.printwrite;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Ex78_PrintWriter {

	public static void main(String[] args) {

		//다양한 타입의 출력에 특화된 문자 스트림 클래스로 자동 flush() 기능을 제공
		//데이터를 포맷해서 파일로 출력할때 사용한다
		PrintWriter writer = null;
		try {
			writer = new PrintWriter("report.txt");
			writer.println("---- 성 적 표 ----");
			writer.println("성명\t JAVA\t oracle\t 평균");
			writer.printf("%s\t %3d\t %3d\t %4.1f\n","홍길동", 80, 92,(80+92)/2f);
			writer.printf("%s\t %3d\t %3d\t %4.1f\n","전우치", 90, 99,(90+99)/2f);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			writer.close();
		}
		
		
	}

}
