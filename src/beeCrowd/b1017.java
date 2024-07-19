package beeCrowd;

import java.util.Scanner;

public class b1017 {

	public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	
	int tempo, velocidade;
	double litros, distancia;
	
	tempo = sc.nextInt();
	velocidade = sc.nextInt();
	sc.close();
	
	distancia = velocidade * tempo;
	litros = distancia / 12; 
	
	System.out.printf("%.3f%n", litros);
	System.out.println();
	

	}

}
