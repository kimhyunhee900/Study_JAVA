package com.hanul.collection;

import java.util.ArrayList;

public class Ex84_ArrayList02 {

	public static void main(String[] args) {

		// 모든 자료구조는 레퍼런스 타입만 저장할 수 있으므로
		// 프리미티브타입의 데이터를 자료구조에 저장할때는 Wrapper클래스를 사용
		
		ArrayList<Integer> list = new ArrayList<>();
		
		Integer a = new Integer(10);
		list.add(a);
		list.add(new Integer(20));
		int b = 25;
		list.add(b);
		list.add(30);
		for(int aa : list) {
			System.out.print(aa + " ");
		}System.out.println();
		
		
	}

}
