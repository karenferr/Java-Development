package A_algorithms.estruturaSequencial;

import java.util.Scanner;

public class b1019 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int horas, minutos, segundos;
		sc.close();
		
		horas = N / 3600;
		minutos = (N % 3600) / 60;
		segundos = N % 60;
		
		System.out.println(horas + ":" + minutos + ":" + segundos);
		
		
	}

}
