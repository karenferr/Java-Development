package beeCrowd;

import java.util.Scanner;

public class b1184 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        char O = sc.next().charAt(0);
        double[][] M = new double[12][12];


        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++) {
                M[i][j] = sc.nextDouble();
            }
        }

        double soma = 0;
        double contador = 0;

        for (int i = 1; i < 12; i++) {
            for (int j = 0; j < i; j++) {
                soma += M[i][j];
                contador++;
            }
        }

        double media = soma / contador;

        if (O=='M'){
            System.out.printf("%.1f%n",media);
        }
        if (O=='S') {
            System.out.printf("%.1f%n",soma);
        }

        sc.close();
    }
}
