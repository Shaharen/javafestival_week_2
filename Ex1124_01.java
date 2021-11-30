package nov.twentyfour;

import java.util.Scanner;

public class Ex1124_01 {

	public static void main(String[] args) {
		// N과 X를 입력 받아
		// N개의 정수를 입력 받는다
		// N개의 숫자 중 X보다 작은 수만 출력
		Scanner sc = new Scanner(System.in);

		System.out.print("N 입력 >> ");
		int N = sc.nextInt();
		System.out.print("X 입력 >> ");
		int X = sc.nextInt();

		int[] small = new int[N];

		for (int i = 1; i <= N; i++) {
			System.out.print(i + "번째 정수 입력 >> ");
			int num = sc.nextInt();
			if (num < X) {
				small[i] = num;
			}
		}
		System.out.print("결과 >> ");
		for (int i = 0; i < small.length; i++) {
			if (small[i] != 0) {
				System.out.print(small[i]+" ");
			}
		}

	}

}
