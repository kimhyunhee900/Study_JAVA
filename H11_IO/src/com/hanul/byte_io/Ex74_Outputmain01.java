package com.hanul.byte_io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex74_Outputmain01 {

	public static void main(String[] args) {

		FileOutputStream out = null;
		try {
			// write 파일 객체 선언
			out = new FileOutputStream("output.dat");
			byte[] data = {0,1,2,3,4,5,6,7,8,9};
			out.write(data);
			
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
		
		FileInputStream in = null;
		try {
			in = new FileInputStream("output.dat");
			int data;
			while((data = in.read()) != -1) {
				System.out.println(data);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
