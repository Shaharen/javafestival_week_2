package nov.twentysix;

public class Ex1126_03_2 {

	public static void main(String[] args) {
		// ������ ����Ͽ� ���̾Ƹ�� ���� ���
		int[][] diamond = new int[7][7];

		int num = 1;

		for (int i = 0; i < diamond.length; i++) {
			for (int j = 0; j < diamond[0].length; j++) {
				if (i == 0 && j == 3) {
					diamond[i][j] = num;
					num++;
				}
				if (i == 1 && j > 1 && j < 5) {
					diamond[i][j] = num;
					num++;
				}
				if (i == 2 && j > 0 && j < 6) {
					diamond[i][j] = num;
					num++;
				}
				if (i == 3) {
					diamond[i][j] = num;
					num++;
				}
				if (i == 4 && j > 0 && j < 6) {
					diamond[i][j] = num;
					num++;
				}
				if (i == 5 && j > 1 && j < 5) {
					diamond[i][j] = num;
					num++;
				}
				if (i == 6 && j == 3) {
					diamond[i][j] = num;
					num++;
				}
			}
		}
		for (int i = 0; i < diamond.length; i++) {
			for (int j = 0; j < diamond[0].length; j++) {
				System.out.print(diamond[i][j] + "\t");
			}
			System.out.println();
		}

	}

}
