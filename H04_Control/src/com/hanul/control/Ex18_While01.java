package com.hanul.control;

public class Ex18_While01 {

	public static void main(String[] args) {

		//★ 반복문 : 일정한 작업을 규칙적으로 수행할 때 사용
		//★ 똑같은 명령문을 여러번 작성하지 않고 반복분을 사용
		//★ 종류 : while, do~while, for 문   반복문 - while, do while, for    조건문 - if, switch case, else if else
		 
		//★ while문
		//★ 초기화 하고 ex_int a = 1, while(조건){실행하는 범위, 마지막 조건식을 변경시켜야함}, 그렇지않으면 무한루프
	
		// Hello Java를 10번 출력하는 while문
		// 초기화식
		int cnt = 1;     // 조건은 변하는 값을 넣어야함.
		// 조건식이 참이면 실행, 거짓이면 빠져나옴
		while(cnt <= 10) {  
			// 실행문 
			System.out.println("Hello Java");
			// 조건식을 변경시켜야함 => 변경하지않으면 무한루프...
			cnt++;  // ++cnt; 로도 쓸 수 있으나 실무에서는 cnt++; 를 더 많이 씀
					// 2씩 증가하는 경우 cnt += 2;  ==  cnt = cnt + 2;
		}
		
		int no1 = 1;
		while(no1 <= 10) {
			System.out.println(no1);
			no1++;
		}
		
		// 1부터 10까지 출력
		int no2 = 10;
		while(no2 > 0 ) {
			System.out.println(no2);
			no2--;
		}
		
		// 3x1 ~ 3x6 까지 출력
		// 변하는게 뭔지 먼저 파악하고 그걸 변수로 둬야함. 값을 나오게 하기 전에 먼저 1을 no3에 넣고 생각해보면 됨.
		int no3 = 1;
		// 3은 고정된 숫자고, 곱하기 뒤의 숫자가 1~6까지므로 변수 값은 1이어야함
		while(no3 <= 6) {
			System.out.println(3 * no3);  // no3은 밑에 no3++;로 1씩 더해지면서 값을 구함.
			no3++;
		}
		no3=1;
		while(no3 <= 6) {
			System.out.println("3 x " + no3);  
			no3++;
		}
		
		// 1부터 5까지의 합을 구하는 while문
		// 
		int no4 = 1;
		int sum = 0;  // 총 합을 저장 할 변수 , 문제에 합이라고 하면 합을 구할 수 있는 변수를 항상 선언해줘야함. 값이 변하는 변수는 초기화 할때 0으로 초기화
		while(no4 <= 5) {
			sum = sum + no4;
			no4++;
			System.out.println(sum);   // 안에 넣으면 각각 넣어져서 나오는 값이 보여짐
		} 
		System.out.println(sum);   // 밖에 넣으면 총 합계만 보여짐
		
		// 1~100까지 합을 구하세요
		int no5 = 1;
		int sum2 = 0;
		while(no5 <= 100) {
			sum2 = sum2 + no5;
			no5++;
		} System.out.println(sum2);
		
		
		
		
	}

}
