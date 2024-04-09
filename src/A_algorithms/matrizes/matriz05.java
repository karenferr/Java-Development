package A_algorithms.matrizes;

import java.util.Scanner;

public class matriz05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int M = sc.nextInt();
		int N = sc.nextInt();

		int matrizA[][] = new int[M][N];
		int matrizB[][] = new int[M][N];
		int matrizC[][] = new int[M][N];

		for (int linha = 0; linha < M; linha++) {
			for (int coluna = 0; coluna < N; coluna++) {
				matrizA[linha][coluna] = sc.nextInt();
			}
		}
		for (int linha = 0; linha < M; linha++) {
			for (int coluna = 0; coluna < N; coluna++) {
				matrizB[linha][coluna] = sc.nextInt();
			}
		}
		for (int linha = 0; linha < M; linha++) {
			for (int coluna = 0; coluna < N; coluna++) {
				matrizC[linha][coluna] = matrizA[linha][coluna] + matrizB[linha][coluna];
			}

		}

		for (int linha = 0; linha < M; linha++) {
			for (int coluna = 0; coluna < N; coluna++) {
				System.out.print(matrizC[linha][coluna] + " ");
			}

		}
		sc.close();

	}

}
