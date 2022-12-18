package com.hanul.buffer_io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ex77_BufferedRWMain {

	public static void main(String[] args) {
		
		//상대경로에 디렉토리를 만들고자 할때
			String filepath1 = "src/buffer_io";		
			File dir = new File(filepath1);
			if(!dir.exists() || !dir.isDirectory()) {
				dir.mkdirs();
			}
		
		String filename = filepath1 + "/buffered.txt";
		// 쓰기
		BufferedWriter out = null;
		try {
			out = new BufferedWriter(new FileWriter(filename));
			char data[] = {'안','녕','!','\n','오','늘','도','\n','즐','거','운','하','루','\n'};
			out.write(data);
			out.flush();    //버퍼가 다 채워지지않더라도 스트림을 내보내라는 명령어
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				out.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("쓰기끝!");
		
		//읽기
		BufferedReader in = null;
		try {
			in = new BufferedReader(new FileReader(filename));
			int data;
			while((data=in.read()) != -1){
				System.out.print((char)data);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				in.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	System.out.println("read읽기끝!");
		

	}
	}
}
