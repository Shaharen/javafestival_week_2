package nov.twentysix;

import java.util.Scanner;

public class Ex1126_01 {

	public static void main(String[] args) {
		// ���� N �� �Է¹޾�
		// N * N �迭�� ������ ���� ���� ���� �� ���
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�Է� ���� ���� >> ");
		int num = sc.nextInt();
		int[][] nn = new int[num][num];
		
		for (int j = 0; j < nn.length ; j++) {
			for (int i = 0; i < nn[0].length ; i++) {
				nn[i][j] = 5*i + 1*j+1;
				System.out.print(nn[i][j] + " ");
			}System.out.println();
		}
		System.out.println();
		

	}

}
