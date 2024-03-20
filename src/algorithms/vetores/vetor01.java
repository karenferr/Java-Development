package algorithms.vetores;

import java.util.Locale;
import java.util.Scanner;

public class vetor01 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		// Lê um inteiro N da entrada = tamanho do vetor
		int N = sc.nextInt();

		// Declara um vetor de números reais com tamanho N
		double[] vet = new double[N];

		// Preenche o vetor com N valores reais lidos da entrada padrão
		for (int i = 0; i < N; i++) {
			vet[i] = sc.nextDouble();
		}

		// Inicializa a variável 'maior' com o primeiro elemento do vetor
		double maior = vet[0];

		// Inicializa a variável 'posicaoMaior' com 0 (índice do primeiro elemento)
		int posicaoMaior = 0;

		// Percorre o vetor a partir do segundo elemento (índice 1) em diante
		for (int i = 1; i < N; i++) {
			// Verifica se o elemento atual do vetor é maior que 'maior'
			if (vet[i] > maior) {
				// Se for maior, atualiza o valor de 'maior' com o valor atual do vetor
				maior = vet[i];
				// Atualiza o valor da 'posicaoMaior' com o índice do elemento maior
				posicaoMaior = i;
			}
		}

		System.out.printf("%.1f%n", maior);
		System.out.println(posicaoMaior);

		sc.close();
	}
}
