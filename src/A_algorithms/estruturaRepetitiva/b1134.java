package A_algorithms.estruturaRepetitiva;

import java.util.Scanner;

public class b1134 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int valor = sc.nextInt();
		int alcool = 0; 
		int gasolina = 0;
		int diesel = 0;

		while (valor != 4) {
			if (valor == 1) {
				alcool = alcool + 1;
			} else if (valor == 2) {
				gasolina = gasolina + 1;
			} else if (valor == 3) {
				diesel = diesel + 1;
		}
		valor = sc.nextInt();

		}
		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);

		sc.close();

	}
}
