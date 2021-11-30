package nov.twentyseven;

public class Ex1127_02 {

	public static void main(String[] args) {
		// 2차원 배열을 왼쪽으로 90도 회전하여 출력
		int[][] before = new int[5][5];

		for (int i = 0; i < before.length; i++) {
			for (int j = 0; j < before[0].length; j++) {
				before[i][j] = 5 * i + j + 1;
				System.out.print(before[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();

		// 90도 회전

		for (int i = 0; i < before.length; i++) {
			for (int j = 0; j < before[0].length; j++) {
				before[i][j] = 5 * j + (4 - i) + 1;
				System.out.print(before[i][j] + " ");
			}
			System.out.println();
		}

	}

}
