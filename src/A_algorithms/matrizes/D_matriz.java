package A_algorithms.matrizes;

import java.util.Scanner;

public class D_matriz {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		int matriz[][] = new int[N][N];

		for (int linha = 0; linha < N; linha++) {
			for (int coluna = 0; coluna < N; coluna++) {
				matriz[linha][coluna] = sc.nextInt();
			}
		}
		
		int soma =0;
		for (int linha = 0; linha < N; linha++) {
			for (int coluna = linha+1; coluna < N; coluna++) {
				soma = soma + matriz[linha][coluna];
			}
		}
		sc.close();

	}

}
