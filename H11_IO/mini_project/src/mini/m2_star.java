package mini;

public class m2_star {

	public static void main(String[] args) {
		
		//2. 아래와 같은 별표를 찍는 프로그램을 작성하여 출력하시오.
		//***** 
		//**** 
		//*** 
		//** 
		//* 
		
		for(int i = 0; i<5; i++) {
			for(int s = 1; s<=5-i; s++) {
				System.out.print("*");
			}
		System.out.println();
		}


	}

}
