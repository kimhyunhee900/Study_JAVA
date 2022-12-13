package com.hanul.reference;

public class Ex71_StringBuilder {

	public static void main(String[] args) {

		StringBuilder sb = new StringBuilder();
		System.out.println(sb.capacity());     //capacity는 용량을 알아보는 메소드
		
		// 저장공간 : builder, buffer 두가지, 빠르게 접근할 수 있고 훨씬 빠르게 데이터 가져올 수 있음. 램 역할
		
		sb = new StringBuilder("안녕");
		System.out.println(sb.capacity() + sb.length());
		
		String str = "여러분" + "안녕" + "~"; // 이렇게 하면 저장공간을 많이 차지하고 느림. 이럴때 StringBuilder 사용
																				//하나에 계속 저장
		sb = new StringBuilder();
		sb.append("여러분");
		sb.append("안녕");
		sb.append("~");
		System.out.println(sb);
		
		String val = sb.toString();  // toString은 하나로 표현
		System.out.println(val);
		
	}

}
