package com.hanul.control;

import java.util.Scanner;

public class Ex08_if02 {

	public static void main(String[] args) {

		int score = 70;
		// if문으로 구간을 나누어 출력
		if(score<60)
		{System.out.println(score + "는 60점 미만");}
		else if(score<70)
		{System.out.println(score + "는 60점 이상");}
		else if(score<80)
		{System.out.println(score + "는 70점 이상");}
		else if(score<90)
		{System.out.println(score + "는 80점 이상");}
		else if(score<=100)
		{System.out.println(score + "는 90점 이상");}
		
		//주민등록상 남자 => 1,3 여자 =>2,4
		System.out.print("숫자를 입력하세요(1~4) => ");
		Scanner sc = new Scanner(System.in);
		int gender = sc.nextInt();
		
		if(gender==1||gender==3){
			System.out.println("남자");
		}else if(gender==2||gender==4){
			System.out.println("여자");
		}else {
			System.out.println("숫자가 아닙니다");
		}
		
		
		
		
		
		
	}

}
