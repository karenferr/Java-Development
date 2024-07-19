package beeCrowd;

import java.util.Scanner;

public class b1012 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		double triangulo, circulo, trapezio, quadrado, retangulo;
		sc.close();
		
		triangulo = (a * c) / 2;
		circulo = 3.14159 * Math.pow(c, 2);
		trapezio = ((a + b) * c) / 2;
		quadrado = Math.pow(b, 2);
		retangulo = a * b;
				
		System.out.printf("TRIANGULO: %.3f", triangulo);
		System.out.println();
		System.out.printf("CIRCULO: %.3f", circulo);
		System.out.println();
		System.out.printf("TRAPEZIO: %.3f", trapezio);
		System.out.println();
		System.out.printf("QUADRADO: %.3f", quadrado);
		System.out.println();
		System.out.printf("RETANGULO: %.3f", retangulo);
		System.out.println();
	}

}
