package nov.twentyfour;

import java.util.Scanner;

public class Ex1124_01 {

	public static void main(String[] args) {
		// N�� X�� �Է� �޾�
		// N���� ������ �Է� �޴´�
		// N���� ���� �� X���� ���� ���� ���
		Scanner sc = new Scanner(System.in);

		System.out.print("N �Է� >> ");
		int N = sc.nextInt();
		System.out.print("X �Է� >> ");
		int X = sc.nextInt();

		int[] small = new int[N];

		for (int i = 1; i <= N; i++) {
			System.out.print(i + "��° ���� �Է� >> ");
			int num = sc.nextInt();
			if (num < X) {
				small[i] = num;
			}
		}
		System.out.print("��� >> ");
		for (int i = 0; i < small.length; i++) {
			if (small[i] != 0) {
				System.out.print(small[i]+" ");
			}
		}

	}

}
