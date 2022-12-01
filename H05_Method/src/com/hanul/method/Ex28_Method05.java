package com.hanul.method;

public class Ex28_Method05 {

	public static void main(String[] args) {

		// 배열 = 참조형 ★[] -> String
		// 선언
		// int[] array;    or    int array[];   =>    타입[] 변수명; or  타입 변수명[] 
		// 초기화
		// array = new int[3];
		// int[] array = new int[3];
		// int는 [] 값을 안주면 0으로 처리
		// String은 [] 값을 안주면 null로 처리
		// 다른 배열의 값이랑 똑같이 설정하려면 int[] array = new int[arr.length];
		// 배열의 값을 알고 싶으면 int[] array = new int[arr.length];
		
		// int[] abc;
		// abc = new int[5];
		// int[] abc = new int[5];   // 선언과 초기화 동시에
		// int{} abc = {1,2,3,4,5};  // 선언과 초기화 값까지 동시에
		// int num = arr.length;  => system.out.println(num); -> arr의 해당배열갯수 
		
//		String[] arrStr = new String[3];  // 선언
//		
//		int[] arr = new int[3];  // 선언
//
//		int[] arr1 = {85, 90, 75};  // 선언과 초기화 동시가능
//		
//		for(int i = 0; i < arr.length; i++) {
//			System.out.println(arr[i]);
//		}
//		
//		arr[0] = 85;
//		arr[1] = 90;
//		arr[2] = 75;
//		
//		for(int i = 0; i < arr.length; i++) {
//			System.out.println(arr[i]);
//		}
//		
//		for(int val : arr ) {
//			System.out.println(val);
//		}
//		
//		arrStr[0] = "국어";
//		arrStr[1] = "영어";
//		arrStr[2] = "수학";
//		
//		for(int i = 0; i < arrStr.length; i++) {
//			System.out.println(arrStr[i]);
//		}
//		
//		for(String str : arrStr ) {
//			System.out.println(str);
//		}
				
		int[] parkJumsu = {81,84,95};
		int[] simJumsu = {96,92,84};
		int[] hongJumsu = {80,76,82};
		
		float avg;  // 평균
		char grade; // 학점
		
		// 성적 평균 구하기  메소드
		avg = averageOfScore(parkJumsu);		
		// 성적 평균의 학점 구하기 메소드
		grade = gradeOfAverage(avg);		
		System.out.printf("박문수의 평균은 %.2f 이고 학점은 %c 이다\n", avg, grade);
		
		avg = averageOfScore(simJumsu);
		grade = gradeOfAverage(avg);
		System.out.printf("심청이의 평균은 %.2f 이고 학점은 %c 이다\n", avg, grade);
		
		avg = averageOfScore(hongJumsu);
		grade = gradeOfAverage(avg);
		System.out.printf("홍길동의 평균은 %.2f 이고 학점은 %c 이다\n", avg, grade);
		
		
		printScore(parkJumsu, "박문수");
		printScore(simJumsu, "심청이");
		printScore(hongJumsu, "홍길동");
		
	
		// 여러번 같은 일을 할때 메소드를 만들고 반복적으로 실행
		// 위와 다르게 한번의 평균값만 구할게 아니라 언제든 볼 수 있게 각 값이 필요하면 각자 변수를 만들어 값을 넣어줘야함. ex_float avg1,avg2...
	}
	

	static char gradeOfAverage(float avg) {
		char ha = 0;
		if(avg>=90) {
			ha = 'A';
		}else if(avg>=80) {
			ha = 'B';
		}else if(avg>=70) {
			ha = 'C';
		}else if(avg>=60) {
			ha = 'D';
		}else {
			ha = 'F';
		}
		return ha;
	}

	static float averageOfScore(int[] ra) {      // 이름은 중요하지않고 형태가 중요함.
		float avg = 0.0f;  //  평균. 평균은 소수점도 나오니까. float는 기본형이 0.0f임
		int sum = 0;		// 각 점수의 합
		for(int a = 0; a<ra.length; a++) {
			sum = sum + ra[a];
		}
		avg = sum  / (float)ra.length;
		return avg;
	}

	static void printScore(int[] jumsu, String name) {
		float avg = 0;
		char grade;
		avg = averageOfScore(jumsu);
		grade = gradeOfAverage(avg);
		System.out.printf("%s의 평균은 %.2f 이고 학점은 %c 이다\n", name, avg, grade);
	}
}

