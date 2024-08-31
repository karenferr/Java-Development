package A_PROGRAMMING_LOGIC_AND_ALGORITHMS.matrizes;

import java.util.Scanner;

public class B_matriz {

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
			int soma = 0;
			for (int coluna = 0; coluna < N; coluna++) {
				soma = soma + matriz[linha][coluna];
			}
			System.out.println(soma);
		}
	
		sc.close();

	}

}
