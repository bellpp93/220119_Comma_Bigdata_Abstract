package �ݾ׿��޸��ֱ⿹��;

import java.util.Scanner;

public class DecimalFormatEx {

	public static void main(String[] args) {
		//�غ�ܰ�
		String amount;
		//�Է´ܰ�
		System.out.println("���� �ݾ��� �Է� >>> ");
		Scanner scan = new Scanner(System.in);
		long totalAmount = scan.nextLong();  //"563000" => 563000 ��ȯ
		//ó���ܰ�
		amount = Utils.toNumberFormat(totalAmount);  //"563,000"
		System.out.println("�Ѱ��� �ݾ�: " + amount + "��");
	}
}
