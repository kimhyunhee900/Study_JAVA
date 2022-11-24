package com.hanul.control;

import java.util.Scanner;

public class Ex16_Switch02 {

	public static void main(String[] args) {

		Scanner ss = new Scanner(System.in);
		
		System.out.println("몇월입니까? : ");
		
		int month = ss.nextInt();
		
		switch ( month ) {
			case 1:
			case 2:
			case 3:
				System.out.println("1분기입니다");
				break;
			case 4:
			case 5:
			case 6:
				System.out.println("2분기입니다");
				break;
			case 7: case 8: case 9:
				System.out.println("3분기입니다");
				break;
			case 10: case 11: case 12:
				System.out.println("4분기입니다");
				break;
			default :
				System.out.println("잘못된 입력값입니다. 다시 입력해주세요");
				break;
			// case간에 엔터 아닌 위처럼 붙일 수 있으나 case와 : 는 무조건 들어가야하고 공백으로 구분해주면 됨.
				
		}
		
	}

}
