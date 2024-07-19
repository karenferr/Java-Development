package beeCrowd;

import java.util.Scanner;

public class b1064 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double soma = 0;
        int quantidade = 0;
        for (int i =0; i<6; i++) {
            double valor = sc.nextDouble();
            if (valor > 0) {

                soma = valor + soma;
                quantidade++;

            }
        }

        double media = soma / quantidade;
        System.out.println(quantidade + " valores positivos");
        System.out.printf("%.1f%n", media);

        sc.close();
    }
}
