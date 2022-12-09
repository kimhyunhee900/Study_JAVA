package com.hanul.Inheritance;

public class Ex51_Student extends Ex53_People {

	// 학번, 이름, 나이
	// 먹는다, 잠을 잔다, 회사에 간다
	
	String studentN;
							// extends class명 해놓으면 밑처럼 상위클래스가 자동으로 붙음
	public Ex51_Student(String name, int age, String studentN) {
		super(name, age);
		this.studentN = studentN;
	}

//	void gotoschool() {
//		System.out.println(name + " 등교한다");
//	}

	@Override
	void go(){
		System.out.println(name + " 등교한다");
	}
	
	
}
