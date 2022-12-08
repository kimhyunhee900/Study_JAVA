package com.hanul.account;

public class Ex57_CheckcardAccount extends Ex55_Account{

	String cardNo;
	
	//체크카드 추가
	public Ex57_CheckcardAccount(String owner, String accountNo, String cardNo) {
		super(owner, accountNo);
		this.cardNo = cardNo;
	}
	
	public Ex57_CheckcardAccount(String owner, String accountNo, int balance, String cardNo) {
		super(owner, accountNo, balance);
		this.cardNo = cardNo;
	}
	
	//체크카드로 출금하기
	int pay(String cardNo, int amount) throws Exception{
		//cd기에 넣은 카드와 계좌에서 발급된 체크카드 번호가 일치하는지
		if(!cardNo.equals(this.cardNo)) {
			throw new Exception("카드가 일치하지않습니다.!");
		}
		//카드가 일치하고 잔액이 출금액보다 많으면 출금
		return withdraw(amount);
	}
}
