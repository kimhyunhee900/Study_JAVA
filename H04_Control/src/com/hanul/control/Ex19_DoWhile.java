package com.hanul.control;

import java.util.Scanner;

public class Ex19_DoWhile {

	public static void main(String[] args) {

		// do{ ~ }while(조건식); 문 : 무조건 한번은 실행한다
		
		//1~10까지 출력
		
		int no1 = 1;
		do {
			System.out.println(no1);
			no1++;
		}while(no1 <= 10);
		
		//스캐너로 숫자를 입력받아 그 수가 10이상일 경우에만 빠져나오는 do~while문을 작성
		Scanner sc = new Scanner(System.in);
		int a = 0;
		do {
			System.out.print("숫자를 입력하세요 : ");
			a = sc.nextInt();
		} while (a < 10);
			System.out.print("10이상의 숫자를 입력하셨군요?! " + a);
			
		sc.close();
		
		
	}

}
