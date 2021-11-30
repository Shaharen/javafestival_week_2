package nov.twentytwo;

import java.util.Scanner;

public class Ex1122_01 {

	public static void main(String[] args) {
		// 정수 n 입력받아 n항까지 출력
		Scanner sc = new Scanner(System.in);

		System.out.print("n 입력 : ");
		int num = sc.nextInt();
		int sum = 0;

		for (int i = 0; i < num; i++) {
			sum = sum + i;
			System.out.print(1 + sum + " ");
		}

		sc.close();

	}

}
