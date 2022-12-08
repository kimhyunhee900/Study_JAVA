package com.hanul.object;

public class Ex46_SingTon {

	// 싱글톤 : 공유영역에 한개만 인스턴스를 생성
	private static Ex46_SingTon instance;
	private Ex46_SingTon(){}
	static Ex46_SingTon getInstance() {
		if(instance == null) {    			//겍체가 없어야 만들어짐
			instance = new Ex46_SingTon();
		}
	return instance;
	}
	
	//데이터베이스 연결할때 많이 씀.
}
