package nov.twentytwo;

import java.util.Scanner;

public class Ex1122_02 {

	public static void main(String[] args) {
		// 행 개수 입력받아 별 출력
		Scanner sc = new Scanner(System.in);

		System.out.print("행 개수 : ");
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
