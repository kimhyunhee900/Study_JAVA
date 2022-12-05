package com.hanul.object;

public class Ex34_AccountmMain {

	public static void main(String[] args) {

		// 메인이 있는 클래스를 만들어서 
		// 홍길동씨의 은행계좌 객체를 생성해서 예금주, 계좌번호, 잔액을 출력하고
		// hong    110-123-123456
		// 5만원을 입금한 후 예금주, 계좌번호, 잔액을 출력하고
		// 3만원을 출금한 후 예금주, 계좌번호, 잔액을 출력하시오.
		// (은행계좌번호는 임의로 지정한다)
		
		Ex34_Account hong = new Ex34_Account();
		
		hong.owner = "홍길동";
		hong.balance = 0;
		hong.accountNo =  "110-123-123456";
		
		System.out.printf("%s 의 계좌 총액은 %d 입니다\n", hong.owner, hong.balance );
		
		hong.deposite(50000);
		printAccount(hong.owner, hong.accountNo, hong.balance);
		
		hong.withdraw(30000);
		printAccount(hong.owner, hong.accountNo, hong.balance);
		
		hong.withdraw(30000);
		printAccount(hong.owner, hong.accountNo, hong.balance);
			
		// 1. 심청은 돈을 가지고 가지 않고 통장을 개설했다 - 생성자 잔돈이 없는 것
		Ex34_Account sim = new Ex34_Account("심청","123-456-512318");
		System.out.printf("%s 의 계좌번호는 %s 입니다. 잔액은 %d 입니다\n", sim.owner, sim.accountNo, sim.balance);
	
		// 2. 전우치는 돈 5만원을 내고 통장개설을 했다 - 생성자가 모두 받아야함
		Ex34_Account jeun = new Ex34_Account("전우치","456-789-789511",50000);
		System.out.printf("%s 의 계좌번호는 %s 입니다. 잔액은 %d 입니다\n", jeun.owner, jeun.accountNo, jeun.balance);
		
//	public Ex34_Account(String owner, String accountNo, int balance) {
//		this.owner = owner;
//		this.accountNo = accountNo;
//		this.balance = balance;
//}
		
		
	}

	
	
	static void printAccount(String owner, String accountNo, int balance) {
		System.out.printf("%S 의 계좌번호는 %S입니다. 잔액은 %d 원 입니다\n", owner, accountNo, balance);
	}
	
	
}
