package nov.twentysix;

public class Ex1126_02 {

	public static void main(String[] args) {
		// 2차원 배열을 왼쪽으로 180도 회전하여 출력
		// 원본과 180도 출력 둘다 출력

		int[][] basic = new int[5][5];
		int[][] after = new int[5][5];

		for (int j = 0; j < basic.length; j++) {
			for (int i = 0; i < basic[0].length; i++) {
				basic[i][j] = 5 * j + i + 1;
				System.out.print(basic[i][j] + " ");
			}
			System.out.println();
		}
		
		
		// 180도 회전
		System.out.println("180도 회전");
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
