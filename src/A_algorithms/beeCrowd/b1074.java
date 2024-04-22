package A_algorithms.beeCrowd;

import java.util.Scanner;

public class b1074 {

	public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	
	int quantidadeValores = sc.nextInt();
	
	for (int contador=1; contador <=quantidadeValores; contador++){
		
		int valor = sc.nextInt();
		
		if (valor==0) {
			System.out.println("NULL");
		}
		else if (valor%2==0 && valor>0) {
			System.out.println("EVEN POSITIVE");
		}
		else if (valor%2==0 && valor<0) {
			System.out.println("EVEN NEGATIVE");
		}
		else if (valor%2!=0 && valor>0) {
			System.out.println("ODD POSITIVE");
		}
		else {
			System.out.println("ODD NEGATIVE");
		}
		
	}
	sc.close();

	}

}
