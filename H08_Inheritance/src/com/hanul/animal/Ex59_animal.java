package com.hanul.animal;

abstract public class Ex59_animal {

	// 품종
	String kind;

	public Ex59_animal(String kind) {
		this.kind = kind;
	}
	
	public void eat() {
		System.out.println(kind + "먹는다");
	}
	
	public void sleep() {
		System.out.println(kind + "잠을 잔다");
	}
	
	// 비슷한 일을 추상 메소드로 선언하고 구현하지 않는다
	abstract void doWhat();
	
	// 추상 메소드는 객체 못만들고, 클래에스에도 abstract을 써줘야 하고, 하위클래스에서 반드시 선언을 해줘야함
	
}
