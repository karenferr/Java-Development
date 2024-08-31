package beeCrowd;

import java.util.Scanner;

public class b1155 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        double soma = 1.0;
        for (int n = 2; n <=100 ; n++) {
            soma += 1.0/n;
        }
        System.out.printf("%.2f%n", soma);
        sc.close();
    }
}
