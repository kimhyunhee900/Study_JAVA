package com.hanul.object;

public class Ex41_CircleMain {

	public static void main(String[] args) {

		// 정보은닉 : 같은 패키지 안에서도 데이터를 수정하지 못하도록 방어
		
		//반지름이 15인 원의 객체를 생성
		//그 객체의 원의 넓이를 구해서
		//반지름과 원의 넓이를 출력하세요

		Ex40_Circle c1 = null;   // 참조형의 기본값은 null. 기본형(int,double...)등은 0
		try {
			c1 = new Ex40_Circle(15);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		int ban = c1.radius;
//			System.out.println(ban);     private해놔서 가져올수 없음.
		int ban = c1.getRadius();
			System.out.println(ban);
		double nb = c1.getArea();
			System.out.println(nb);
			
		System.out.println("반지름은 : " + ban + "\n원의 넓이는 : " + nb);
		System.out.println("-------");
	
		//반지름이 3인 원의 객체를 생성
		//그 객체의 원의 넓이를 구해서
		//반지름과 원의 넓이와 둘레를 출력하세요
		
		Ex40_Circle c2 = null;
		try {
			c2 = new Ex40_Circle(3);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//		int bban = c2.radius;
//			System.out.println(bban);
		int bban = c2.getRadius();
			System.out.println(bban);
		double nnbb = c2.getArea();
			System.out.println(nnbb);
		double dul = c2.getRoundLength();
			System.out.println(dul);

		System.out.println("반지름은 : " + bban + "\n원의 넓이는 : " + nnbb + "\n둘레는 : " + dul);
		System.out.println("-------");
		
		Ex40_Circle c3 = null;
		try {
			c3 = new Ex40_Circle(7);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			c3.setRadius(8);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			System.out.println(c3.getRadius());
		double nnnbbb = c3.getArea();
			System.out.println(nnnbbb);
		double ddull = c3.getRoundLength();
			System.out.println(ddull);
		System.out.println("반지름은 : " + c3.getRadius() + "\n원의 넓이는 : " + nnnbbb + "\n둘레는 : " + ddull);
		
		
		
	}
}