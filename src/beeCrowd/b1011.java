package beeCrowd;

import java.util.Scanner;

public class b1011 {

	public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	
	double raio = sc.nextDouble();
	double volume;
	sc.close();
	
	volume = (double) 4 / 3 * 3.14159 * Math.pow(raio, 3);
	
	System.out.printf("VOLUME = %.3f", volume);
	System.out.println();
	
	

	}

}
