package com.hanul.object;

public class Ex30_PiggyBank {

	// 클래스 : 변수(필드, 멤버변수), 메소드, 생성자(나중에)
	// 돼지저금통의 특징은 주인이 누구, 총액이 얼마 => 데이터:변수(필드)  -- 특징
	// 행위는 돈을 넣는다, 돈을 빼낸다 => 매소드  -- 행위
	// 데이터  :   타입,        변수
	// 주인 	 :  String		owner
	// 총액 	 :   int		total
	// 행위 	 :  리턴타입,     메소드 이름
	// 돈 넣기 :   int	 inputmoney(int money)
	// 돈 빼기 :   int	 outputmoney(int money)
	
	String owner;
	int total;
	
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
