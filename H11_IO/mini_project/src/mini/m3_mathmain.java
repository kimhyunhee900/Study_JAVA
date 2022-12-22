package mini;

public class m3_mathmain {

	public static void main(String[] args) {
		
		//3. 사칙연산 클래스를 만들어 이 클래스를 이용한 사칙연산 프로그램을 작성하시오
		
		m3_math m = new m3_math();
		
		int a = m.add(10, 10);
		System.out.println(a);
		
		int b = m.sub(100, 10);
		System.out.println(b);
		
		int c = m.multi(3, 3);
		System.out.println(c);
		
		int d = m.div(9, 3);
		System.out.println(d);

	}

}
