package com.hanul.variable;

public class Ex04_Double {

	public static void main(String[] args) {

		// 실수형 float(4byte), double(8byte) : 기본형은 double
		// 1200000000 = 12 X 10^8
		// 0.0000000012 = 12 X 10^-10
		
		double pi = 3.14;
		System.out.println("pi값 : " + pi);
		System.out.println("pi+1값 : " + (pi + 1));
		
		// 논리형 boolean(1byte) : true, false
		// 이냐아니냐, 이거냐저거냐 인 경우 앞에 is를 붙여서 구분
		// ctrl+스페이스바 누르면 자동완성
		boolean isBreakfast = true;
		System.out.println(isBreakfast);
		boolean isLunch = false;
		System.out.println(isLunch);
		
		// 상수 Constant : 바꿀 수 없는 값. 정해진 값. 변하지 않는 값
		// 상수는 앞에 final 선언, 변수는 대문자로 표현
		final double PI = 3.14;
		// PI = 3.2;
		System.out.println("원주율 : " + PI);
		
		final int adult = 100;
		System.out.println(adult);
		
	}

}
