package com.hanul.object;

public class Ex32_Car {

	// 필드 : 소유주(String : owner), 차종(String : modelName), 속도(int : speed)
	// 메소드 : 시동건다(void : start) 시동을 걸었습니다 출력
	//		  시동끈다(void : stop)  시동을 껐습니다 출력
	//		  엑셀밟는다(void : stepAccel) - 속도 40씩 증가, 100이상이면 100으로
	//		  브레이크를밟는다(void : stepBreak) - 속도 30씩 감소, 0이면 0으로 유지

	String owner, modelName;
	int speed;
	
	//생성자 
	Ex32_Car(String owner){
		this.owner = owner; 
	}
	
	Ex32_Car(){}
	
	public Ex32_Car(String owner, String modelName) {
		this.owner = owner;
		this.modelName = modelName;
	}
	
	public Ex32_Car(String owner, String modelName, int speed) {
		this.owner = owner;
		this.modelName = modelName;
		this.speed = speed;
	}

	void start() {
		System.out.println("시동을 걸었습니다");
	}
	void stop() {
		System.out.println("시동을 껐습니다");
	}
	void stepAccel() {
		speed += 40;
		if(speed>=100) {
			speed=100;
		}
	}	
	void stepBreak() {
		speed -= 30;
		if(speed<=0) {
			speed=0;
		}
	}
	
}
