package A_PROGRAMMING_LOGIC_AND_ALGORITHMS;

import java.util.Scanner;

public class A_resolvido {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double nota1 = sc.nextDouble();
		double nota2 = sc.nextDouble();
		sc.close();

		double soma = (nota1 + nota2);
		System.out.printf("NOTA FINAL = %.1f%n", soma);

		if (soma < 60) {
			System.out.println("REPROVADO");
		}
	}

}
