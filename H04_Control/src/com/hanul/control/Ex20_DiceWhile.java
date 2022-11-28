package com.hanul.control;

import java.util.Random;

public class Ex20_DiceWhile {

	public static void main(String[] args) {

		//do while을 이용해 주사위게임 만들기
		
		Random r = new Random();
		//class만드는 기본 문법, 형태 
		//r.nextInt(6);  => 0~5까지의 6가지 숫자가 나오니까 +1을 해줘야 1~6까지의 숫자가 나옴. 밑내용 참고!

		int user = 0, computer = 0;
		do { 
			System.out.println("주사위를 던지세요!");
			user = r.nextInt(6) + 1;
			computer = r.nextInt(6) + 1;
			System.out.printf("사용자 %d, 컴퓨터 %d \n", user, computer);
		} while( user == computer );
	
		if(user>computer) {
			System.out.println("내가 승리!");
		}else if(user<computer) {
			System.out.println("컴퓨터가 승리!");
		}
		// if, else if 를 do while 밖으로 빼놓는 이유는 비겼을 경우에만 다시 하게끔 하고, 그 외에는 if문으로 가면되니까. 더 처리 속도 빠를수있음
	
	
	
	
	
	
	}

}
