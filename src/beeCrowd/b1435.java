package beeCrowd;

import java.util.Scanner;

public class b1435 {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);



        while (true) {

            int N = sc.nextInt();

            if (N==0) break;

            int [][]M = new int [N][N];

            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {

                    // O valor da célula é determinado pela menor distância até as bordas
                    int valor = Math.min(Math.min(i, j), Math.min(N - 1 - i, N - 1 - j)) + 1;

                    // Imprime o valor formatado
                    if (j == 0) {
                        System.out.printf("%3d", valor);
                    } else {
                        System.out.printf(" %3d", valor);
                    }
                    System.out.println();
                }
            }
            System.out.println();
        }

        sc.close();

    }
}
