package A_ALGORITHMS_PROGRAMMING_LOGIC._2DARRAY;

import java.util.Scanner;

public class A_matriz {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int M = sc.nextInt();
		int N = sc.nextInt();

		int[][] mat = new int[M][N];

		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		System.out.println("VALORES NEGATIVOS: ");
		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				if (mat[i][j] < 0) {
					int negativos = mat[i][j];
					System.out.println(negativos);
				}

			}

		}
		sc.close();

	}

}
