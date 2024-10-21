package A_ALGORITHMS_PROGRAMMING_LOGIC.matrizes;

import java.util.Scanner;

public class C_matriz {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		int matriz[][] = new int[N][N];

		for (int linha = 0; linha < N; linha++) {
			for (int coluna = 0; coluna < N; coluna++) {
				matriz[linha][coluna] = sc.nextInt();
			}
		}

		
		for (int linha = 0; linha < N; linha++) {
			int maior = matriz[linha][0];
			for (int coluna = 1; coluna < N; coluna++) {
				if (matriz[linha][coluna] > maior) {
					maior = matriz[linha][coluna];
				}
			}
			System.out.println(maior);
		}
		
		sc.close();

	}

}
