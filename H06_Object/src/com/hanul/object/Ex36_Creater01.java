package com.hanul.object;

public class Ex36_Creater01 {
	
	// 클래스 : 변수(필드, 멤버변수), 메소드, 생성자(나중에)
	// 생성자는 객체를 생성할때 필드에 값을 주면서 생성
	// 1. 생성자는 클래스안에 선언
	// 2. 생성자명은 클래스명과 동일
	// 3. 리턴타입이 없는 메소드 형식
	// 돼지저금통의 특징은 주인이 누구, 총액이 얼마 => 데이터:변수(필드)  -- 특징
	// 행위는 돈을 넣는다, 돈을 빼낸다 => 매소드  -- 행위
	// 데이터  :   타입,        변수
	// 주인 	 :  String		owner
	// 총액 	 :   int		total
	// 행위 	 :  리턴타입,    메소드 이름  (parameters1, 파라미터2...)
	// 돈 넣기 :   int	 inputmoney(int money)
	// 돈 빼기 :   int	 outputmoney(int money)
		
		String owner;  // 생성자 추가는 되지않음. 타입은 한가지만 있어야함.
		int total;
		
		//생성자
		Ex36_Creater01(String name){
			owner = name;
		}
		
		// 자신의 클래스를 가리키는 예약어 this
		Ex36_Creater01(String owner, int total){
			this.owner = owner;
			this.total = total;
		}
		
		
		Ex36_Creater01(){}  // 초기화만 시켜주고 만들어만 놓으면 초기화시키면서 선언 같이 가능함
							// Ex36_Creater01 hong = new Ex36_Creater01("홍길동"); 이것처럼.
		
		Ex36_Creater01(int sum){  // 잔액을 기준으로 생성자도 만들 수 있음
			total = sum;
		}
		
		//Ex36_Creater01(String name, int sum){   // 이름과 잔액을 같이 할 수 있음
	//		owner = name;
	//		total = sum;
	//	}
		
		Ex36_Creater01(int sum, String name){   // 똑같지만 위와 같진 않아서 가능
			owner = name;
			total = sum;
		}
		
		int inputmoney(int money) {
			total += money;
			return total;
		}
		
		int outputmoney(int money) {
			total -= money;
			return total;
		}
		
		// staic이 없어야 같은 패키지 내에서는 불러다 쓸수있음
		// main이 있는 class에서 불러다가 쓸 예정.

}
