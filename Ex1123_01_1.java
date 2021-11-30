package nov.twentythree;

import java.util.Random;

public class Ex1123_01_1 {

	public static void main(String[] args) {
		// 8칸 크기의 배열을 선언하고 랜덤수 중복없이 출력 후
		// 가장 큰 수와 작은 수 출력
		Random random = new Random();

		int min = 100;
		int max = 0;

		int intArray[] = new int[7];
		System.out.println("배열에 있는 모든 값 : ");
		for (int i = 0; i < intArray.length; i++) {
			intArray[i] = random.nextInt(100) + 1;

			// 0번에 50을 입력했다고 가정, 1번이 50을 다시 받았다면(즉 i=1)
			for (int j = 0; j < i; j++) { // j=0
				if (intArray[i] == intArray[j]) { // 0번과 1번이 같다면
					for (; i > j; j++) { // 0이 1 보다 작을때 i번을 다시 뽑아라 0을 1씩 증가시키며
						intArray[i] = random.nextInt(100) + 1;
					}
				}
			}
			System.out.print(intArray[i] + " ");

			if (intArray[i] > max) {
				max = intArray[i];
			}
			if (intArray[i] < min) {
				min = intArray[i];
			}

		}
		System.out.println();
		System.out.println("가장 큰 값 : " + max);
		System.out.println("가장 작은 값 : " + min);

	}

}
