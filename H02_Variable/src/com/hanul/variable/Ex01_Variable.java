package com.hanul.variable;

public class Ex01_Variable {
	public static void main(String[] args) {

 /*
	System.out.println(75);
	System.out.println(0b1001011);
	System.out.println(0113);
	System.out.println(0x4b);
 모든 클래스는 첫번째에 main 함수가 들어가야한다.
 syso는 system.out.printLn의 약자다.
 2진수, 8진수, 10진수, 16진수, 32진수 등 기계어로 DB를 받는 경우 구글에 진수변환기 검색 후 사용하면된다.
 */
/*
 byte(1byte=8bit) : -128~127
 short(2byte=16bit) : -32768 ~ 32757
 int(4byte=32bit) : -2147483648 ~ 2147483647
 long(8byte=64bit) : -9223372036854775808 ~ 9223372036854775807
 선언 : 데이터타입 변수명(보통 소문자) -> int num;으로만 되어있을시 선언만 한거고 메모리에 저장되지않음
 		int(타입) num(변수명);
 		System.out.println(num); -> 사용불가능
 초기화(값)을 설정시 사용가능 -> int num=10;  => 선언과 초기화를 같이하는것
 ★선언시 변수에 맞춰서 타입을 설정해야함 / 정수, 실수, 논리형, 상수
*/
	int num = 10;
	System.out.println(num);
 
	// 선언과 초기화 같이
		int num1 = 15;
	// 여러개를 같이 쓰고자 할때
		int num2 = 21, num3 = 100, num4 = 50;
		
		System.out.println(num);
		System.out.println(num+num1);
	//character는 줄여서 char 표현하고 / ch라는 문자는 A라고 변수명을 정해놓은거임
		char ch='A';
		System.out.println(ch);
	
	//연습
		System.out.println(num3-num4);
		System.out.println(num4-num3);
		
		char cc='Q';
		System.out.println(cc);
		
		String 김="김현희";
		System.out.println(김);
	}
}
