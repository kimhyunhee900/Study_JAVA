package com.hanul.reference;

public class Ex68_String {

	public static void main(String[] args) {

		// 레퍼런스 타입은 new라는 키워드로 객체생성을 하고 사용
		// 하지만 String 타입은 객체 생성없이 인스턴스화 되었고 마치 프리미티브 타입처럼 사용
		// 그 이유는 너무 많이 사용하기 떄문에 내부적으로 처리를 해줌
		// String 타입은 레퍼런스 타입
		
		String str1 = "안녕!";
		String str2 = "안녕!";
		
		if(str1 == str2) {
			System.out.println("같은 인스턴스");
		}else {
			System.out.println("다른 인스턴스");
		}
		
		String str3 = new String("안녕!");
		String str4 = new String("안녕!");
		
		// 시작 주소 비교
		if(str3 == str4) {
			System.out.println("같은 인스턴스");
		}else {
			System.out.println("다른 인스턴스");
		}
		
		// 내용 비교    ==은 사용하면 안되고 equals 를 써야함
		if(str3.equals(str4)) {
			System.out.println("같은 내용");
		}else {
			System.out.println("다른 내용");
		}
		
		if(str1.equals(str4)) {
			System.out.println("같은 내용");
		}else {
			System.out.println("다른 내용");
		}
		
		str1 += "여러분";
		if(str1 == str2) {
			System.out.println("같은 인스턴스");
		}else {
			System.out.println("다른 인스턴스");
		}
		
		// equals 는 공백도 인식하기때문에 조심해야함 
		String str5 = new String("안녕! ");
		String str6 = new String(" 안녕!");
		
		// 내용 비교 : trim()  -> 좌우공백을 없애준다
		if(str5.trim().equals(str6.trim())) {
			System.out.println("같은 내용");
		}else {
			System.out.println("다른 내용");
		}
		
	}

}
