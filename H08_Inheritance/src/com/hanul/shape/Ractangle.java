package com.hanul.shape;

public class Ractangle extends Shape {

	int width;

	public Ractangle(int height, int width) {
		super(height);
		this.width = width;
	}
	
	public void getAround() {
		System.out.printf("높이 %d 밑변 %d인 직사각형의 둘레는 %d 이다\n", 
				height, width, 2*(width + height));
	}

	@Override
	public void getArea() {
		System.out.printf("높이 %d 밑변 %d 인 직각삼각형의 넓이는 %.2f 이다\n", height, width, (double)width*height);
	}
	
	
	
}
