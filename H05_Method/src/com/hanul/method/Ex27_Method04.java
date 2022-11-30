package com.hanul.method;

import java.util.Scanner;

public class Ex27_Method04 {

	public static void main(String[] args) {

		//실습1
		//Scanner로 두 수를 입력받아 곱셈연산을 한 결과와 나눗셈 연산을 한 결과를 리턴하는 메소드를 만들어
		//그 결과들을 더하고(변수 sum) 뺀(변수 sub) 경우를 변수에 입력하여 출력하시오
		
		Scanner z = new Scanner(System.in);
		int p = z.nextInt();
		int e = z.nextInt();
		int ff = gob(p,e);
		System.out.println(ff);
		int jj = na(p,e);
		System.out.println(jj);
		int sum = ff + jj;
		int sub = ff - jj;
		System.out.printf("더 한 값은 %d 이고 뺀 값은 %d 입니다", sum, sub);
		
		//실습2
		//위에서 입력받은 두 수로 더 작은 수에서 더 큰 수까지 누적합을 구한 결과값을 리턴하는 메소드를 만들고
		//메인에서 그 수를 출력하는 프로그램을 작성하시오
		//예) 큰수 v1 = 25, 작은수 v2 = 10일때 위치 바꾸는 방법
		//if(v1 > v2){
		//		int tmp = v1;
		//		v1 = v2;
		//		v2 = tmp;
		//  }
	}

	static int gob(int no1, int no2) {
		int g = no1 * no2;
		return g;
	}
	
	static int na(int no1, int no2) {
		int w = no1 / no2;
		return w;
	}
	
	static int pe(int no1, int no2) {
		if(no1 > no2) {
			int tmp = no1;
			no1 = no2;
			no2 = tmp;
			for()
		}
		
		
		return ;
	}
	
}
