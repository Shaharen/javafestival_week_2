package nov.twentysix;

public class Ex1126_02 {

	public static void main(String[] args) {
		// 2���� �迭�� �������� 180�� ȸ���Ͽ� ���
		// ������ 180�� ��� �Ѵ� ���

		int[][] basic = new int[5][5];
		int[][] after = new int[5][5];

		for (int j = 0; j < basic.length; j++) {
			for (int i = 0; i < basic[0].length; i++) {
				basic[i][j] = 5 * j + i + 1;
				System.out.print(basic[i][j] + " ");
			}
			System.out.println();
		}
		
		
		// 180�� ȸ��
		System.out.println("180�� ȸ��");
		for (int j = 0; j < after.length; j++) {
			for (int i = 0; i < after[0].length; i++) {
				// after[i][j] = 25 - ((5*j) + i);
				after[i][j] = 26 - basic[i][j];
				System.out.print(after[i][j] + " ");
			}
			System.out.println();	
		}

	}

}
