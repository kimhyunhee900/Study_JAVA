package com.hanul.object;

public class Ex45_StudentMain {

	public static void main(String[] args) {

		Ex44_Student hong = new Ex44_Student("홍길동");
		Ex44_Student sim = new Ex44_Student("심청", "010-123-456");
		Ex44_Student jeun = new Ex44_Student("전우치","010-987-456");

		printStudent(hong);
		printStudent(sim);
		printStudent(jeun);
		
		
	}

	static void printStudent(Ex44_Student student) {
		System.out.println(student.id + ", " + student.name + ", " + student.phoneNo);
		
	}
	
}
