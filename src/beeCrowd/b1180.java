package beeCrowd;

import java.util.Scanner;

public class b1180 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] X = new int[N];

        for (int i = 0; i < N; i++) {
            X[i] = sc.nextInt();
        }

        int menorValor = X[0];
        int posicao = 0;

        for (int i = 0; i < N; i++) {
            if (X[i]<menorValor) {
                menorValor = X[i];
                posicao = i;
            }
        }

        System.out.println("Menor valor: " + menorValor);
        System.out.println("Posicao: " + posicao);

        sc.close();
    }
}
