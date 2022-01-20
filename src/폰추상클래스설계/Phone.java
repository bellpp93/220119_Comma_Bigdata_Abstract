package 폰추상클래스설계;

public abstract class Phone {
	static String owner1 = "손흥민";
	static String owner2 = "이강인";
	
	public abstract void turnOn();
	public abstract void turnOff();

	final public void run() {
		turnOn();
		turnOff();
	}
}
