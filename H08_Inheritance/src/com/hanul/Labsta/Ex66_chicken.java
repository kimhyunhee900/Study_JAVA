package com.hanul.Labsta;

public class Ex66_chicken extends Ex63_animal {
	
	public Ex66_chicken(String kinds) {
		super(kinds);
	}

	@Override
	void sound() {
		System.out.println(kinds + "꼬끼오 운다");
	}
	

}
