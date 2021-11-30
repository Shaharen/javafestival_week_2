package nov.twentyfive;

import java.util.Scanner;

public class Ex1125_03 {

	public static void main(String[] args) {
		// 5개의 정수를 입력받아 버블정렬을 활용하여
		// 오름차순 정렬
		// 버블정렬 = 0번 1번 / 1번 2번 ... 순으로 계속 비교하여
		// 큰수를 계속 뒤로 변경
		// 1회전 후 배열에서 가장 큰수가 배열의 끝으로감
		Scanner sc = new Scanner(System.in);

		int[] num = new int[5];
		int temp = 0;

		for (int i = 0; i < num.length; i++) {
			System.out.println((i + 1) + "번째 수 입력 : ");
			num[i] = sc.nextInt();
		}
		// 0번과 1번 비교 - num[0] 이 더 크면 자리 교체
//		if (num[0] > num[1]) {
//			temp = num[0];
//			num[0] = num[1];
//			num[1] = temp;
//		}
//		// 1번과 2번 비교
//		if (num[1] > num[2]) {
//			temp = num[1];
//			num[1] = num[2];
//			num[2] = temp;

//		// 1 회전
//		for (int i = 0; i < num.length - 1; i++) {
//			if (num[i] > num[i + 1]) {
//				temp = num[i];
//				num[i] = num[i + 1];
//				num[i + 1] = temp;
//			}
//		}
//		// 2회전 똑같이 앞에서부터 비교하지만 맨뒤는 할필요없음
//		for (int i = 0; i < num.length - 2; i++) {
//			if (num[i] > num[i + 1]) {
//				temp = num[i];
//				num[i] = num[i + 1];
//				num[i + 1] = temp;
//			}
//		}
		// 끝까지
		for (int j = 1; j <= num.length; j++) {
			for (int i = 0; i < num.length - j; i++) {
				if (num[i] > num[i + 1]) {
					temp = num[i];
					num[i] = num[i + 1];
					num[i + 1] = temp;
				}
			}

		}

		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}

	}

}
