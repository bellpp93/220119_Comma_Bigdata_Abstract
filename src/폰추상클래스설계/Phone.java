package ���߻�Ŭ��������;

public abstract class Phone {
	String owner;
	
	public void turnOn() {
		System.out.println("�� ������ �մϴ�.");
	}
	public void turnOff() {
		System.out.println("�� ������ ���ϴ�.");
	}
	final public void run() {
		turnOn();
		turnOff();
	}
}
