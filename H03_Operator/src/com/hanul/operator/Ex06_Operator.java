package com.hanul.operator;

import java.util.Scanner;

public class Ex06_Operator {

	public static void main(String[] args) {
		// operator = 연산자
		// 대입연산자 : =  -> 오른쪽에 있는것을 왼쪽에 대입한다 는 의미
		
			int no1 = 10;
			System.out.println(no1);
			
			String za = "안녕하세요";
			System.out.println(za);
			
			char zb = '봄';
			System.out.println(zb);
			
			no1 = 5;
			int no2 = (no1 = 5 ) +10; // 윗줄과 이번줄 둘 중 하나만 있으면 됨.
			System.out.println(no2);
		//선언은 한번만 가능!! 위처럼 값을 바꾼 경우 기존에 선언한 값을 사라지고 바꾼 값으로 바뀜!!!
		//변수의 값은 바뀌었으나 no1이라는 변수이름은 살아있음	
			int no3 = no2 = no1;
			System.out.println(no1);
			System.out.println(no2);
			System.out.println(no3);
	
		//산술연산자 : +,-,*,/(나누기:몫),%(나누기:나머지)
			no2 = 7; no3 = 2;
			System.out.println(no2 + no3);
			System.out.println(no2 - no3);
			System.out.println(no2 * no3);
			System.out.println(no2 / no3);
			System.out.println(no2 % no3);
			
			double no4 = 2.0;
			no4 = no2/no4;
			System.out.println(no4);
		//큰 값 double 8byte에서 작은 값 int 4byte를 연산할(나눌) 경우 큰 값에 맞춰 연산함(나눔)
		
		//사칙연산 우선순위를 인위적으로 지정하려면 () 괄호를 사용한다
			no1 = 7 / 2 + 3;
			System.out.println(no1);
			
			no1 = 7 / (2 + 3);
			System.out.println(no1);
	
		//	int no5 = 100 + 200L;
		// 위처럼 하고 싶은 경우 int 보다 long 이 더 크니 long으로 계산됨. 
		// 아래처럼 하거나 앞을 long으로 바꾼 long no5 = (100 + 200L); 으로 하면됨.
			int no5 = (int)(100 + 200L);
			System.out.println(no5);
			
			byte no6 = 2, no7 = 3, no8;
			no8 = (byte)(no6 + no7);
			System.out.println(no8);
			
			
		//부호연산자 : + , -
			no1 = -no1;  // 이건 -1 * no1 과 같음
			no6 = (byte)+no6;  // 이건 +1 * no6 과 같음
	
	//★ 증감연산자(증가/감소) : ++, --
	//★ ++변수 : 먼저 변수에 1을 더한 후 변수를사용된다
	//★ 변수++ : 변수가 먼저 사용된 후에 변수에 1을 더한다
	//★ --변수 : 먼저 변수에 1을 뺀 후 변수를 사용된다
	//★ 변수-- : 변수가 먼저 사용된 후에 변수에 1을 뺀다
			
		int su = 5, result;
		result = ++su;
		System.out.println("result : " + result + ", " + ", su:" + su);
		result = su++;
		System.out.println("result : " + result + ", " + ", su:" + su);
		result = --su;
		System.out.println("result : " + result + ", " + ", su:" + su);
		result = su--;
		System.out.println("result : " + result + ", " + ", su:" + su);
	
		int a = 1, b = 3, sum;
		sum = a + ++b;
		System.out.printf("a:%d, b:%d, sum:%d \n", a, b, sum);
		
		double no9 = 123.012456;
		System.out.printf("%8.2f,  %-8.2f, %.3f \n", no9, no9, no9);
		//f가 들어라서 ln이 빠져서 \n을 넣어준거임
			
	//관계연산자(비교) : >, <, >=, <=, ==, !=   //==같다, !=같지않다  // !는 같지않다(not)
	//boolean로 강제 캐스팅되어 true, false 값으로 나타난다
		
		System.out.println("10>5? " + (10>5));
		boolean isResult = (10<=5);
		System.out.println("10>5? " + isResult);
		isResult = (10!=5);
		System.out.println("10!=5? " + isResult);
		//isResult는 IF문에 가장 많이 들어감
		
	//논리연산자 : &&(and 논리곱), ||(or 논리합), !(not)
	//&& : 연산자 좌,우 모두 참이어야 참 나머지는 거짓
	//|| : 연산자 좌,우 중 하나만 참이어도 참 / 모두 거짓일때는 거짓
	
		System.out.println(10>5 && 20>5); // T * T = T
		System.out.println(10>5 && 20<5); // T * F = F
		System.out.println(10<5 && 20>5); // F * T = F
		System.out.println(10<5 && 20<5); // F * F = F
		
		System.out.println(10>5 || 20>5); // T * T = T
		System.out.println(10>5 || 20<5); // T * F = T
		System.out.println(10<5 || 20>5); // F * T = T
		System.out.println(10<5 || 20<5); // F * F = F

		int num1 = 5, num2 = 2, num3 = 5, num4 = 10;
		System.out.println((num1==num2 || num1==num3) && !(num3>num4));
		
	//복합대입연산자 : +=, -=, *=, /=, %=	
	// a = a + b => a += b
	// a = a - b => a -= b
	// a = a / b => a /= b
	// a = a * b => a *= b
	// a = a % b => a %= b  %는 나머지 값을 구하는 방식
			
		int num = 29;
		num -= 2 + 3 * 4;  // 쉽게 써도 괜찮음 ex - num = num - (2 + 3 * 4)
 		System.out.println(num);
		
	//★삼항연산자(조건연산자) : a ? b:c  
 		int num5 = 10;
 		System.out.println("num5 == 10? " + (num5 == 10 ? true:false));
 		System.out.println("num5 == 10? " + (num5 == 10 ? "참":"거짓"));
 		System.out.println("num5 == 10? " +
 		(num5 > 10 ? "10보다 크다" : num5 == 10 ? "10과 같음" : num5 < 10 ? "10보다 작음" : "다르다"));
		//위 설명 -> ""는 문자열이라 그냥 출력되고, 뒤에 ()가 조건이 됨.
 		//a는 찾으려는 값이고 b:c는 값의 조건, b는 참을 찾는 조건들이고 c는 앞의 조건들이 맞지않을 경우 나타낼말
 		
 		// 과제 : 짝수/홀수 출력하기 - 13
 			int num6 = 13;
 			System.out.println("num6%2 == 0 ? " + ( num6%2 == 0 ? "짝수":"홀수"));
 		// 과제 : 성적에 따른 학점 출력하기
 		// 90점이상 A , 80점이상 B, 70점이상 C, 그외 D
 		// int 타입으로 jumsu 변수78점을 초기화
 			int jumsu = 78;
 			System.out.println("학점은 ? " + (jumsu>=90?"A":jumsu>=80?"B":jumsu>=70?"C":"D"));
 		
 		// Scanner는 입력받는 class
 			Scanner sc = new Scanner(System.in);
 			System.out.print("점수를 입력해주세요 : ");
 			
 		/*	int score = sc.nextInt();
 			//nextInt()는 원래 있는 함수, 위뜻은 sc에 있는 nextInt에서 받은 값을 score라는 변수에 담겠다
 			System.out.println(score);
 			
 		// 입력받은 수가 짝수인지 홀수인지 출력하세요 -> 삼항연산자를 활용해서
 			System.out.println("score%2 == 0 ? " + ( score%2 == 0 ? "짝수":"홀수"));	
		*/
 			
 			int grade = sc.nextInt();
 			System.out.print("점수는 무슨 등급 ? ");
 			System.out.println(grade);
 			System.out.println(grade>=90?"A":grade>=80?"B":grade>=70?"C":"D");
 			
	
	}

}
