package A_ALGORITHMS_PROGRAMMING_LOGIC._2DARRAY;

import java.util.Scanner;

public class F_exercise6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        double [][]M = new double[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                M[i][j] = sc.nextDouble();
            }
        }

        int linha = sc.nextInt();
        int coluna = sc.nextInt();

        double soma = 0;
        System.out.print("SOMA DOS POSITIVOS: ");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (M[i][j]>0) {
                    soma += M[i][j];
                }
            }
        }
        System.out.println(soma);

        System.out.print("LINHA ESCOLHIDA: ");
        for (int i = linha; i <= linha; i++) {
            for (int j = 0; j < N; j++) {
                    System.out.print(M[i][j]+" ");
            }
        }
        System.out.println();

        System.out.print("COLUNA ESCOLHIDA: ");
        for (int i = 0; i < N; i++) {
            for (int j = coluna; j <= coluna; j++) {
                System.out.print(M[i][j]+" ");
            }
        }
        System.out.println();

        System.out.print("DIAGONAL PRINCIPAL: ");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (i==j) {
                    System.out.print(M[i][j]+" ");
                }
            }
        }
        System.out.println();

        System.out.println("MATRIZ ALTERADA: ");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (M[i][j]<0) {
                    M[i][j] = M[i][j]*M[i][j];
                }
                System.out.print(M[i][j]+ " ");
            }
            System.out.println();
        }


        sc.close();
    }
}
