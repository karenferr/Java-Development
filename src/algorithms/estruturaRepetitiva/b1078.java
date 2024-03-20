package algorithms.estruturaRepetitiva;

import java.util.Scanner;

public class b1078 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		
		int N = sc.nextInt();

		for (int i = 1; i <= 10; i++) {
			
			if (2 < N && N < 1000) {
				int multiplicacao = i * N;
				System.out.println(i + " x " + N + " = " + multiplicacao);
			}
		}
		
		sc.close();
	}

}
