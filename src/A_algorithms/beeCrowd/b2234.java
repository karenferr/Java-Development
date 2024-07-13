package A_algorithms.beeCrowd;

import java.util.Scanner;

public class b2234 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int H = sc.nextInt();
        int P = sc.nextInt();

        if (1<=H && P<=1000) {
            double media = (double) H / P;
            System.out.printf("%.2f%n", media);
        }


        sc.close();
    }
}
