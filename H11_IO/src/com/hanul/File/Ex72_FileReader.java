package com.hanul.File;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Ex72_FileReader {

	public static void main(String[] args) {
		//문자파일 읽고 쓰기
		FileReader reader = null;
		try {
			reader = new FileReader("reader.txt");
			int data;
			while((data=reader.read()) != -1 ) {
				char ch = (char)data;
				System.out.print(ch);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
			
	}
}