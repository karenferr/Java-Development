package A_algorithms.beeCrowd;

import java.util.Scanner;

public class b1013 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		sc.close();

		int maiorAB = (a + b + Math.abs(a-b))/ 2;
		int maiorABC = (maiorAB + c + Math.abs(maiorAB-c))/ 2;
		
		System.out.println(maiorABC + " eh o maior");
		System.out.println();
	}
}
