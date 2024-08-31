package A_PROGRAMMING_LOGIC_AND_ALGORITHMS.matrizes;

import java.util.Locale;
import java.util.Scanner;




public class H_matriz {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		

		int N = sc.nextInt();

		double matriz[][] = new double[N][N];

		for (int linha = 0; linha < N; linha++) {
			for (int coluna = 0; coluna < N; coluna++) {
				matriz[linha][coluna] = sc.nextDouble();
			}
		} // leitura

		int indiceLinha = sc.nextInt();
		int indiceColuna = sc.nextInt();

		double soma = 0;
		for (int linha = 0; linha < N; linha++) {
			for (int coluna = 0; coluna < N; coluna++) {
				if (matriz[linha][coluna] > 0) {
					soma = matriz[linha][coluna] + soma;
				}
			}
		} // soma de todos os elementos positivos
		System.out.printf("SOMA DOS POSITIVOS: %.1f%n", soma);

		System.out.printf("LINHA ESCOLHIDA:");
		for (int coluna = 0; coluna < N; coluna++) {
			System.out.printf("%.1f%n", matriz[indiceLinha][coluna]);
		} // todos elementos da linha

		System.out.printf("COLUNA ESCOLHIDA:");
		for (int linha = 0; linha < N; linha++) {
			System.out.printf("%.1f%n", matriz[linha][indiceColuna]);
		} // todos elementos da coluna

		System.out.print("DIAGONAL PRINCIPAL:");
		for (int i = 0; i < N; i++) {
			System.out.printf(" %.1f%n", matriz[i][i]);
		} // diagonal principal

		for (int linha = 0; linha < N; linha++) {
			for (int coluna = 0; coluna < N; coluna++) {
				if (matriz[linha][coluna] < 0) {
					matriz[linha][coluna] = matriz[linha][coluna] * matriz[linha][coluna];
				}
			}
		} // matriz alterada

		System.out.println("MATRIZ ALTERADA:");
		for (int linha = 0; linha < N; linha++) {
			for (int coluna = 0; coluna < N; coluna++) {
				System.out.printf("%.1f ", matriz[linha][coluna]);
			}
			System.out.println();
		}
		sc.close();
	}
}
