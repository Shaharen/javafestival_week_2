package nov.twentyseven;

import java.util.Scanner;

public class Ex1127_01 {

	public static void main(String[] args) {
		// ���� N�� �Է¹޾�
		// N*N �迭�� ���� ���� �� ���
		// ¦�� -> ������� Ȧ�� -> ����
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �Է� >> ");
		int n = sc.nextInt();
		int[][] num = new int[n][n];

		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num[0].length; j++) {
				if (i % 2 == 0) {
					num[i][j] = 5 * i + j + 1;
				} else {
					num[i][j] = 5 * (i + 1) - j;
				}
				System.out.print(num[i][j] + " ");
			}
			System.out.println();

		}

	}

}
