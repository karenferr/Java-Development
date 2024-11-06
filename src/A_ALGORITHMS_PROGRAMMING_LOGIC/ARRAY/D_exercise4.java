package A_ALGORITHMS_PROGRAMMING_LOGIC.ARRAY;

import java.util.Scanner;

public class D_exercise4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        double []vetor = new double [N];

        for (int i = 0; i < N; i++) {
            vetor[i] = sc.nextDouble();
        }

        double soma = 0;
        for (int i = 0; i < N; i++) {
            soma += vetor[i];
        }

        double media = soma / N;
        System.out.println(media);

        for (int i = 0; i < N; i++) {
            if (vetor[i]<media) {
                System.out.println(vetor[i]);
            }
        }










        sc.close();
    }
}
