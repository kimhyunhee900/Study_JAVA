package com.hanul.animal;

public class dog extends animal implements IAnimal {

	public dog(String kind) {
		super(kind);
	}

	@Override
	public void dowhat() {
		System.out.println(kind + "땅위를 달린다");
		
	}
	
	
	
	
}
