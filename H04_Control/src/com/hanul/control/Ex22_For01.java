package com.hanul.control;

import java.util.Scanner;

public class Ex22_For01 {

	public static void main(String[] args) {
		
		// for문
		// for( 초기화식; 조건식; 조건증감식(조건변경식){
		//		실행명령문;
		// }
		
		// *를 10개 출력하기
		for(int i = 0; i < 10; i++) {
			//반복하기위해서는 숫자가 들어가니까 int가 많이 들어감
			System.out.print('*');
		}System.out.println();     // 이 출력문이 안들어가려면 '*'에다가 "*\n"으로 해줄수있으나 그럼 *이 붙지못함. 
	
		// 1~10까지 출력하기
		for(int i = 1; i < 11; i++) {
			//반복하기위해서는 숫자가 들어가니까 int가 많이 들어감
			System.out.println(i);
		}
		
		// 구구단 3단을 출력하세요
		for(int dan = 1, result = 3; dan < 10; dan++) {
			System.out.println("3 x " + dan + " = " + result * dan);
		} //System.out.printf("%d x %d = %d\n", 3, dan, 3*dan); 위와 같고 더 편할 수 있음
		
		// 1~10까지 합을 구하세요
		int sum = 0;
		for(int h = 1; h < 11; h++) {
			sum = sum + h;
		} System.out.println(sum);
		
		for(int h = 1; h < 11; h++) {
			sum = sum + h;
			System.out.printf("1부터 %d까지 합은 %d \n", h, sum);
		}
		System.out.printf("1부터 10까지 합은 %d \n", sum);
		
		// 1~10까지의 숫자 중 짝수만 출력
		for(int j = 1; j<11; j++) {
			if(j%2==0) { 
				//System.out.println("짝수 : " + j);
				System.out.printf("1부터 10까지 중 짝수는 %d입니다 \n", j);
			}
		}
		
		//실습1. 1~10까지의 수 중 홀수만 출력하는 프로그램을 for문으로 작성
		for(int a = 1; a<11; a++) {
			if(a%2==1) { 
				System.out.println("홀수 : " + a);
			}
		}
		
		//실습2. 출력하고 싶은 구구단 수를 입력받아 출력하는 프로그램을 for문으로 작성  / 입력받아라는거는 Scanner 입력
		int su = 0, cu = 0;
		Scanner ac = new Scanner(System.in);
		System.out.print("출력하고 싶은 구구단의 숫자를 입력하세요 : ");
		su = ac.nextInt();
		for(cu = 1; cu <= 9; cu++ ) {
			System.out.printf("%d x %d = %d \n", su, cu, su*cu );
		}
		
		//실습3. 1부터 입력받은 수까지 합을 출력하는 프로그램을 for문으로 작성
		int aaa = 0, qq = 0;
		System.out.print("더하고 싶은 숫자를 입력하세요 : ");
		aaa = ac.nextInt();
		for(int j = 1; j <= aaa; j++ ) {
			qq += j;
		}
		System.out.printf("받은 값은 %d 이고 합은 %d 입니다 \n", aaa, qq );
		
		
		//실습4. 1부터 입력받은 수 중 3의 배수만 출력하는 프로그램을 for문으로 작성
		int tt = 0;
		System.out.print("원하는 숫자를 입력하세요 : ");
		tt = ac.nextInt();
		for(int yy = 1; yy<=tt; yy++) {
			if(yy%3==0) {
				System.out.println("받은 수 중 3의 배수는 : " + yy);
			}
		}
		ac.close();
		
		
	}
	
}
