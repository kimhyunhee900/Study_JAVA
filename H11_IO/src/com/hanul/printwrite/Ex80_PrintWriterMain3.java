package com.hanul.printwrite;

import java.io.File;
import java.io.PrintWriter;

public class Ex80_PrintWriterMain3 {

	public static void main(String[] args) {

		File dir = new File("src/printwrite");
		if(!dir.exists() || !dir.isDirectory()) {
			dir.mkdirs();
		}
		
		String[][] studentInfo = {  // 2배열 줄수있고 00으로 되고, 홍길동은 01,02,..심청은 10,11,...
				{"홍길동","남","010-1111-2222","hanul@naver.com"},
				{"심청","여","010-1111-5555","hanulll@daum.net"}
		};
		
		
		
		PrintWriter writer = null;
		try {
			writer = new PrintWriter(dir+"/"+"student.html");
			writer.println("<html>");
			writer.println("<body>");
			writer.println("<h1>학생명단</h1>");
			writer.println("<table border='1'>");
			
			writer.println("<tr>");
			writer.println("<th>성명</th><td>홍길동</td>");
			writer.println("</tr>");
			writer.println("<tr><th>성별</th><td>남</td></tr>");
			writer.println("<tr><th>연락처</th><td>010-111-2222</td></tr>");
			writer.println("<tr><th>이메일</th><td>hanul@naver.com</td></tr>");
			
			writer.println("<table border='1'>");
			writer.println("<tr><th>성명</th><th>성별</th><th>연락처</th><th>이메일</th></tr>");
			writer.println("<tr><th>홍길동</th><th>남</th><th>010-2122-2144</th><th>dkad@naver.com</th></tr>");
			writer.println("<tr><th>심청</th><th>여</th><th>010-2994-8888</th><th>adff@naver.com</th></tr>");
		
			
			writer.println("</table>");
			writer.println("</body>");
			writer.println("</html>");
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			writer.close();
		}

	}

}
