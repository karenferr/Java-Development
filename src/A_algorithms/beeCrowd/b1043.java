package A_algorithms.beeCrowd;

import java.util.Scanner;

public class b1043 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner (System.in);
		
		double A = sc.nextDouble();
		double B = sc.nextDouble();
		double C = sc.nextDouble();
		
		
		if ((B + C > A) && (A + C > B) && (A + B > C)) {
		double perimetro = A + B + C;
		System.out.printf("Perimetro = %.1f", perimetro);
		}
		else {
			double areaTrapezio = (A+B)*C /2;
			System.out.printf("Area = %.1f", areaTrapezio);
		}
		sc.close();

	}

}
