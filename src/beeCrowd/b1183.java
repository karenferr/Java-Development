package beeCrowd;

import java.util.Scanner;

public class b1183 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        char O = sc.next().charAt(0);
        double M[][] = new double[12][12];

        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++) {
                M[i][j] = sc.nextDouble();
            }
        }

        double soma = 0;
        int contador = 0;
        for (int i = 0; i < 12; i++) {
            for (int j = i+1; j < 12; j++) {
                soma += M[i][j];
                contador++;
            }
        }

        double media = soma / 66;

        if (O=='S') {
            System.out.printf("%.1f%n", soma);
        }
        else {
            System.out.printf("%.1f%n", media);
        }

        sc.close();
    }
}
