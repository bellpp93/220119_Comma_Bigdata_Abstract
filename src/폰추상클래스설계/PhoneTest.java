package 폰추상클래스설계;

public class PhoneTest {
	public static void main(String[] args) {
		
		System.out.println(Phone.owner1 + "선수가");
		
		Phone sp = new SmartPhone();
		sp.run();
		
		System.out.println();
		
		System.out.println(Phone.owner2 + "선수가");
		
		Phone tp = new TelePhone();
		tp.run();
	}
}
