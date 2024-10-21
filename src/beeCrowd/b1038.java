package A_ALGORITHMS_PROGRAMMING_LOGIC.estruturaCondicional;

import java.util.Scanner;

public class b1038 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int codigo = sc.nextInt();
		int quantidade = sc.nextInt();
		sc.close();

		switch (codigo) {
		case 1:
			System.out.printf("Total: R$ %.2f", 4.0 * quantidade);
			break;
		case 2:
			System.out.printf("Total: R$ %.2f", 4.5 * quantidade);
			break;
		case 3:
			System.out.printf("Total: R$ %.2f", 5.0 * quantidade);
			break;
		case 4:
			System.out.printf("Total: R$ %.2f", 2.0 * quantidade);
			break;
		case 5:
			System.out.printf("Total: R$ %.2f", 1.5 * quantidade);
			break;
		}
		System.out.println();
	}
}