package A_algorithms.estruturaCondicional;

import java.util.Scanner;

public class b1046 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int inicio = sc.nextInt();
		int fim = sc.nextInt();
		sc.close();

		if (fim > inicio) {
			System.out.printf("O JOGO DUROU " + (fim - inicio) + " HORA(S)");
		} else {
			System.out.printf("O JOGO DUROU " + ((24 - inicio) + fim) + " HORA(S)");
		}
		System.out.println();
	}

}
