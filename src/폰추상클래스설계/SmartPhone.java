package 폰추상클래스설계;

public class SmartPhone extends Phone {

	@Override
	public void turnOn() {
		System.out.println("폰 전원을 켭니다.");
		System.out.println("인터넷 검색을 합니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("폰 전원을 끕니다.");
	}
}
