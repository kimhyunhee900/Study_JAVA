package com.hanul.Inheritance;

public class Ex53_People {

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

	
	
	
}
