package com.hanul.pack;

import com.hanul.geometry.Ex47_Circle;

public class Ex48_CircleMain {

	public static void main(String[] args) {

		// 정보은닉 : 같은 패키지 안에서도 데이터를 수정하지 못하도록 방어
		
				//반지름이 15인 원의 객체를 생성
				//그 객체의 원의 넓이를 구해서
				//반지름과 원의 넓이를 출력하세요

				Ex47_Circle c1 = null;   // 참조형의 기본값은 null. 기본형(int,double...)등은 0
				try {
					c1 = new Ex47_Circle(15);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
//				int ban = c1.radius;
//					System.out.println(ban);     private해놔서 가져올수 없음.
				int ban = c1.getRadius();
					System.out.println(ban);
				double nb = c1.getArea();
					System.out.println(nb);
					
				System.out.println("반지름은 : " + ban + "\n원의 넓이는 : " + nb);
				System.out.println("-------");
			
				
		
		
	}

}
