package A_algorithms.estruturaRepetitiva;

import java.util.Scanner;

public class b1142 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		for (int i = 1; i <= N * 4; i = i + 4) {
			int um = i + 1;
			int dois = i + 2;
			System.out.println(i + " " + um + " " + dois + " PUM");
		}
		sc.close();

	}

}
