package mini;

public class m4_circle {

	//4. 원의 반지름을 입력받아 원의 넓이를 구하는 클래스를 만들고 이 클래스를 이용하여 
	//   객체를 만들어 반지름과 원의 넓이를 츨력하는 프로그램을 작성하시오. 
	
	int radius;

	public m4_circle(int radius) {
		this.radius = radius;
	}
	
	int getRadius() {
		return this.radius;
	}
	
	double getArea() {
		return 2*3.14*radius;
	}
	
}
