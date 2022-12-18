package com.hanul.collection;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

public class Ex85_HasnMap {

	public static void main(String[] args) {
//
//		// HashMap<Key, Value> 형태로 저장
//		// 저장공간을 key별로 구분하여 저장하기때문에 접근속도가 빠르다
//		
//		// HashMap<String, Integer> map = new HashMap<>(30);
//		HashMap<String, Integer> map = new HashMap<>();
//		// 데이터 저장 : put(키, 데이터), 이름, 영어점수
//		map.put("홍길동", 88);
//		map.put("심청", 90);
//		map.put("전우치", 85);
//		map.put("박문수", 98);
//		
//		// 데이터 조회 : get(키값)
//		int score = map.get("심청");
//		System.out.println(score);
//		
//		// 데이터 삭제 : remove(키값)
//		map.remove("전우치");
//		score = map.get("전우치");
//		// System.out.println(score);  => null : error
//		
		HashMap<String, Ex85_1_Student> studentList = new HashMap<>();
		ArrayList<Ex85_1_Student> studArrayList = new ArrayList<>();
		
		
		//읽기
		BufferedReader in = null;
		try {
			in = new BufferedReader(new FileReader("list.txt"));
			String data;
			while((data=in.readLine()) != null){
				System.out.println(data);
				// studentarr를 만들어서 data를 자르겠다. 기준은 "," 이걸로!
				String[] studentarr = data.split(",");  
				// 잘라진 데이터를 인덱스로 접근하여 데이터 내용을 가져와서 
				// ArrayList에 넣는다
				studArrayList.add(new Ex85_1_Student(studentarr[0], studentarr[1], studentarr[2], studentarr[3]));
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

	}
	}
