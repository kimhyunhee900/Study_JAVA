package com.hanul.control;

public class Ex09_VariableRange {

	public static void main(String[] args) {

		// 변수의 유효범위
		// 로컬변수 : 선언된 블럭안 {..}에서만 사용, 블럭을 벗어나면 메모리에서 소멸 -> ex) if...
		// 전역변수 : 클래스안에서 다 사용가능 -> 보통 main을 전역변수라고 부름
		
		int val1 = 5;
		if(val1 >1 ) {
			int val2 = 10;
			System.out.println(val1);
			System.out.println(val2);
		}
			System.out.println(val1);
			//System.out.println(val2);
			
		int no1 = 5;
		String result;
		if(no1%2==0) {
			result = "짝수";
		}
		else {
			result = "홀수";
		}
		System.out.println(result);
		
		// if문은 if, else 로만 가거나, if,else if, else로 해야함.
		// 경우의 수가 두개면 iff,else 로 가야하고, 그외 더 있으면 if, else if<추가가능>, else으로 해야함
		// if, else if로 끝날 경우는 선언만 하는게 아니라 초기화까지해줘야함
		// ex) String result = ""; 
		
		
		
		
		
	}

}
