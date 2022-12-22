package com.hanul.email;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


public class EmailSenderMain2 {

	//이메일 전송 클래스
	public static void main(String[] args) {

		// 1. 리스트 불러와서 배열에 집어넣는다
		ArrayList<Student> studArrayList = new ArrayList<>();
		//읽기
			BufferedReader in = null;
			try {
				in = new BufferedReader(new FileReader("list.txt"));
				String data;
				while((data=in.readLine()) != null){
					System.out.println(data);
					// studentarr를 만들어서 data를 자르겠다 split. 기준은 "," 이걸로!
					String[] studentarr = data.split(",");  
					// 잘라진 데이터를 인덱스로 접근하여 데이터 내용을 가져와서 
					// ArrayList에 넣는다
					studArrayList.add(new Student(studentarr[0], studentarr[1], studentarr[2], studentarr[3]));
				}
				System.out.println("listSize: " + studArrayList.size());
				System.out.println(studArrayList.get(0).getName());
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
		
		EmailSender2 sender = new EmailSender2("khh4477@naver.com","dudfhrdl90@@!!","김현희");
		//sender.sendSimple("sehee0623@naver.com","김세희");
		sender.sendSimple(studArrayList);
		
		
	}

}
