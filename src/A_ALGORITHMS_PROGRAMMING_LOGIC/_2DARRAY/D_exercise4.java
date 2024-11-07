package A_ALGORITHMS_PROGRAMMING_LOGIC._2DARRAY;

import java.util.Scanner;

public class D_exercise4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);

        int N = sc.nextInt();
        int [][]matriz = new int [N][N];
        int soma = 0;
        boolean diagonalP = false;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (j>i) {
                    soma += matriz[i][j];
                }
            }
        }
        System.out.println(soma);
        sc.close();
    }
}
