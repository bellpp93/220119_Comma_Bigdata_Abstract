package ���߻�Ŭ��������;

public abstract class Phone {
	static String owner1 = "�����";
	static String owner2 = "�̰���";
	
	public abstract void turnOn();
	public abstract void turnOff();

	final public void run() {
		turnOn();
		turnOff();
	}
}
