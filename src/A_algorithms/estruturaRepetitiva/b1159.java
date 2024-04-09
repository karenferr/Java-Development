package A_algorithms.estruturaRepetitiva;

import java.util.Scanner;

public class b1159 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int resultado;

		while (x != 0) {
			if (x % 2 == 0) {
				resultado = x + (x + 2) + (x + 4) + (x + 6) + (x + 8);
				System.out.println(resultado);
			} else {
				resultado = (x + 1) + (x + 3) + (x + 5) + (x + 7) + (x + 9);
				System.out.println(resultado);
			}
			x = sc.nextInt();
		}
		sc.close();
	}
}
