package com.hanul.method;

public class Ex25_Method02 {

	public static void main(String[] args) {

		// 사칙연산을 하는 메소드
		// add ( int no1, int no2) : 두 수를 더 한 값을 출력
		// sub ( int no1, int no2) : 두 수를 뺀 값을 출력
		
		add(1,2);
		sub(1,2);
	}
	
	static void add(int no1, int no2) {
		int add = no1 + no2;
		System.out.println(add);
	}
	
	static void sub(int no1, int no2) {
		int sub = no1 - no2;
		System.out.println(sub);
	}
	
	

}
