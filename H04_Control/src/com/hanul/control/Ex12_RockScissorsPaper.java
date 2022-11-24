package com.hanul.control;

import java.util.Random;

public class Ex12_RockScissorsPaper {

	public static void main(String[] args) {

		//가위:0, 바위:1, 보:2
		int scissors = 0, rock = 1, paper = 2;
		Random r = new Random();
		//Random은 숫자를 만들어주는 클래스의 함수
		//int로 변수를 선언해준 이유는, 숫자로 할수있으나 가위바위보의 경우는 주사위처럼 숫자크기로 승부가 나는게 아니니까
		//나오는 값을 3가지까지로 정해놓고 나오는 숫자에 의미를 부여해준것임.
		System.out.println("가위 바위 보!!");
		r.nextInt(3);
			// user와 컴퓨터가 각각 가위바위보의 값을 받기
		int user = r.nextInt(3);
		int computer = r.nextInt(3);
		System.out.printf("사용자 %d, 컴퓨터 %d \n", user, computer);
		// 위랑 같은 표현 System.out.println("user : " + user + "computer : " + computer);
			
		// user가 이기는 경우 - user-가위 computer-보,user-바위 computer-가위,user-보 computer-바위
		// user와 computer가 같으면 비기고
		// 그외는 user가 진다
		if ((user==scissors && computer==paper)
				|| (user==rock && computer==scissors)
				|| (user==paper && computer==rock)) {
			System.out.println("user가 이겼다");
		}else if (user==computer) {
			System.out.println("비겼다");
		}else { System.out.println("user가 졌다");
		}
		//System.out.println("결과는? : " + );
		//위처럼 마지막에 넣고싶으면, ""이안에 들어갈 형태가 문자열이기때문에 위쪽에서 String으로 변수를 선언해줬어야함.
		// String result; 라고 했으면 밑에서 if문 뒤에 syso가 아닌 result="user가 이겼다"로 각각 값을 넣어주면 됨
		//result 를 사용하면 마지막 줄에 system.out.println("결과는? : " + result)로 해서 출력가능
		
	}

}
