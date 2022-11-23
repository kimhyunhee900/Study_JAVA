package com.hanul.control;

import java.util.Random;

public class Ex11_Dice {

	public static void main(String[] args) {

		//랜덤한 수를 발생시키는 클래스 : Random - 주사위게임
//		Random r = new Random();
//		int num = r.nextInt(100); // 0~99까지 랜덤한 수를 생성해준다
//		System.out.println("랜덤수 : " + num);
		
		Random r = new Random();
		//r.nextInt(6);  => 0~5까지의 6가지 숫자가 나오니까 +1을 해줘야 1~6까지의 숫자가 나옴. 밑내용 참고!
		System.out.println("주사위를 던지세요!");

		int user = r.nextInt(6) + 1;
		int computer = r.nextInt(6) + 1;
		System.out.printf("사용자 %d, 컴퓨터 %d \n", user, computer);
		
		if(user>computer) {
			System.out.println("내가 승리!");
		}else if(user<computer) {
			System.out.println("컴퓨터가 승리!");
		}else {System.out.println("비겼다!");}
		
		
		
	}

}
