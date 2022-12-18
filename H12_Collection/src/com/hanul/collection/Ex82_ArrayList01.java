package com.hanul.collection;

import java.util.ArrayList;

public class Ex82_ArrayList01 {

	public static void main(String[] args) {

		// 자료구조
		// 여러 데이터 타입을 모아둔 데이터 그룹으로 데이터의 검색, 추가, 삭제, 변경이 가능하도록 만들어진 논리적 구조
		// 필드의 데이터 타입을 클래스 선언시 결정하지 않고 객체생성시 결정한다
		// ArrayList<E>, HashMap(K,V)
		// 스텍구조 - 프링글스 , 큐구조 - 반대개념,선입선출
		// 디폴트로 10개의 저장공간이 생긴다. 더 필요하면 알아서 크기를 키워준당..
		// 동일한 데이터 저장가능하고 중복하능하고 저장공간은 알아서 확장하고... 
		// 선언 new
		ArrayList<String> list = new ArrayList<String>();
		// ArrayList<String> list = new ArrayList<String>(5);  5개만 필요하면 뒤에다가 5라고 하면돼....
		// 저장 : add()
		list.add("배");  // list의 0번째에 삽입
		list.add("사과");  // list의 1번째에 삽입
		list.add("귤");  // list의 2번째에 삽입
		list.add("수박");  // list의 3번째에 삽입
		list.add("파인애플");  // list의 4번째에 삽입
		// 리스트에 데이터가 몇개인지  -> size()
		System.out.println(list.size());
		// 조회 : get(index)
		for(int i=0; i<list.size(); i++) {
			String fruit = list.get(i);
			System.out.print(i + ":" + fruit + "\t");
		}
		// 삽입 저장 : add(삽입할위치의 index, 변경할데이터)
		System.out.println();
		list.add(1, "바나나");
		printList(list);
		
		// 변경 저장 : set(변경할위치의 index, 변경할데이터)
		list.set(4,"감");
		printList(list);
		
		// 삭제 : remove(삭제할 index) or remove(삭제할 값)
		list.remove(2);   // 사과삭제
		list.remove("파인애플"); 
		printList(list);
		
		// 데이터의 위치 찾기 : indexOf(데이터)
		int idx = list.indexOf("귤");
		System.out.println(idx);
		
		// 배 하나 더 추가, 중복가능
		list.add("배");
		idx = list.lastIndexOf("배");
		System.out.println(idx);
		printList(list);
		
		
		
	}
	
	

	public static void printList(ArrayList<String> list) {
//		System.out.println();
//		for(int i=0; i<list.size(); i++) {
//			String fruit = list.get(i);
//			System.out.print(i + ":" + fruit + "\t");
//		} 
		for(String fruit : list) {
			System.out.print(fruit + " ");
		}
		System.out.println();
		
		
	}
	
}
