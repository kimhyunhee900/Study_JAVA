package com.hanul.control;

import java.util.Random;

public class Ex13_Yut {

	public static void main(String[] args) {

		// 윷을 던져 결과를 출력
		// 앞 1, 뒤 0
		// 도:앞뒤뒤뒤-1, 개:앞앞뒤뒤-2, 걸:앞앞앞뒤-3, 윷:앞앞앞앞-4, 모:뒤뒤뒤뒤-0
		// 4개의 윷 숫자를 받는다
		// 각 윷의 숫자를 더해서 1 도, 2 개, 3 걸, 4 윷, 0모
			
			Random y = new Random();
			System.out.println("지화자~!");
			int bar1 = y.nextInt(2);
			int bar2 = y.nextInt(2);
			int bar3 = y.nextInt(2);
			int bar4 = y.nextInt(2);
			
			System.out.println(bar1 + bar2 + bar3 + bar4);
			//위는 합하여 출력됨. System.out.println("" + bar1 + bar2 + bar3 + bar4);로
			//""을 넣어주면 각 값을 문자열로 인식하여 출력됨.
			int sum = bar1+bar2+bar3+bar4;
			
			if(sum == 1) {
				System.out.println("도입니다");
			}else if (sum == 2) {
				System.out.println("개입니다");
			}else if (sum == 3) {
				System.out.println("걸입니다");
			}else if (sum == 4) {
				System.out.println("윷입니다");
			}else if (sum == 0) {
				System.out.println("모입니다");
			}
			//else문을 쓸때는 나오는 값이 어떤 값으로 나오든지 상관없으면 else로 끝내고 (0~5까지, 6,7 둘중어떤값이라도)
			//한가지의 정확한 값이면 else if로 끝내야함(위처럼 1~4까지, 0으로만 정해져있으니까)
		
			
			
			
			
		
		
		
		
		
	}

}
