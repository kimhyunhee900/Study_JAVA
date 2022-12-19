package com.hanul.thread;

public class Horse2 implements Runnable {
	// 이미 상속받은게 있어서 extends Thread로 하지 않으면 implements Runnable로 해도 결과는 같다.
	
	String name;
	int no;
	static int rank;
	
	public Horse2(String name, int no) {
		this.name = name;
		this.no = no;
	}
	
	//Runnable run() 메소드를 오버라이드 시켜 구현한다.
	public void run() {
		for(int m = 0; m<=100; m += 20) {
			if(m==0) {
				System.out.printf("%d 번 경주마 [%s] 막 출발!!\n", no, name);
			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//경주마가 100미터를 통과 못했을때 출력부분
			if(m<100) {
				System.out.printf("현재 %d 미터 지점통과 %d 번 경주마 [%s]\n ",m, no, name);
			}
			//경주마가 100미터를 통과했을때 순위와 경주마 번호, 이름 출력
			if(m >= 100) {
				++rank;
				System.out.printf("%d위 %d 번 경주마 [%s]\n ",rank, no, name);
			}
		}
	}
	
}
