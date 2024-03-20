package algorithms.estruturaRepetitiva;

import java.util.Scanner;

public class b1079 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		for (int i = 1; i <= N; i++) {
			double v1 = sc.nextDouble();
			double v2 = sc.nextDouble();
			double v3 = sc.nextDouble();

			double mediaPonderada = (v1 * 2 + v2 * 3 + v3 * 5) / 10;
			
			System.out.printf("%.1f%n", mediaPonderada);

		}
		sc.close();

	}

}
