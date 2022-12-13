package com.hanul.byte_io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class Ex75_byteIoMain {

	public static void main(String[] args) {

		//키보드로 구구단 단 수를 입력받아 입력받은 단의 결과값을 배열변수에 담는다.
		//예) 3단 : 3,6,9,12,15,18,21,24,27
		
		//배열에 담긴 데이터(입력받은 구구단 결과값)를 3단.dat 파일에 쓰기작업을 한 후
		//3단.dat 파일의 내용을 읽어들여 출력하시오
		
		FileOutputStream data = null;
		try {
			data = new FileOutputStream("3단.dat");
			byte[] dan = {3,6,9,12,15,18,21,24,27};
			data.write(dan);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				data.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		FileInputStream in = null;
		try {
			in = new FileInputStream("3단.dat");
			int indata;
			while((indata = in.read()) != -1) {
				System.out.println(indata);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
	}

}
