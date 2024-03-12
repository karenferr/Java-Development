package desafios.modulo03;

import java.util.Scanner;

public class desafio0320_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número inteiro positivo: ");
        int numero = sc.nextInt();

        boolean numeroPrimo = true;

        for (int i = 2; i < numero; i++) {
            if (numero % i ==0) {
                numeroPrimo = false;
                break;
            }

        }

        if (numeroPrimo && numero > 1) {
            System.out.printf("%d é um número primo", numero);
        } else {
            System.out.printf("%d não é um número primo", numero);
        }

        sc.close();
}
    }



