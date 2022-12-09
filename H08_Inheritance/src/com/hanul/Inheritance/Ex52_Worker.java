package com.hanul.Inheritance;

public class Ex52_Worker extends Ex53_People {

	String workerN;
	
	public Ex52_Worker(String name, int age, String workerN) {
		super(name, age);
		this.workerN = workerN;
	}

//	void gotoWork() {
//		System.out.println(name + " 출근한다");
//	}

	@Override
	void go() {
		System.out.println(name + " 출근한다");
	};
	
}
