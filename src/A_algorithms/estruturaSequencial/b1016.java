package A_algorithms.estruturaSequencial;

import java.util.Scanner;

public class b1016 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int distancia, minutos;
		
		distancia = sc.nextInt();
		sc.close();
		
		minutos = distancia * 2;
		
		System.out.printf(minutos + " minutos");
		System.out.println();

	}

}
