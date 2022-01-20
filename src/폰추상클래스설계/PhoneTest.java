package 폰추상클래스설계;

public class PhoneTest {

	public static void main(String[] args) {
		
		System.out.println("손흥민 선수가");
		
		Phone person = new SmartPhone();
			person.run();
			
		
		System.out.println();
		
		System.out.println("이강인 선수가");
		
		Phone person2 = new TelePhone();
			person2.run();
			
	}

}
