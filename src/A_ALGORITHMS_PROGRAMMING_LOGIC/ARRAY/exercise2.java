package A_ALGORITHMS_PROGRAMMING_LOGIC.ARRAY;

import java.util.Scanner;

public class exercise2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);

        int N = sc.nextInt();
        int []vetor = new int [N];

        for (int i = 0; i < N; i++) {
            vetor[i] = sc.nextInt();
        }

        int contador = 0;
        for (int i = 0; i < N; i++) {
          if (vetor[i]%2==0) {
              System.out.print(vetor[i]+" ");
              contador++;
          }
        }
        System.out.println();
        System.out.println(contador);
        sc.close();
    }
}
