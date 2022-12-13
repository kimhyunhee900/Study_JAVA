package com.hanul.animal;

public class bird extends animal implements IAnimal{

	public bird(String kind) {
		super(kind);
	}

	@Override
	public void dowhat() {
		System.out.println(kind + "하늘을 난다");
		
	}
	
	
	
}
