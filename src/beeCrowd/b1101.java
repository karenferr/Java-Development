package beeCrowd;

import java.util.Scanner;

public class b1101 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) { //  ler pares de valores
            // continuamente até que um par com um número nulo ou negativo
            // seja inserido, o que encerra o loop.

            int M = sc.nextInt();
            int N = sc.nextInt();

            if (M <= 0 || N <= 0) {
                break;
            }

            int menor = Math.min(M, N);
            int maior = Math.max(M, N);

            int soma = 0;
            for (int i = menor; i <= maior; i++) {
                System.out.print(i + " ");
                soma += i;
            }
            System.out.println("Sum=" + soma);

        }
        sc.close();
    }
}

