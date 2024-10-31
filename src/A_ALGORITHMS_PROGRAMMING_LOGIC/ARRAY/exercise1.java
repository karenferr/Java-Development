package A_ALGORITHMS_PROGRAMMING_LOGIC.ARRAY;

import java.util.Scanner;

public class exercise1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        double[] vetor = new double[N];

        for (int i = 0; i < N; i++) {
            vetor[i] = sc.nextDouble();
        }

        double maior = vetor[0];
        int posicao = 0;
        for (int i = 0; i < N; i++) {
            if (vetor[i]>maior) {
                maior = vetor[i];
                posicao = i;
            }
        }
        System.out.println(maior);
        System.out.println(posicao);
        sc.close();
    }
}
