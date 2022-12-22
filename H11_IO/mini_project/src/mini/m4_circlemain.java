package mini;

public class m4_circlemain {

	public static void main(String[] args) {
	
	//4. 원의 반지름을 입력받아 원의 넓이를 구하는 클래스를 만들고 이 클래스를 이용하여 
	//   객체를 만들어 반지름과 원의 넓이를 츨력하는 프로그램을 작성하시오. 
	
		m4_circle c = null;
		
		c = new m4_circle(3);
		
		int ban = c.getRadius();
		double nb = c.getArea();
		System.out.println("반지름 = " + ban + "\n원의 넓이 = " + nb);
	
	}
}
