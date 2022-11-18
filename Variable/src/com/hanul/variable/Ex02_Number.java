package com.hanul.variable;

public class Ex02_Number {

	public static void main(String[] args) {

	byte no1 = -128;
	//byte no2 = 128;
	
	short no3 = 10000;
	//int no4 = 12345678900;
	int no4 = 1234567890;
	long no5 = 1234567890;
	long no6 = 12345678900l;
	//long no6 = 12345678900L; 소문자, 대문자 둘 다 같음 
	
	int no7 = 800, no8 = 900;
		int sum = no7 + no8;
		System.out.println(sum);
	int no9 = 1000, no10 = 1100;
		int sub = no10 - no9;
		System.out.println(sub);
		
	//선언한 값 복사
		int no11 = 123, no12;
		no12 = no11;
		System.out.println(no12);
		
	}

}
