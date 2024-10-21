package beeCrowd;

import java.util.Scanner;

public class b1187 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double[][]M = new double[12][12];
        char O = sc.next().charAt(0);

        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++) {
                M[i][j] = sc.nextDouble();
            }
        }

        double soma = 0;
        double contador = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = i+1; j < 11-i; j++) {
                soma += M[i][j];
                contador++;
            }
        }

        if (O == 'S') {
            System.out.printf("%.1f%n", soma);
        } else if (O == 'M') {
            double media = soma / contador;
            System.out.printf("%.1f%n", media);
        }

        sc.close();
    }
}
