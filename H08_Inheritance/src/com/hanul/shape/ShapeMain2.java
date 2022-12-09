package com.hanul.shape;

public class ShapeMain2 {

	public static void main(String[] args) {

		Shape tri = new Triangle(10,5);
		tri.getArea();
		
		Shape rect = new Ractangle(10,5);
		rect.getArea();
		
		if(rect instanceof Ractangle) {
			Ractangle rect2 = (Ractangle)rect;
			rect2.getAround();
		}
		
		if(tri instanceof Triangle) {
			Triangle tri2 = (Triangle)tri;
			tri2.getAround();
		}
		
		Triangle tri2 = null;
		if(tri instanceof Triangle) {
			tri2 = (Triangle)tri;
		}
		tri2.getAround();
	}
}
