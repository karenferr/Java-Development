package A_algorithms.estruturaRepetitiva;

import java.util.Scanner;

public class b1080 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int maior = sc.nextInt();
		int posicao = 1;

		for (int contador = 2; contador <= 100; contador++) {
			int x = sc.nextInt();

			if (x > maior) {
				maior = x;
				posicao = contador;
			}
		}
		System.out.println(maior);
		System.out.println(posicao);
		sc.close();

	}

}
