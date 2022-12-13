package com.hanul.File;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Ex73_FileWriter {

	public static void main(String[] args) {
		
		FileWriter writer = null;
		try {
			writer = new FileWriter("output.txt");
			char[] data = {'자', '바', ' ', '프', '로', '그', '래', '밍', ' ', '중', '급'};
//			for(int idx = 0; idx<data.length; idx++) {
//				writer.write(data[idx]);
//			}
			writer.write(data);  // for문으로도 할 수 있고 이렇게도 쓸 수 있음
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				writer.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
		
	}

}
