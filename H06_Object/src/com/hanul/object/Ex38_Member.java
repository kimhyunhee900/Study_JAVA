package com.hanul.object;

public class Ex38_Member {

	// 회원의 이름, 아이디, 패스워드, 폰번호, 나이
	// 회원객체를 처음 생성할때 이름, 아이디, 패스워드는 무조건 입력
	// 나머지 정보는 있으면 입력받을 수 있게 생성자를 작성하시오
	
	String name, id, pw, phoneN;
	int age;
	
	public Ex38_Member(){}
	
	public Ex38_Member(String name, String id, String pw) {
		this.name = name;
		this.id = id;
		this.pw = pw;
	}
	
	public Ex38_Member(String name, String id, String pw, String phoneN) {
		this.name = name;
		this.id = id;
		this.pw = pw;
		this.phoneN = phoneN;
	}
	
	public Ex38_Member(String name, String id, String pw, String phoneN, int age) {
		this.name = name;
		this.id = id;
		this.pw = pw;
		this.phoneN = phoneN;
		this.age = age;
	}
	
	
	
	
	
	
	
	
}
