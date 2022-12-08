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
	
	
}
