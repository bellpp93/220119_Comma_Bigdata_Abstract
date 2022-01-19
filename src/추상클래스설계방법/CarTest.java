package 추상클래스설계방법;

//실행 클래스
public class CarTest {

	public static void main(String[] args) {
		System.out.println("<<< 자율 주행 자동차 >>>");
		
		//객체 생성
		Car myCar = new AICar();
		myCar.run();
		
		System.out.println();
		
		System.out.println("<<< 사람이 운전하는 자동차 >>>");
		
		Car myCar2 = new ManualCar();
		myCar2.run();
	}
}
