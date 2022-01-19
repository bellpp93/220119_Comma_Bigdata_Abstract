package 추상클래스설계방법;

//추상 클래스, 부모 클래스 설계
public abstract class Car {  //클래스 앞에 abstract 붙은게 추상클래스
	//추상 메소드 선언
	public abstract void drive();  //추상 메소드는 중괄호{}가 없다.
	public abstract void stop();
	
	//일반 메소드 선언
	public void startCar() {  //일반 메소드는 중괄호{}가 있으며 어떤 실행할 문장을 넣는다.
		System.out.println("시동을 켭니다.");
	}
	
	public void turnOff() {
		System.out.println("시동을 끕니다.");
	}
	
	//[중요] 템플릿 메소드 => 디자인 패턴 중의 하나(프레임웍,플랫폼 개발할 때 많이 사용)
	//run() 템플릿 메소드는 Car가 어떻게 달려야 하는지를 구현해야 한다.
	//			=> 즉 '실행순서'와 '시나리오'를 정의한 메소드이다.
	final public void run() {
		startCar();
		drive();
		stop();
		turnOff();
	}
}
