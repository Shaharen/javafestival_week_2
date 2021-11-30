package nov.twentysix;

import java.util.Arrays;

public class Ex1126_03_1 {
	// ���� �ϰ� ���� �������� ���� ����!!

	public static void main(String[] args) {
		// 2���� �迭�� ���̾Ƹ�� ���·� ��� (�Ÿ��������ε� �� �� ����)

		int[][] diamond = new int[7][7];

		// ù�� : i * i + 1 (2������) / 26-(7-i)*(7-i) (3������)
		// j�� 2ĭ�� ���� (2������) / 2ĭ�� ����(3������)

		// ����Ʈ �� �迭 ����
		// 0 ~ 2��
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 7; j++) {
				if (j == 2 * i + 1) {
					break;
				}
				diamond[i][j] = i * i + j + 1;
				System.out.print(diamond[i][j] + " ");
			}
			System.out.println();
		}
		// 3 ~ 6��
		for (int i = 3; i < diamond.length; i++) {
			for (int j = 0; j < diamond[0].length - 2 * (i - 3); j++) {
				diamond[i][j] = 26 - ((7 - i) * (7 - i)) + j;
				System.out.print(diamond[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println(Arrays.deepToString(diamond));
		System.out.println();
		// ����Ʈ
		// 0,6�� 3ĭ // 1, 5�� 2ĭ // 2, 4�� 3ĭ ����Ʈ
		int[][] shift = new int[7][7];

		for (int i = 0; i < diamond.length; i++) {
			for (int j = 0; j < diamond[0].length; j++) {
				switch (i % 7) {
				case 0, 6:
					if (j < 4) {
						shift[i][j + 3] = diamond[i][j];
					}
					break;
				case 1, 5:
					if (j < 5) {
						shift[i][j + 2] = diamond[i][j];
					}
					break;
				case 2, 4:
					if (j < 6) {
						shift[i][j + 1] = diamond[i][j];
					}
					break;
				case 3:
					if (j < 7) {
						shift[i][j] = diamond[i][j];
					}
					break;
				}
				System.out.print(shift[i][j] + "\t");
			}
			System.out.println();
		}

	}

}
