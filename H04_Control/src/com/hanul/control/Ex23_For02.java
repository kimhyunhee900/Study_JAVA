package com.hanul.control;

public class Ex23_For02 {

	public static void main(String[] args) {

		// 중첩for문(다중for문)
		// 구구단 2~9단 중첩for문으로 출력
		for(int dan = 2; dan < 10; dan++) {
			System.out.println("----- " + dan + "단 -----");
			for(int i = 1; i <= 9; i++) {
				System.out.printf("%d x %d = %d\n", dan, i, dan*i);
			}  
		}
		
		// 가로로 구구단 출력
		for(int dan = 2; dan < 10; dan++) {
			System.out.printf("-- %d단 --\t",dan);
		}System.out.println();
		
		// 가로로 구구단 출력
		for(int p = 1; p < 10; p++) {
			for(int dann = 2; dann < 10; dann++) {
				System.out.printf("%d x %d = %d\t", dann, p, dann*p);
			}
			System.out.println();
		}
		
		// for문을 이용하여 아래와 같이 출력하세요
		// ****
		// ****
		// ****
		// ****
		// ****
		for(int j = 1; j <= 5; j++ ) {
			for(int s = 1; s <=4; s++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		// *****
		// ****
		// ***
		// **
		// *
		for(int jj = 0; jj < 5; jj++) {
			for(int ss = 1; ss <= 5-jj; ss++) {
				System.out.print("*");
			}
			System.out.println();
		}
		//*
		//**
		//***
		//****
		//*****
		for(int jjj = 1; jjj < 6; jjj++) {
			for(int sss = 0; sss < jjj; sss++ )
				System.out.print("*");
			System.out.println();
		}
		
		
		
		
		
		
	}

}
