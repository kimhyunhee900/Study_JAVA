package com.hanul.object;

public class Ex40_Circle {

	// 원 클래스
	// 반지름 데이터, 넓이를 구하는 기능, 원의 둘레를 구하는 기능
	private int radius;   // private로 해놔서 다른 클래스에서 값을 변경하지 못함. 같은 클래스 내에서는 가능
	
	// 생성자
	public Ex40_Circle(int radius)throws Exception{		//예외처리하는 방법.이렇게 하고나면 메소드를 사용한곳을 try/catch문을 씌워줘야함.
		if(radius < 0) {
			throw new Exception("생성자 : 길이가 0보다 커야합니다");
		} 
		this.radius = radius;
	}
	
	// 원의 반지름을 가져올 수 있는 메소드를 생성  
	int getRadius() {
		return this.radius;
	}
	
	// 원의 반지름을 셋팅 있는 메소드를 생성
	void setRadius(int radius) throws Exception{		//예외처리하는 방법. 이렇게 하고나면 메소드를 사용한곳을 try/catch문을 씌워줘야함.
		if(radius < 0) {
			throw new Exception("생성자 : 길이가 0보다 커야합니다");
		}
		
		this.radius = radius;
	}

	// 넓이 구하는 공식 = 2* 3.14 * 반지름
	double getArea() {
		return 2*3.14*radius;
	}
	// 둘레
	double getRoundLength(){
		return 3.14*radius*radius;
	}
	
}
