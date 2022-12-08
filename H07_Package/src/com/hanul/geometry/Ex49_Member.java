package com.hanul.geometry;

public class Ex49_Member {

	// 회원의 이름, 아이디, 패스워드, 폰번호, 나이
	// 회원객체를 처음 생성할때 이름, 아이디, 패스워드는 무조건 입력
	// 나머지 정보는 있으면 입력받을 수 있게 생성자를 작성하시오
	// 메소드 : 폰번호 변경, 패스워드 변경, 나이변경 메스드를 작성하시오
	
	
	public String name, id, pw, phoneN;
	public int age;
	
		// public Ex38_Member(){}  -> 빈 생성자는 무조건 받는 값이 있으니 애초에 만들지않음. 
	
	public Ex49_Member(String name, String id, String pw) {
		this.name = name;
		this.id = id;
		this.pw = pw;
	}
	
	public Ex49_Member(String name, String id, String pw, String phoneN) {
		this.name = name;
		this.id = id;
		this.pw = pw;
		this.phoneN = phoneN;
	}
	
	public Ex49_Member(String name, String id, String pw, int age) {
		this.name = name;
		this.id = id;
		this.pw = pw;
		this.phoneN = phoneN;
		this.age = age;
	}
	
	public Ex49_Member(String name, String id, String pw, String phoneN, int age) {
		this.name = name;
		this.id = id;
		this.pw = pw;
		this.phoneN = phoneN;
		this.age = age;
	}
	
	public Ex49_Member(String name, String id, String pw, int age, String phoneN) {
		this.name = name;
		this.id = id;
		this.pw = pw;
		this.phoneN = phoneN;
		this.age = age;
	}
	
	public void chna(String name) {
		this.name = name;
	}
	
	public void chpw(String pw) {
		this.pw = pw;
	}
	
	public void chage(int age) {
		this.age = age;
	}
}


