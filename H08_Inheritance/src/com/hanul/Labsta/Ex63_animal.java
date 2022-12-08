package com.hanul.Labsta;

public abstract class Ex63_animal {

	String kinds;

	public Ex63_animal(String kinds) {
		this.kinds = kinds;
	}
	
	public void eat() {
		System.out.println(kinds + "먹는다");
	}
	
	public void sleep() {
		System.out.println(kinds + "잠을 잔다");
	}
	
	abstract void sound();
	
}
