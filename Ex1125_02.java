package nov.twentyfive;

import java.util.Scanner;

public class Ex1125_02 {

	public static void main(String[] args) {
		// 5���� ������ �Է¹޾� ������������ �����Ͽ� ����ϴ� ���α׷�
		// ��������
		Scanner sc = new Scanner(System.in);

		int[] num = new int[5];

		// 5�� ���� �迭 ����
		for (int i = 0; i < num.length; i++) {
			System.out.print((i + 1) + "��° �� �Է� : ");
			num[i] = sc.nextInt();
		}
		int min = 10000;
		int temp = 0;

		// 01 02 03 04 �� �ؼ� �ּҰ� ���ο�� 0��
		// 12 13 14 ���ؼ� �ּҰ� ���ο�� 1��
		// 23 24 / 34
		// ù ���� 0 ~ 3 [4] �ι�° ���� 1 ~ 4 [4]

		// 0�� 1�� �� -> 1���� �� ������ 1���� 0������ �ƴϸ� �׳� ��
		// 1�� 4(length)���� �ݺ�
//		for (int i = 0; i < num.length; i++) {
//			if (num[0] > num[i]) {
//				temp = num[0];
//				num[0] = num[i];
//				num[i] = temp;
//			}
//		}
		for (int j = 0; j < num.length - 1; j++) {
			for (int i = j; i < num.length; i++) {
				if (num[j] > num[i]) { // num[j] < num[i] �ϸ� ��������
					temp = num[j];
					num[j] = num[i];
					num[i] = temp;
				}
			}
		}
		// ���ĵ� �迭 ���
		System.out.println("���� ��");
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");
		}

	}

}
