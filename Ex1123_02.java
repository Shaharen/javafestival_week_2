package nov.twentythree;

import java.util.Random;

public class Ex1123_02 {

	public static void main(String[] args) {
		// �ߺ����� ���ڸ� �̴� �ζ� ���α׷� 45������
		Random random = new Random();

		int[] array = new int[45];
		int[] array2 = new int[6];
		
		// �迭 �� �������� 6�� ����
		// i �� �������� �������� 0������ ���ο� �迭�� �ִ´�
		// ���� i�� �����ſ� ������ �հ� �����Ұ�� �ٽ� �̴´�
		
		for (int i = 0; i < 6; i++) {
			array2[i] = random.nextInt(44) + 1;
			for (int j = 0; i > j; j++) {
				if (array2[i] == array2[j]) {
					i = i - 1;
				}
			}
		}
		for (int i = 0; i < 6; i++) {
			System.out.println("����� ���� : " + array2[i]);
		}
	}

}
