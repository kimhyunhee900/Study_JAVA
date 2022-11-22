package com.hanul.control;

public class Ex07_if01 {

	public static void main(String[] args) {

	// if만 사용  if(조건식) : 조건식이 참이면 실행
		// if(조건) { 실행문 };  -- 문법
		// system.out.print에서 f일땐 %d로 표현 - 정수
		// system.out.print에서      %c로 표현 - character 한글자
		// system.out.print에서      %s로 표현 - String 문자열
		// system.out.print에서      %f로 표현 - 실수 float, double
		// system.out.print에서      %l로 표현 - 정수 long
		
	// if와 else 사용  조건식이 참이면 if문 실행, 아니면 else문 실행
	// if와 else if와 ..... 마지막에 else를 사용
		
		int no1 = 15, no2 = 10;
		if(no1 > no2) {System.out.printf("%d 가 %d 보다 더 큰수 \n" , no1, no2);}
		else{System.out.printf("%d 가 %d 보다 더 크거나 같은 수 \n" , no2, no1);}

		//if(no1 <= no2) {System.out.printf("%d 가 %d 보다 더 크거나 같은 수 \n" , no2, no1);}
		
	// 만약 아빠나이가 엄마나이보다 많으면
	// 만약 엄마나이가 아빠나이보다 많으면
	// 나이가 같으면
		int dadAge = 54, momAge = 56;
		if(dadAge>momAge) {System.out.println("아빠나이가 엄마나이보다 많다");}
		else if(dadAge<momAge) {System.out.println("엄마나이가 아빠나이보다 많다");}
		else {System.out.println("나이가 같다");
		}
		// if(dadAge>momAge) {System.out.println("아빠나이가 엄마나이보다 많다. 아빠나이 : " + dadAge);}
			// ln은 그대로 출력, 뒤에 아빠나이 넣고싶으면 위처럼 표현
		// if(dadAge>momAge) {System.out.printf("엄마나이 %d가 아빠나이 %d보다 많다" + momAge, dadAge);}
			// f는 방식이고, f는 뒤에 변수명을 넣어줘야함
		
	// even이라는 수가 짝수인지, 홀수인지 판단하여 출력하는 프로그램을 작성하시오
		int even = 50, odd = 51;
		if(even%2==0) {System.out.println("even은 짝수이다");}
		
		if(odd%2==0) {System.out.println("odd는 짝수이다");}
		else {System.out.println("odd는 홀수이다");}
		//위 문장은 else if(odd%2==1) {System.out.println("odd는 홀수이다");} 로 표현된거랑 같음
		
	// 택시를 타려면 돈이 3,300원 이상 있어야합니다
	// 집에서 한울까지 택시를 타면 15분이 걸리고 버스를 타면 30분이 걸립니다
	// 지각을 12번 이상 할 경우, 수당을 받지 못한다
	// 나는 지금 11번 지각을 했다
	// 지각까지 남은 시간 25분
		
		int mymoney = 2000;
		int arrivedTime;
		int late = 11;
		int busmoney = 1250, taximoney = 4200;
				
		//mymoney = 5000;
		//if(mymoney>=3300) {
		//	System.out.println("택시타고 한울간다");
		//	arrivedTime = 15;
	//	}
		//else{
			//System.out.println("버스타고 한울간다");
			//arrivedTime = 30;
			//++late;
			//++late;, late++;, late+=1;===late=+1; 다 같은 결과값
		//}
		
		//System.out.println(mymoney + ", " + arrivedTime + ", " + late);
		
		mymoney = 200;
		if(mymoney>=taximoney) {
			System.out.println("택시타고 한울간다");
			arrivedTime = 15;
			mymoney = mymoney - taximoney;  // mymoney -= taximoney;
	}
		else if(mymoney>=1250) {
			System.out.println("버스타고 한울간다");
			arrivedTime = 30;
			mymoney = mymoney - busmoney;
			++late;
			if(late>=12) {System.out.println("수당못받는다");}
		}
		else {System.out.println("뚜벅이 -> 걸어서 간다");
		arrivedTime = 60;
		++late;
		}
		System.out.println(mymoney + ", " + arrivedTime + ", " + late);
		
		//지각 12번 이상이면 수당 미지급으로 출력
		if(late>=12) {System.out.println("수당미지급");}
		else {System.out.println("수당지급");}
		
		//if문 안에 if문을 작성할 수 있다
	//	int dadAge = 54, momAge = 56;
	//	if(dadAge>momAge)
	//		{System.out.println("아빠나이가 엄마나이보다 많다. 아빠나이 : " + dadAge);}
	//	else { if(dadAge<momAge) } 
	//			{System.out.println("엄마나이가 아빠나이보다 많다" + momAge);}
	//	else {System.out.println("나이가 같다");}
	//if문이 끝나면 헷갈리지않게 주석처리로 if끝났다는걸 표시해줄시 헷갈리지않을수있음
		// 예를 들면 //if 또는 //if(dadAge>momAge)  -> 이것에 대한 if문이구나를 알수있음
	}
}
