package nov.twentyseven;

import java.util.Scanner;

public class Ex1127_01 {

	public static void main(String[] args) {
		// 정수 N을 입력받아
		// N*N 배열에 숫자 저장 후 출력
		// 짝수 -> 순서대로 홀수 -> 역순
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 >> ");
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
