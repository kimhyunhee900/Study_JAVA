package com.hanul.method;

import java.util.Scanner;

public class Ex26_Method03 {

	public static void main(String[] args) {

		// 파라미터(매개변수)를 숫자로 받아서 그 숫자의 홀,짝인지 판단하여 문자열을 리턴하는 메소드 선언 후 출력
		Scanner h = new Scanner(System.in);
		int suu = h.nextInt();	
		String str = su(10);
		System.out.println(str);
		
		int ss = hab(10);
		System.out.println(ss);
	}
	
	static String su(int no1) {
		String str = "";
		if(no1%2==0) {
			str = "짝수";
		}else {
			str = "홀수";
		}
		return str;
	}
	
		// 1부터 입력한 수 까지의 합을 구하여 리턴하는 메소드 구현하고 합을 출력하세요
	static int hab(int z) {
		int cc = 0;
		for(int bb = 1; bb <= z; bb++) {
			cc += bb;
		}
		return cc;
	}
	

}
