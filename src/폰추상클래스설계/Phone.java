package 폰추상클래스설계;
//추상 클래스
public abstract class Phone {
	//멤버변수(필드)
	public String owner;  //폰의 소유자 이름
	
	//생성자 => [중요] 추상 클래스도 생성자를 가질 수 있다.
	public Phone(String owner) {
		this.owner = owner;  //멤버변수와 매개변수 이름이 같을때는 this.를 붙여준다.
	}
	
	//메소드 구현
	public void turnOn() {
		System.out.println("폰 전원을 켭니다.");
	}
	
	public void turnOff() {
		System.out.println("폰 전원을 끕니다.");
	}
}
