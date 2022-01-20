package 폰추상클래스설계;

public abstract class Phone {
	String owner;
	
	public void turnOn() {
		System.out.println("폰 전원을 켭니다.");
	}
	public void turnOff() {
		System.out.println("폰 전원을 끕니다.");
	}
	final public void run() {
		turnOn();
		turnOff();
	}
}
