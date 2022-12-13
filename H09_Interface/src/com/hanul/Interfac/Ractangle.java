package com.hanul.Interfac;

public class Ractangle extends Shape implements IShape{
	
	int width;

	public Ractangle(int height, int width) {
		super(height);
		this.width = width;
	}

	@Override
	public void getArea() {
		System.out.printf("높이 %d 밑변 %d인 직사각형의 넓이는 %.2f 이다\n", height, width, (double)height*width);
	}

	@Override
	public void getAround() {
		System.out.printf("높이 %d 밑변 %d인 직사각형의 둘레는 %.2f 이다\n",height, width,
				(width+height)+(double)Math.sqrt(width*width+height*height));
	}
	
	


	
	
}
