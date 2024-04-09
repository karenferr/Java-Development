package A_algorithms.estruturaSequencial;

import java.util.Scanner;

public class b1002 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Double raio, A;

		raio = sc.nextDouble();

		sc.close();

		A = 3.14159 * raio * raio;

		System.out.printf("A=%.4f", A);
		System.out.println();

	}

}
