package com.hanul.object;

public class Ex44_Student {

	// 학생정보관리 클래스 : 학번이 자동으로 부여되는 학생정보를 관리
	static int seqId = 220000;  //학번 부여 변수
	int id;  //학생에게 부여된 학번
	String name, phoneNo;
	
	//생성자
	public Ex44_Student(String name) {
		this.id = ++seqId;
		this.name = name;
	}
	
	public Ex44_Student(String name, String phoneNo) {
		//this(name);
		this.id = ++seqId;
		this.name = name;
		this.phoneNo = phoneNo;
	}
	
	
	
	
}
