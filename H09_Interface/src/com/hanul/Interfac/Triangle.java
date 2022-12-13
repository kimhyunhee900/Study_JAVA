package com.hanul.Interfac;

public class Triangle extends Shape implements IShape{


	int width;  // 밑변
	
	//생성자 : 상속과 관련
	public Triangle(int height, int width) {
		super(height);
		this.width = width;
	}

	@Override
	public void getArea() {
		System.out.printf("높이 %d 밑변 %d인 직각삼각형의 넓이는 %.2f 이다\n"
				, height, width, (double)height*width/2);
	}

	@Override
	public void getAround() {
		System.out.printf("높이 %d 밑변 %d인 직각삼각형의 둘레는 %.2f 이다\n", height, width,
				(width+height)+(double)Math.sqrt(width*width+height*height));
		
	}

	
	
	
}
