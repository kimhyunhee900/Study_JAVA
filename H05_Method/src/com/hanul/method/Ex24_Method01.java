package com.hanul.method;

public class Ex24_Method01 {

	// 지금까지 썼던게 만들어진 method.
	// 클래스의 구성요소 필드, 메소드, 생성자 
	// method : 클래스가 가지고 있는 데이터(변수, 필드)를 어떻게 처리할지에 대한 기능적인 부분을 담당

	public static void main(String[] args) {

		// 접근제한자 public, protected, default, private
		// 여기서 public은 접근제한이 없다 == 아무데서나 호출 가능 == 같은 프로젝트 내에서만
		//										private은 같은 패키지내에서만
		//							아무것도 적히지않으면 default
		// 지정 예약어 static == 항상 쓸수있음
		// 리턴타입 void == 넘겨주는게 없을때 사용
		//		void가 int -> int형을 넘겨주고, String -> String으로 넘겨준다
		//		즉 어떤 타입이믄 넘길 수 있고 넘겨받는곳에서는 반드시 같은 타입으로 받아야한다.
		// 메소드명(매개변수:파라미터) == main 메소드는 문자열배열[] 타입의 매개변수를 갖는 형태로 정해져있으나,
		// 일반적인 메소드는 매개변수가 있을수도,없을수도 있다
		// 기본적인 메소드의 정의 = 리턴타입 + 메스드명(매개변수){...}
	
		printCharacter();
		System.out.println("Hello Hanul !!!");
		printCharacter();
		
		printCharPara('#');
		System.out.println("Hello Hanul !!!");
		printCharPara('$');
		
		printCharParaCnt('@', 15);
		System.out.println("Hello Hanul !!!");
		printCharParaCnt('$', 10);
		
		printCharParaCnt('@', 15);
		System.out.println("Hello Java !!!");
		printCharParaCnt(10, '$');
		
	}
	//문자를 출력하는 메소드를 만든다
	static void printCharacter() {
		for(int i = 0; i < 13; i++) {
			System.out.print("*");
		}
		System.out.println();
	}
	
	static void printCharPara(char ch) {
		for(int i = 0; i < 13; i++) {
			System.out.print(ch);
		}
		System.out.println();
	}
	
	static void printCharParaCnt(char ch, int cnt ) {
		for(int i = 0; i < cnt; i++) {
			System.out.print(ch);
		}
		System.out.println();
	}
	
	static void printCharParaCnt(int cnt, char ch) {
		for(int i = 0; i < cnt; i++) {
			System.out.print(ch);
		}
		System.out.println();
	}
	
	
}
