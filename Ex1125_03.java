package nov.twentyfive;

import java.util.Scanner;

public class Ex1125_03 {

	public static void main(String[] args) {
		// 5���� ������ �Է¹޾� ���������� Ȱ���Ͽ�
		// �������� ����
		// �������� = 0�� 1�� / 1�� 2�� ... ������ ��� ���Ͽ�
		// ū���� ��� �ڷ� ����
		// 1ȸ�� �� �迭���� ���� ū���� �迭�� �����ΰ�
		Scanner sc = new Scanner(System.in);

		int[] num = new int[5];
		int temp = 0;

		for (int i = 0; i < num.length; i++) {
			System.out.println((i + 1) + "��° �� �Է� : ");
			num[i] = sc.nextInt();
		}
		// 0���� 1�� �� - num[0] �� �� ũ�� �ڸ� ��ü
//		if (num[0] > num[1]) {
//			temp = num[0];
//			num[0] = num[1];
//			num[1] = temp;
//		}
//		// 1���� 2�� ��
//		if (num[1] > num[2]) {
//			temp = num[1];
//			num[1] = num[2];
//			num[2] = temp;

//		// 1 ȸ��
//		for (int i = 0; i < num.length - 1; i++) {
//			if (num[i] > num[i + 1]) {
//				temp = num[i];
//				num[i] = num[i + 1];
//				num[i + 1] = temp;
//			}
//		}
//		// 2ȸ�� �Ȱ��� �տ������� �������� �ǵڴ� ���ʿ����
//		for (int i = 0; i < num.length - 2; i++) {
//			if (num[i] > num[i + 1]) {
//				temp = num[i];
//				num[i] = num[i + 1];
//				num[i + 1] = temp;
//			}
//		}
		// ������
		for (int j = 1; j <= num.length; j++) {
			for (int i = 0; i < num.length - j; i++) {
				if (num[i] > num[i + 1]) {
					temp = num[i];
					num[i] = num[i + 1];
					num[i + 1] = temp;
				}
			}

		}

		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}

	}

}
