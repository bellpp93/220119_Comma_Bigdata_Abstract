package ���߻�Ŭ��������;

public class PhoneTest {
	public static void main(String[] args) {
		
		System.out.println(Phone.owner1 + "������");
		
		Phone sp = new SmartPhone();
		sp.run();
		
		System.out.println();
		
		System.out.println(Phone.owner2 + "������");
		
		Phone tp = new TelePhone();
		tp.run();
	}
}
