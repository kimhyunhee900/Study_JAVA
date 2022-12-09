package com.hanul.Inheritance;

abstract public class Ex53_People {

	String name;
	int age;
	
	public Ex53_People(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void eat() {
		System.out.println(name + " 먹는다");
	}
	
	public void sleep() {
		System.out.println(name + " 잠잔다");
	}

	abstract void go();
	
	// 추상 메소드 abstract
	// 슈퍼클래스에는 클래스이름 앞에 abstract 입력, abstract method에 abstract void (go)();로 입력.
	// 서브클래스에는 abstract은 쓰지않고
	// @Override
	// void go() {
	//	 System.out.println(name + " 출근한다");
	//	};
	// 위처럼 서브클래스에는 @override 먼저 입력 후 void로 보냈으니 void로 받아서 입력하기
	// 하위 클래스에서 extends 상위클래스 이름 해줘야함 

}
