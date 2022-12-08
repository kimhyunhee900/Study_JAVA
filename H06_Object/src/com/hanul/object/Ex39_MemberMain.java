package com.hanul.object;

public class Ex39_MemberMain {

	public static void main(String[] args) {

		Ex38_Member hong = new Ex38_Member("홍길동","hanul001","hong112");
		printMb(hong);
		
		Ex38_Member sim = new Ex38_Member("심청","hanul002","sim1234","010-123-456");
		printMb(sim);
		
//		Ex38_Member hyun = new Ex38_Member("현빈","hanul002","hyun1234","010-899-689", 35);
//		printMb(hyun.name, hyun.id, hyun.pw, hyun.phoneN, hyun.age);
//		
//		Ex38_Member you = new Ex38_Member("공유","hanul003","you4321", 27, "010-891-745");
//		printMb(you.name, you.id, you.pw, you.phoneN, you.age);
	}
//	static void printMb(String name, String id, String pw, String phoneN, int age) {
//		System.out.println("이름 : " + name);
//		System.out.println("아이디 : " + id);
//		System.out.println("패스워드 : " + pw);
//		System.out.println("전화번호 : " + phoneN);
//		System.out.println("나이 : " + age);
//	}
	
	static void printMb(Ex38_Member mb) {
		System.out.println("이름 : " + mb.name);
		System.out.println("아이디 : " + mb.id);
		System.out.println("패스워드 : " + mb.pw);
		System.out.println("전화번호 : " + mb.phoneN);
		System.out.println("나이 : " + mb.age);
	}
	
//	static void printMb(Ex38_Member mb, ing aa) {   // 이처럼 mb 자체를 보내고, 추가로 더 입력할 수 있음
//		System.out.println("이름 : " + mb.name);
//		System.out.println("아이디 : " + mb.id);
//		System.out.println("패스워드 : " + mb.pw);
//		System.out.println("전화번호 : " + mb.phoneN);
//		System.out.println("나이 : " + mb.age);
//	}
	
}
