package com.hanul.account;

public class Ex55_Account {


		// 필드: 계좌번호(String : AccountNo), 예금주(String: Owner), 잔액(int : balance)
		// 메소드: 예금한다 메소드, 출금한다 메소드
		// 예금한다: 입금한 금액만큼 잔액을 증가시키고 리턴하는 데이터가 없는 메소드로 선언
		// 			void : deposite(int amount) 
		// 출금한다: 출금요청한 금액만큼 잔액을 감소시키고 출금한 금액을 리턴하는 메소드로 선언
		//			int : withdraw(int amount)
		
		String owner, accountNo;
		int balance = 0;
		
		Ex55_Account(){}
		
		public Ex55_Account(String owner,String accountNo) {
			this.owner = owner;
			this.accountNo = accountNo;
		}
		
		public Ex55_Account(String owner, String accountNo, int balance) {
			this(owner, accountNo);
			this.balance = balance;
		}
		
		void deposite(int amount) {
			balance += amount;
		}
		
//		int withdraw(int amount) {
//			balance -= amount;
//			return balance;
//		}
		
		//만약 잔액보다 출금액이 많으면 return 0;
		int withdraw(int amount) throws Exception {
			if(balance < amount) {
				throw new Exception("잔액이 부족합니다.");
			}
			balance -= amount;
			return amount;
		}
}