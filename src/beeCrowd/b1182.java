package beeCrowd;

import java.util.Scanner;

public class b1182 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int C = sc.nextInt(); // coluna
        char T = sc.next().charAt(0); // operacao
        double[][] matriz = new double[12][12];

        double soma = 0;

        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++) {
                matriz[i][j] = sc.nextDouble();
            }
        }

        for (int i = 0; i < 12; i++) {
            soma += matriz[i][C];
        }

            if (T=='S') {
                System.out.printf("%.1f%n", soma);
            }
            else if (T=='M') {
                 double media = soma / 12;
                System.out.printf("%.1f%n", media);
            }
            else {
                System.out.println("Erro");
            }

            sc.close();
        }

}
