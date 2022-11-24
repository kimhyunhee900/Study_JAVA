package com.hanul.control;

public class Ex15_Switch {

	public static void main(String[] args) {

		// Switch, IF 같은 유형
		// switch ~ case 문 break
		// switch(기준값){     // 문자, 문자열, 정수(long 제외)
		//		  case 판단값 1 :
		//             실행명령문 1
		//             break;
		//		  case 판단값 2 :
		//             실행명령문 2
		//             break;
		//				..........
		//     }
		
		// 홀수,짝수 를 판단하는 switch문
		int no1 = 8;
		switch(no1%3) {
			case 0 :
				System.out.println("나머지 0");
				break;   //if문과 다르게 {} 이후로 아에 빠져나감
			case 1 :
				System.out.println("나머지 1");
				break;
			case 2 :
				System.out.println("나머지 2");
				break;
		}
		
		int no2=9;
		switch(no2%3) {
			case 1 :
				System.out.println("3의 배수");
				break;
			case 2 :
				System.out.println("은메달");
				break;
			case 3 :
				System.out.println("동메달");
				break;
			default :
				System.out.println("해당되지않음");
		// 위의 경우 break가 없어서 맞는 조건 이후도 다 출력되어버림
		// 각 case에 해당하지 않을 경우 마지막에 if문의 else 처럼 default로 마지막에 적어주면됨.
				
				
				
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
