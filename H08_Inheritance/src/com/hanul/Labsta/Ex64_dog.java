package com.hanul.Labsta;

public class Ex64_dog extends Ex63_animal {
	
	public Ex64_dog(String kinds) {
		super(kinds);
	}

	@Override
	void sound() {
		System.out.println(kinds + "멍멍 운다");
		
	}
	

}
