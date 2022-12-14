package com.hanul.variable;

public class Ex03_Char {

	public static void main(String[] args) {

		//char은 한글자만 가능하고 '으로 해야함
		char ch1 = 'A';
		System.out.println("ch1에 저장된 값은 " + ch1 + "입니다");
		char ch2 = 'B';
		System.out.println("ch2에 저장된 값은 " + ch2 + "입니다");
		
		// String은 두 글자이상, 값이 없는 ""; 으로도 가능
		String str = "가나다";
		System.out.println("str에 저장된 값은 " + str + "입니다");
		String strr = "";
		System.out.println("strr에 저장된 값은 " + strr + "입니다");
		
		//문자를 int형으로 (명시적)변환(캐스팅)하여 표현 / 강제로 시키는건 명시적, 반대는 묵시적
		char ch3 = '가';
		System.out.println("문자 A의 정수값은 " + (int)ch1 + "입니다");
		System.out.println("문자 A의 정수값은 " + (int)ch3 + "입니다");
		System.out.println("문자 65의 정수값은 " + (char)65 + "입니다");
		System.out.println("문자 44032의 정수값은 " + (char)44032 + "입니다");

		// 이스케이프 Escape 문자
		// 문자를 문자가 아니라 특정 기호로 인식하게 할 때 사용
		// \t(=tab), \n(줄바꿈), \\(기호 그대로 인식하게 사용), \'('로 사용), \"("로 사용)
		System.out.println("여러분~~ \n\t\"반갑습니다!\"");
		
	
	}

}
