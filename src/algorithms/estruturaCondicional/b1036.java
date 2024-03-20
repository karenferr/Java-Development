package algorithms.estruturaCondicional;

import java.util.Scanner;

public class b1036 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double A = sc.nextDouble();
		double B = sc.nextDouble();
		double C = sc.nextDouble();
		double delta, R1, R2;
		sc.close();

		delta = Math.pow(B, 2) - 4 * A * C;
		R1 = (- B + Math.sqrt(delta))/ ( 2 * A);
		R2 = (- B - Math.sqrt(delta))/ ( 2 * A);
		
		if (delta < 0 || A == 0) {
			System.out.println("Impossivel calcular");
		} else {
			System.out.printf("R1 = %.5f%n", R1);
			System.out.printf("R2 = %.5f", R2);
		}
	}

}
