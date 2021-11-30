package nov.twentyfive;

import java.util.Scanner;

public class Ex1125_01 {

	public static void main(String[] args) {
		// 10진수 정수를 입력받아 2진수로 변환해서 출력
		// 중간에 들어간 모든 출력문은 확인용
		Scanner sc = new Scanner(System.in);

		System.out.println("숫자입력 >> ");
		int num = sc.nextInt();

		// num가 2^i 와 2^i+1 사이에 있는 i 찾기

		int two = 1;
		int j = 0;

		// two 를 2배후 num와 크기 비교
		// two가 num 보다 컷을때 그때 i를 출력하고 for 문 종료
		for (int i = 1; i < 10; i++) {
			two = two * 2;
			if (two > num) {
				// System.out.println(i - 1);
				j = i - 1; // 밑에서 쓰기 편하게 변수 재선언
				// System.out.println(j);
				// System.out.println(two / 2);
				break;
			}
		}
		
		two = two / 2;
		// System.out.println(j);
		// System.out.println(two);
		// 2^i 부터 떨어지며 나누고 몫은 계속 나누고 나머지 추출
		for (int i = j; j >= 0; j--) {
			System.out.print(num / two);
			num = num % two;
			two = two / 2;
		}

	}

}
