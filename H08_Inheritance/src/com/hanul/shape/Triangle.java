package com.hanul.shape;

public class Triangle extends Shape{

	int width;

	public Triangle(int height, int width) {
		super(height);
		this.width = width;
	}
	
	public void getAround() {
			System.out.printf("높이 %d 밑변 %d인 직사각형의 둘레는 %.2f 이다\n", 
					height, width, (width + height) + (double)Math.sqrt(width*width + height*height));
		} 
	

	@Override
	public void getArea() {
		System.out.printf("높이 %d 밑변 %d 인 직각삼각형의 넓이는 %.2f 이다\n", height, width, width*height/(double)2);
	}
	
	
	
}
