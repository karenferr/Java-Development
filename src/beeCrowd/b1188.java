package beeCrowd;

import java.util.Scanner;

public class b1188 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char O = sc.next().charAt(0);
        double[][] matriz = new double[12][12];
        
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++) {
                matriz[i][j] = sc.nextDouble();
            }
        }
        
        double soma = 0;
        int contador = 0;

        for (int i = 7; i < 12; i++) {
            for (int j = 12-i; j < i; j++) {
                soma += matriz[i][j];
                contador++;
            }
        }

        if (O == 'S') {
            System.out.printf("%.1f\n", soma);
        } else if (O == 'M') {
            double media = soma / contador;
            System.out.printf("%.1f\n", media);
        }
        sc.close();
    }
}
