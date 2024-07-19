package beeCrowd;

import java.util.Scanner;

public class b1020 {

	public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	
	int x = sc.nextInt();
	sc.close();
	
	System.out.println(x/365 + " anos(s)");
	x = x % 365;
	System.out.println(x/30 + " mes(es)");
	x = x % 30;
	System.out.println(x + " dia(s)");
	System.out.println();
	}

}
