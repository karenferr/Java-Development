package beeCrowd;

import java.util.Scanner;

public class b1005 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		double a, b, media;
		
		a = sc.nextDouble();
		b = sc.nextDouble();
		sc.close();
		
		media = (a * 3.5 + b * 7.5) / 11;
		
		System.out.printf("MEDIA = %.5f", media);
		System.out.println();
		
	}

}
