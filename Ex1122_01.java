package nov.twentytwo;

import java.util.Scanner;

public class Ex1122_01 {

	public static void main(String[] args) {
		// ���� n �Է¹޾� n�ױ��� ���
		Scanner sc = new Scanner(System.in);

		System.out.print("n �Է� : ");
		int num = sc.nextInt();
		int sum = 0;

		for (int i = 0; i < num; i++) {
			sum = sum + i;
			System.out.print(1 + sum + " ");
		}

		sc.close();

	}

}
