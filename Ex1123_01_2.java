package nov.twentythree;

import java.util.Random;

public class Ex1123_01_2 {

	public static void main(String[] args) {
		// 8ĭ�� �迭�� �����ϰ� �ߺ����� ���ڸ� �̾�
		// ���� ū���� ������ ���
		Random random = new Random();

		int[] num = new int[8];
		int max = 0;
		int min = 100;

		System.out.print("�迭�� �ִ� ���� : ");
		for (int i = 0; i < 8; i++) {
			num[i] = random.nextInt(100) + 1;
			for (int j = 0; i > j; j++) {
				if (num[i] == num[j]) {
					i = i - 1;
				}
			}
			if (max < num[i]) {
				max = num[i];
			}			
			if (min > num[i]) {
				min = num[i];
			}
		}
		for (int i = 0; i < 8; i++) {
			System.out.print(num[i] + " ");
		}System.out.println();
		System.out.println("���� ū �� : " + max);
		System.out.println("���� ���� �� : " + min);

	}

}
