package �߻�Ŭ����������;

//�߻� Ŭ����, �θ� Ŭ���� ����
public abstract class Car {  //Ŭ���� �տ� abstract ������ �߻�Ŭ����
	//�߻� �޼ҵ� ����
	public abstract void drive();  //�߻� �޼ҵ�� �߰�ȣ{}�� ����.
	public abstract void stop();
	
	//�Ϲ� �޼ҵ� ����
	public void startCar() {  //�Ϲ� �޼ҵ�� �߰�ȣ{}�� ������ � ������ ������ �ִ´�.
		System.out.println("�õ��� �մϴ�.");
	}
	
	public void turnOff() {
		System.out.println("�õ��� ���ϴ�.");
	}
	
	//[�߿�] ���ø� �޼ҵ� => ������ ���� ���� �ϳ�(�����ӿ�,�÷��� ������ �� ���� ���)
	//run() ���ø� �޼ҵ�� Car�� ��� �޷��� �ϴ����� �����ؾ� �Ѵ�.
	//			=> �� '�������'�� '�ó�����'�� ������ �޼ҵ��̴�.
	final public void run() {
		startCar();
		drive();
		stop();
		turnOff();
	}
}
