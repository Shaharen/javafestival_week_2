package nov.twentyfive;

import java.util.Scanner;

public class Ex1125_02 {

	public static void main(String[] args) {
		// 5개의 정수를 입력받아 오름차순으로 정렬하여 출력하는 프로그램
		// 선택정렬
		Scanner sc = new Scanner(System.in);

		int[] num = new int[5];

		// 5개 정수 배열 생성
		for (int i = 0; i < num.length; i++) {
			System.out.print((i + 1) + "번째 수 입력 : ");
			num[i] = sc.nextInt();
		}
		int min = 10000;
		int temp = 0;

		// 01 02 03 04 비교 해서 최소값 새로운거 0번
		// 12 13 14 비교해서 최소값 새로운거 1번
		// 23 24 / 34
		// 첫 선택 0 ~ 3 [4] 두번째 선택 1 ~ 4 [4]

		// 0번 1번 비교 -> 1번이 더 작으면 1번을 0번으로 아니면 그냥 둠
		// 1이 4(length)까지 반복
//		for (int i = 0; i < num.length; i++) {
//			if (num[0] > num[i]) {
//				temp = num[0];
//				num[0] = num[i];
//				num[i] = temp;
//			}
//		}
		for (int j = 0; j < num.length - 1; j++) {
			for (int i = j; i < num.length; i++) {
				if (num[j] > num[i]) { // num[j] < num[i] 하면 내림차순
					temp = num[j];
					num[j] = num[i];
					num[i] = temp;
				}
			}
		}
		// 정렬된 배열 출력
		System.out.println("정렬 후");
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");
		}

	}

}
