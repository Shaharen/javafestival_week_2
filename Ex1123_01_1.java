package nov.twentythree;

import java.util.Random;

public class Ex1123_01_1 {

	public static void main(String[] args) {
		// 8ĭ ũ���� �迭�� �����ϰ� ������ �ߺ����� ��� ��
		// ���� ū ���� ���� �� ���
		Random random = new Random();

		int min = 100;
		int max = 0;

		int intArray[] = new int[7];
		System.out.println("�迭�� �ִ� ��� �� : ");
		for (int i = 0; i < intArray.length; i++) {
			intArray[i] = random.nextInt(100) + 1;

			// 0���� 50�� �Է��ߴٰ� ����, 1���� 50�� �ٽ� �޾Ҵٸ�(�� i=1)
			for (int j = 0; j < i; j++) { // j=0
				if (intArray[i] == intArray[j]) { // 0���� 1���� ���ٸ�
					for (; i > j; j++) { // 0�� 1 ���� ������ i���� �ٽ� �̾ƶ� 0�� 1�� ������Ű��
						intArray[i] = random.nextInt(100) + 1;
					}
				}
			}
			System.out.print(intArray[i] + " ");

			if (intArray[i] > max) {
				max = intArray[i];
			}
			if (intArray[i] < min) {
				min = intArray[i];
			}

		}
		System.out.println();
		System.out.println("���� ū �� : " + max);
		System.out.println("���� ���� �� : " + min);

	}

}
