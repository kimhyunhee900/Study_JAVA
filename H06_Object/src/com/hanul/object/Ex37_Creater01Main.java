package com.hanul.object;

public class Ex37_Creater01Main {

	public static void main(String[] args) {

		Ex36_Creater01 hong = new Ex36_Creater01("홍길동");
		Ex36_Creater01 sim = new Ex36_Creater01("심청",10000);
		Ex36_Creater01 jeun = new Ex36_Creater01();
		jeun.owner = "전우치";
		jeun.total = 3000;
		
		
		System.out.printf("%s 의 계좌잔액은 %d 입니다", hong.owner, hong.total);
		
		
	}

}
