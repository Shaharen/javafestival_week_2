package nov.twentytwo;

import java.util.Scanner;

public class Ex1122_02 {

	public static void main(String[] args) {
		// �� ���� �Է¹޾� �� ���
		Scanner sc = new Scanner(System.in);

		System.out.print("�� ���� : ");
		int num = sc.nextInt();

		for (int i = num; num > 0; i = num) {
			for (; i > 0; i--) {
				System.out.print("*");
			}
			num -= 1;
			System.out.println(" ");
		}

		sc.close();

	}

}
