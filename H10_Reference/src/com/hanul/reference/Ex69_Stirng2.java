package com.hanul.reference;

public class Ex69_Stirng2 {

	public static void main(String[] args) {

		String str = "자바 프로그래밍 입문  ";
		int leng = str.length();   // 문자열의 길이  -- 길이를 할 때는 1부터시작, index는 0부터 시작
			System.out.println(leng);
		
		
		// 문자열을 잘라서 일부를 리턴해주는 메소드 : substring();
		String str1 = str.substring(3, 8);  // 3~7까지 자름
		System.out.println(str1);
		
		int[] arr = {10,11,12,13,15}; 
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		// 문자열 연결 메소드 : concat()
		String str5 = " Do it";
		str5 = str5.concat(str);	// 결과값 : " Do it자바 프로그래밍 입문  "
		System.out.println(str5);	
		
		//양쪽 공백 지우기
		System.out.println(str5.trim());	// 결과값 : "Do it자바 프로그래밍 입문"
		
		// 영문자에 대한 대/소문자화 메소드 : toUpperCase()/toLowerCase()
		System.out.println(str5.toUpperCase());
		System.out.println(str5);
		System.out.println(str5.toLowerCase());
		System.out.println(str5);
		System.out.println(str5.toLowerCase().trim());
		
		// 문자열 변경 메소드 : replace(기존 문자열, 변경 할 문자열)
		String str6 = "Hi Hanul";
		str6 = str6.replace("Hi", "Hello");
		System.out.println(str6);   // Hello Hanul로 값이 바뀜
		
		// 문자열 중 한글자만 바꾸고 싶을때
		str6 = str6.replace("H", "A");
		System.out.println(str6);   // Aello Aanul로 값이 바뀜
		
		// 위의 것들을 한줄로
		String str7 = " Hi Hanul ";
		str7 = str7.replace("Hi", "Hello").replace("H", "A").substring(0,10).trim();
		System.out.println(str7);
		
		// 문자열에서 특정 문자열의 시작위치의 인덱스를 리턴하는 메소드 : indexOf(),lastIndexOf()
		String str8 = "문자열에서 특정 문자나 문자열이 있는 시작위치를 리턴";
		// 왼쪽부터 시작해서 "문자열" 이라는 문자열의 시작위치
		System.out.println(str8.indexOf("문자열"));
		int idx1 = str8.indexOf("문자");
			System.out.println(idx1);
		idx1 = str8.indexOf("문자", idx1 +1);
			System.out.println(idx1);
		idx1 = str8.indexOf("문자", idx1 +1);
			System.out.println(idx1);
		// 오른쪽부터 시작해서 "문자"라는 문자열의 시작위치
		System.out.println(str8.lastIndexOf("문자"));
		// 특정위치(왼쪽6위치)에서부터 "문자"라는 문자열의 시작위치
		System.out.println(str8.indexOf("문자",6));
		
		String str9 = "안녕 나는 홍길동이야";
		String[] arr1 = str9.split(" ");  //split : 원하는부분을 자르는 기능
		
		for(String str10 : arr1) {
			System.out.println(str10);
		}
		
		String str10 = "안녕,나는,홍길동이야";
		String[] arr2 = str10.split(",");
		
		for(String str11 : arr1) {
			System.out.println(str11);
		}
		
		
	}

}
