package nov.twentythree;

import java.util.Random;

public class Ex1123_02 {

	public static void main(String[] args) {
		// 중복없이 숫자를 뽑는 로또 프로그램 45번까지
		Random random = new Random();

		int[] array = new int[45];
		int[] array2 = new int[6];
		
		// 배열 중 랜덤으로 6개 추출
		// i 를 랜덤으로 뽑은것을 0번부터 새로운 배열에 넣는다
		// 다음 i를 다음거에 넣으며 앞과 동일할경우 다시 뽑는다
		
		for (int i = 0; i < 6; i++) {
			array2[i] = random.nextInt(44) + 1;
			for (int j = 0; i > j; j++) {
				if (array2[i] == array2[j]) {
					i = i - 1;
				}
			}
		}
		for (int i = 0; i < 6; i++) {
			System.out.println("행운의 숫자 : " + array2[i]);
		}
	}

}
