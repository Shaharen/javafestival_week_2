package nov.twentysix;

import java.util.Scanner;

public class Ex1126_01 {

	public static void main(String[] args) {
		// 정수 N 을 입력받아
		// N * N 배열에 다음과 같이 숫자 저장 후 출력
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력 받은 숫자 >> ");
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
