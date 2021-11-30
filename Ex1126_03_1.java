package nov.twentysix;

import java.util.Arrays;

public class Ex1126_03_1 {
	// 참고만 하고 절대 하지말것 절대 절대!!

	public static void main(String[] args) {
		// 2차원 배열에 다이아몬드 형태로 출력 (거리개념으로도 할 수 있음)

		int[][] diamond = new int[7][7];

		// 첫항 : i * i + 1 (2열까지) / 26-(7-i)*(7-i) (3열부터)
		// j는 2칸씩 증가 (2열까지) / 2칸씩 감소(3열부터)

		// 쉬프트 전 배열 생성
		// 0 ~ 2열
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
		// 3 ~ 6열
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
		// 쉬프트
		// 0,6열 3칸 // 1, 5열 2칸 // 2, 4열 3칸 쉬프트
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
