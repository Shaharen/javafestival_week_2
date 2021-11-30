package nov.twentyfour;


public class Ex1124_02 {

	public static void main(String[] args) {
		// 주어진 1차원의 점들이 주어졌을때
		// 가장 거리가 짧은 두 점의 index 출력
		int[] point = { 92, 32, 52, 9, 81, 2, 68 };

		int num1 = 0;// 두 index 중 작은 것
		int num2 = 0;// 두 index 중 큰 것
		int distance = 0;
		int min = 100;
		// 배열의 수 2개를 순서대로 뽑아 거리를 잼
		// 거리의 최소값을 구하고 그때의 인덱스 출력
		for (int j = 0; j <= 6; j++) {
			for (int i = 0; i <= j; i++) {
				distance = point[j] - point[i];
				// 음수 양수화
				if (distance < 0) {
					distance = -distance;
				}
				// System.out.print(distance + " ");
				// 거리 0 을 제외한 최소값 설정 후 그때의 인덱스 누적 저장
				if (distance != 0 && min > distance) {
					min = distance;
					if (i > j) {
						num1 = j;
						num2 = i;
					} else {
						num1 = i;
						num2 = j;
					}
				}
			}
		}
		// System.out.println(min);
		System.out.print("result = ");
		System.out.println("[" + num1 + ", " + num2 + "]");

	}

}
