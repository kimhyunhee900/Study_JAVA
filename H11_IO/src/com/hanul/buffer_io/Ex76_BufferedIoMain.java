package com.hanul.buffer_io;

import java.io.File;

public class Ex76_BufferedIoMain {
	
	public static void main(String[] args) {
		
		//파일의 경로를 지정해서 파일을 만들 수 있음
		String filepath = "src/buffer_io";
		
		File dir = new File(filepath);
		if(!dir.exists() || !dir.isDirectory()) {
			dir.mkdirs();
		}
		String filename = filepath + "buffered.dat";
		
	}

}
