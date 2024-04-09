package A_algorithms.estruturaSequencial;

import java.util.Scanner;

public class b1008 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int numero, horas;
		double valor, salario;

		numero = sc.nextInt();
		horas = sc.nextInt();
		valor = sc.nextDouble();
		sc.close();
		
		salario = horas * valor;

		System.out.println("NUMBER = "+ numero);
		System.out.printf("SALARY = U$ %.2f", salario);
		System.out.println();
	}

}
