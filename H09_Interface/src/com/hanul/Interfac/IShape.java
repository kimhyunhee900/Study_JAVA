package com.hanul.Interfac;

public interface IShape {
	
	// 1. 선언은 class가 아니라 interface로 시작한다
	// 2. 추상메소드와 상수필드만 선언할 수 있다.   // 상수필드 - 변하지 않는 값을 줄 때 (ex 배포용..)
	//		public abstract 를 명시하지 않아도 컴파일러가 자동으로 지정한다
	// 3. 생성자를 가질 수 없고 인터페이스 역시 추상임을 알 수 있다
	// 4. 선언된 메소드는 반드시 오버라이드 해야한다 ★(강제), 그리고 접근제어자는 public으로 선언한다
	// 5. 서브클래스는 implements를 이용하여 인터페이스를 구현한다
	//		class 클래스명 implements 인터페이스명
	// 6. 클래스는 인터페이스를 다중구현 할 수 있다
	//		class 클래스명 implements 인터페이스명1, 인터페이스명2
	// 7. 서브클래스가 클래스 상속과 인터페이스를 동시에 구현하고자 할때는 상속 먼저 진행한다
	//		class 클래스명 extends 슈퍼클래스명 implements 인터페이스명
	// 8. 인터페이스는 인터페이스를 다중상속 할 수 있다.
	//		interface 인터페이스명 extends 인터페이스명1, 인터페이스명2
	
	public void getArea();
	public void getAround();

}
