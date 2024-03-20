package algorithms.beeCrowd;

import java.util.Scanner;

public class b1042 {

	public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	
	int X = sc.nextInt();
	int Y = sc.nextInt();
	int Z = sc.nextInt();
	
	if (X>Y && X>Z && Y>Z) {
		System.out.println(Z);
		System.out.println(Y);
		System.out.println(X);
		System.out.println();
		System.out.println(X);
		System.out.println(Y);
		System.out.println(Z);
	}
	else if (X>Y && X>Z && Z>Y){
		System.out.println(Y);
		System.out.println(Z);
		System.out.println(X);
		System.out.println();
		System.out.println(X);
		System.out.println(Y);
		System.out.println(Z);
	}
	else if (Y>X && Y>Z && X>Z){
		System.out.println(Z);
		System.out.println(X);
		System.out.println(Y);
		System.out.println();
		System.out.println(X);
		System.out.println(Y);
		System.out.println(Z);
	}
	else if (Y>X && Y>Z && X<Z){
		System.out.println(X);
		System.out.println(Z);
		System.out.println(Y);
		System.out.println();
		System.out.println(X);
		System.out.println(Y);
		System.out.println(Z);
	}
	else if (Z>X && Z>Y && X>Y){
		System.out.println(Y);
		System.out.println(X);
		System.out.println(Z);
		System.out.println();
		System.out.println(X);
		System.out.println(Y);
		System.out.println(Z);
	}
	else {
		System.out.println(X);
		System.out.println(Y);
		System.out.println(Z);
		System.out.println();
		System.out.println(X);
		System.out.println(Y);
		System.out.println(Z);
	}
	sc.close();
	}

}
