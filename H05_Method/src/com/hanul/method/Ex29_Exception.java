package com.hanul.method;

public class Ex29_Exception {

	public static void main(String[] args) {

		// 예외처리
		// try{
		//		에러가 날 수 있는 실행문
		// }catch(Exception ex){
		//		에러의 내용을 볼수있다
		// }finally{
		//		무조건 실행
		// }
		
		int no1 = 10, no2 = 0, result = 0;
		int[] no3 = {15,25,33};
		String[] str = new String[3];
		
		try {
			result = no1 / no2;
		}catch(ArithmeticException e1) {
			System.out.println(e1.getMessage());
			System.out.println("0으로 나눌 수 없음");
		}
		try{
			for(int i = 0; i<=no3.length; i++) {
				System.out.println(no3[i]);   // 오류 메세지 : ArrayIndexOutOfBoundsException
			}
			if(str[0].equals("학교")) {
				System.out.println("학교");
			}
		}catch(ArrayIndexOutOfBoundsException e2) {
			System.out.println(e2);
		}finally {
			System.out.println("결국 무조건 처리하는 부분");
		}

		
		System.out.println("프로그램 종료");
		
		
		
		
		
	}

}
