package nov.twentyseven;

public class Ex1127_03 {

	public static void main(String[] args) {
		// 알파벳 순서대로 다음과 같이 모래시계 모양대로 출력

		String[][] alpha = {{"A","B","C","D","E"},{" ","F","G","H"," "},{" "," ","I"," "," "},{" ","J","K","L"," "},{"M","N","O","P","Q"}};

		for ( int i = 0 ; i < alpha.length; i ++) {
			for (int j =0; j < alpha[0].length; j++) {
				System.out.print(alpha[i][j] + " ");
			}
			System.out.println();
		}
		

	}

}
