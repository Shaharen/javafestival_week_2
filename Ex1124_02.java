package nov.twentyfour;


public class Ex1124_02 {

	public static void main(String[] args) {
		// �־��� 1������ ������ �־�������
		// ���� �Ÿ��� ª�� �� ���� index ���
		int[] point = { 92, 32, 52, 9, 81, 2, 68 };

		int num1 = 0;// �� index �� ���� ��
		int num2 = 0;// �� index �� ū ��
		int distance = 0;
		int min = 100;
		// �迭�� �� 2���� ������� �̾� �Ÿ��� ��
		// �Ÿ��� �ּҰ��� ���ϰ� �׶��� �ε��� ���
		for (int j = 0; j <= 6; j++) {
			for (int i = 0; i <= j; i++) {
				distance = point[j] - point[i];
				// ���� ���ȭ
				if (distance < 0) {
					distance = -distance;
				}
				// System.out.print(distance + " ");
				// �Ÿ� 0 �� ������ �ּҰ� ���� �� �׶��� �ε��� ���� ����
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
