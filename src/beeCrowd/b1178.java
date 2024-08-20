package beeCrowd;

import java.util.Scanner;

public class b1178 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double N = sc.nextDouble();

        for (int i = 0; i < 100; i++) {
            System.out.print("N["+i+"] = ");
            System.out.printf("%.4f",N);
            System.out.println();

            N = N/2;
        }

        sc.close();
    }
}
