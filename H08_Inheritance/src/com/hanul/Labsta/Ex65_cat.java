package com.hanul.Labsta;

public class Ex65_cat extends Ex63_animal {

	public Ex65_cat(String kinds) {
		super(kinds);
	}

	@Override
	void sound() {
		System.out.println(kinds + "야옹야옹 운다");
	}
	
}
