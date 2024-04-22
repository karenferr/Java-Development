package A_algorithms.beeCrowd;

import java.util.Scanner;

public class b1114 {

	public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	
	int valor = sc.nextInt();
	
	while (valor != 2002) {
		System.out.println("Senha Invalida");
		 valor = sc.nextInt();
	}
	
	System.out.println("Acesso Permitido");
	
	
	sc.close();

	}

}
