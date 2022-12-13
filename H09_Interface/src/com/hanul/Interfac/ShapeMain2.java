package com.hanul.Interfac;

public class ShapeMain2 {

	public static void main(String[] args) {
		
		//Shape sh = new Shape(10);
		//IShape ish = new IShape();
		Triangle tri = new Triangle(10,15);
		tri.getArea();
		tri.getAround();
		
		Ractangle rect = new Ractangle(10,15);
		rect.getArea();
		rect.getAround();
		
		
		
		
	}
}
