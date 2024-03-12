package desafios.modulo03;

import java.util.Scanner;

public class desafio0320_1 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int soma = 0;

            for (int i=1; i<=10; i++) {
                System.out.println("Número: ");
                double numero = sc.nextInt();

                if (numero%2==0) {
                    soma += numero;
                }
                else {
                    i--;
                } // Se o número digitado for ímpar (o else do if), o contador i é decrementado em 1

            } // A cada iteração bem-sucedida, i é incrementado em 1.
            System.out.println(soma);


            sc.close();
        }
}
