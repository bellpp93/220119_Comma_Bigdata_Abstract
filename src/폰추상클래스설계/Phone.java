package ���߻�Ŭ��������;
//�߻� Ŭ����
public abstract class Phone {
	//�������(�ʵ�)
	public String owner;  //���� ������ �̸�
	
	//������ => [�߿�] �߻� Ŭ������ �����ڸ� ���� �� �ִ�.
	public Phone(String owner) {
		this.owner = owner;  //��������� �Ű����� �̸��� �������� this.�� �ٿ��ش�.
	}
	
	//�޼ҵ� ����
	public void turnOn() {
		System.out.println("�� ������ �մϴ�.");
	}
	
	public void turnOff() {
		System.out.println("�� ������ ���ϴ�.");
	}
}
