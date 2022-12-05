package com.hanul.object;

public class Ex33_CarMain {

	public static void main(String[] args) {

		// 김현식 소유의 QM3 차종 객체를 생성하고
		// 시동을 켜고 엑셀을 4번 밟고 속도를 출력하고
		// 브레이크를 4번 밟고 속도를 출력하세요
		// 시동끄세요
		
		Ex32_Car hs = new Ex32_Car();
		
		hs.owner = "김현식";
		hs.modelName = "QM3";
		
		System.out.printf("%s 의 차종은 %s 입니다\n", hs.owner, hs.modelName);
		
		hs.start();
		
		hs.stepAccel();
		System.out.println(hs.speed);
		hs.stepAccel();
		System.out.println(hs.speed);
		hs.stepAccel();
		System.out.println(hs.speed);
		hs.stepAccel();
		System.out.println(hs.speed);
				
		System.out.printf("현재 속도는 %d 입니다\n", hs.speed);
		
		hs.stepBreak();
		System.out.println(hs.speed);
		hs.stepBreak();
		System.out.println(hs.speed);
		hs.stepBreak();
		System.out.println(hs.speed);
		hs.stepBreak();
		System.out.println(hs.speed);
		
		System.out.printf("현재 속도는 %d 입니다\n", hs.speed);
		
		hs.stop();
		
		
		hs.owner = "김현희";
		hs.modelName = "Audi";
		
		System.out.printf("%s 의 차종은 %s 입니다\n", hs.owner, hs.modelName);
		
		hs.start();
		
		hs.stepAccel();
		System.out.println(hs.speed);
		hs.stepAccel();
		System.out.println(hs.speed);
		hs.stepAccel();
		System.out.println(hs.speed);
		hs.stepAccel();
		System.out.println(hs.speed);
		
		hs.stepBreak();
		System.out.println(hs.speed);
		hs.stepBreak();
		System.out.println(hs.speed);
		hs.stepBreak();
		System.out.println(hs.speed);
		hs.stepBreak();
		System.out.println(hs.speed);
		hs.stepBreak();
		System.out.println(hs.speed);
		
		System.out.printf("현재 속도는 %d 입니다\n", hs.speed);
		
		hs.stop();
	}

}
