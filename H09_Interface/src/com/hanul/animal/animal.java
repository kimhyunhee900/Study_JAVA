package com.hanul.animal;

abstract public class animal {

	// 품종
	String kind;

	public animal(String kind) {
		this.kind = kind;
	}
	
	public void eat() {
		System.out.println(kind + "먹는다");
	}
	
	public void sleep() {
		System.out.println(kind + "잠을 잔다");
	}
	

}
