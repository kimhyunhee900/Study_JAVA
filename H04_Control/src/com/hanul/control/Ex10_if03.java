package com.hanul.control;

import java.util.Scanner;

public class Ex10_if03 {

	public static void main(String[] args) {

/*		// 스캐너를 생성하여 나이를 입력받아 버스비를 계산하는 프로그램
		// 일반:20살이상 - 1250, 청소년:14살이상 - 800, 어린이:7살이상 - 400, 유아:7살미만 - 0
		Scanner sca = new Scanner(System.in);
		System.out.print("나이를 입력하세요 => ");
		int age = sca.nextInt();
		System.out.println();
		
		int charge = -100;
		String ageGroup = "";
		
		if(age>=20) {
			charge=1250;
			ageGroup="일반";
		}
		else if(age>=14) {
			charge=800;
			ageGroup="청소년";
		}
		else if(age>=7) {
			charge=400;
			ageGroup="어린이";
		}
		else {
			charge=0;
			ageGroup="유아";
		}
			System.out.println(age+", "+charge+", "+ageGroup);
		
		sca.close();
*/		
		
		// 과제
		// 입력한 시험점수에 따라 학점을 출력하는 프로그램을 작성하세요
		// 90점이상 A학점, 80점이상 B학점, 70점이상 C학점, 60점이상 D학점, 그외 F학점
		// 이때 학점은 char타입 변수를 선언한 후 반드시 변수에 학점을 대입하도록 하세요
		
		Scanner scc = new Scanner(System.in);
		System.out.print("점수를 입력하세요 => ");
		char grade;
		int jumsu=scc.nextInt();
		if(jumsu>=90) {
			grade='A';
		}else if(jumsu>=80) {
			grade='B';
		}else if(jumsu>=70) {
			grade='C';
		}else if(jumsu>=60) {
			grade='D';
		}else {
			grade='F';
		}
		System.out.println("나의 학점은 " + grade + "입니다");
				scc.close();
				
		//grade=A,B 상 C,D 중 F 하 
		char level;
		if(grade=='A'||grade=='B') {
			level='상';
		}else if(grade=='C'||grade=='D') {
			level='중';
		}else { level='하';
				}
		System.out.println("등급은? : " + level);
		
		
	}
}