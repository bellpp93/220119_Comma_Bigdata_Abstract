package ���߻�Ŭ��������;

public class PhoneTest {
	
	public static void main(String[] args) {
		SmartPhone smartPhone = new SmartPhone("����� ������");
		
		System.out.println(smartPhone.owner);
		smartPhone.turnOn();
		smartPhone.internetSearch();
		smartPhone.turnOff();
		
		System.out.println();
		
		TelePhone telePhone = new TelePhone("�̰��� ������");
		
		System.out.println(telePhone.owner);
		telePhone.turnOn();
		telePhone.autoAnswering();
		telePhone.turnOff();
	}
}
