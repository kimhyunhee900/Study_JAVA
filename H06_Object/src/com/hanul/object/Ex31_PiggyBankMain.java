package com.hanul.object;

public class Ex31_PiggyBankMain {

	public static void main(String[] args) {

		// 돼지저금통 객체를 만든다 / 인스턴스를 만든다  : 메모리에 올라감
		Ex30_PiggyBank pb = new Ex30_PiggyBank();		
				//new로 만든 클래스에서 전에 만든 클래스를 가져오는데, pb로 이름을 준것
		
		pb.owner = "홍길동";
		pb.total = 0;
				// 새로 선언을 해주는데 타입이 빠진 이유는 기존 클래스에서 owner, total의 타입을 선언해줬기때문에 그걸 그대로 따라와서 가능
		
		System.out.printf("%s 의 저금통의 총액은 %d 입니다\n", pb.owner, pb.total );
		
		printBank(pb.owner, pb.total);
		
		// 저금통에 10,000원을 저금한다 : pb객체 안에 존재하는 메소드
		pb.inputmoney(10000);
		printBank(pb.owner, pb.total);
		
		// 저금통에서 5,000원을 출금한다
		pb.outputmoney(5000);
		printBank(pb.owner, pb.total);
		
		// 심청의 돼지저금통을 만들고 그 저금통에 20,000원을 저금하여 출력하고 8,000원을 빼고 출력해보세요
		Ex30_PiggyBank sc = new Ex30_PiggyBank();
		
		sc.owner = "심청";
		sc.total = 0;
		printBank(sc.owner, sc.total);
		
		sc.inputmoney(20000);
		printBank(sc.owner, sc.total);
		
		sc.outputmoney(8000);
		printBank(sc.owner, sc.total);
		
		
		
		
		
	}

	static void printBank(String owner, int total) {
		System.out.printf("%s 의 저금통의 총액은 %d 입니다\n", owner, total );
	
	}
	
	
	
	
	
	
}
