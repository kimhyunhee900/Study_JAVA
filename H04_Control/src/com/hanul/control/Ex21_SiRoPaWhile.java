package com.hanul.control;

import java.util.Random;

public class Ex21_SiRoPaWhile {

	public static void main(String[] args) {

		//가위:0, 바위:1, 보:2
				int scissors = 0, rock = 1, paper = 2;
				Random r = new Random();
				System.out.println("가위 바위 보!!");
				r.nextInt(3);
				int user = 0, computer = 0;
				
				do{
					user = r.nextInt(3);
					computer = r.nextInt(3);
					System.out.printf("사용자 %d, 컴퓨터 %d \n", user, computer);
					if(user==computer) {
						System.out.println("가위 바위 보!!");
					}
				}while(user==computer);
					if ((user==scissors && computer==paper)
							|| (user==rock && computer==scissors)
							|| (user==paper && computer==rock)) {
						System.out.println("user가 이겼다");
					}else { System.out.println("user가 졌다");
					}
		
	}

}
