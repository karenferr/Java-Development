package A_algorithms.estruturaSequencial;

import java.util.Scanner;

public class b1010 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int pecas1, pecas2;
		double valor1, valor2, total;

		pecas1 = sc.nextInt();
		valor1 = sc.nextDouble();
		pecas2 = sc.nextInt();
		valor2 = sc.nextDouble();
		sc.close();

		total = pecas1 * valor1 + pecas2 * valor2;

		System.out.printf("VALOR A PAGAR: R$ %.2f", total);
		System.out.println();

	}

}
