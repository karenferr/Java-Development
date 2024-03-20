package algorithms.estruturaSequencial;

import java.util.Scanner;

public class b1009 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double salario = sc.nextDouble();
		double vendas = sc.nextDouble();
		double total;
		sc.close();
		
		total = salario + 0.15 * vendas;
		
		System.out.printf("TOTAL = R$ %.2f", total);
		System.out.println();
		

	}

}
