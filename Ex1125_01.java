package nov.twentyfive;

import java.util.Scanner;

public class Ex1125_01 {

	public static void main(String[] args) {
		// 10���� ������ �Է¹޾� 2������ ��ȯ�ؼ� ���
		// �߰��� �� ��� ��¹��� Ȯ�ο�
		Scanner sc = new Scanner(System.in);

		System.out.println("�����Է� >> ");
		int num = sc.nextInt();

		// num�� 2^i �� 2^i+1 ���̿� �ִ� i ã��

		int two = 1;
		int j = 0;

		// two �� 2���� num�� ũ�� ��
		// two�� num ���� ������ �׶� i�� ����ϰ� for �� ����
		for (int i = 1; i < 10; i++) {
			two = two * 2;
			if (two > num) {
				// System.out.println(i - 1);
				j = i - 1; // �ؿ��� ���� ���ϰ� ���� �缱��
				// System.out.println(j);
				// System.out.println(two / 2);
				break;
			}
		}
		
		two = two / 2;
		// System.out.println(j);
		// System.out.println(two);
		// 2^i ���� �������� ������ ���� ��� ������ ������ ����
		for (int i = j; j >= 0; j--) {
			System.out.print(num / two);
			num = num % two;
			two = two / 2;
		}

	}

}
