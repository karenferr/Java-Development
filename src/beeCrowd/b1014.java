package beeCrowd;

import java.util.Scanner;

public class b1014 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner (System.in);
		
		int x;
		double y, consumo;
		
		x = sc.nextInt();
		y = sc.nextDouble();
		sc.close();
		
		consumo = x/y;
		
		System.out.printf("%.3f km/l", consumo);
		System.out.println();

	}

}
