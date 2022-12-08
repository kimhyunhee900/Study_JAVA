package com.hanul.animal;

public class Ex60_dog extends Ex59_animal {

	public Ex60_dog(String kind) {
		super(kind);
	}

	@Override   // 기존에 슈퍼클래스에서 정의한걸 여기에 가져와서 재정의함
	void doWhat() {
		System.out.println(kind + "땅위를 달린다");
		
	}
	
	
	
	
}
