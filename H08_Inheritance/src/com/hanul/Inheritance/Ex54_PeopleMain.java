package com.hanul.Inheritance;

public class Ex54_PeopleMain {

	public static void main(String[] args) {

		Ex53_People people = new Ex53_People("사람", 25);
		people.eat();
		people.sleep();
		
		Ex51_Student hong = new Ex51_Student("홍길동", 32, "220101");
		hong.eat();
		hong.sleep();
		hong.gotoschool();
		System.out.printf("%s 의 나이는 %d 이고 사번은 %s 입니다\n", hong.name, hong.age, hong.studentN);
		
		Ex52_Worker jeun = new Ex52_Worker("전우치", 34, "hanul170501");
		jeun.eat();
		jeun.sleep();
		jeun.gotoWork();
		System.out.printf("%s 의 나이는 %d 이고 사번은 %s 입니다\n", jeun.name, jeun.age, jeun.workerN);
		
	}

}
