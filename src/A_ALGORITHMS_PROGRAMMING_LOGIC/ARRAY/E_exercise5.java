package A_ALGORITHMS_PROGRAMMING_LOGIC.ARRAY;

import java.util.Scanner;

public class E_exercise5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[]vetor = new int [N];

        for (int i = 0; i < N; i++) {
            vetor[i] = sc.nextInt();
        }

        int soma = 0;
        int contador = 0;
        for (int i = 0; i < N; i++) {
            if (vetor[i]%2==0) {
                soma += vetor[i];
                contador++;
            }
        }

        double media = soma / contador;

        System.out.println(media);
        sc.close();
    }
}
