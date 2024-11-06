package A_ALGORITHMS_PROGRAMMING_LOGIC._2DARRAY;

import java.util.Scanner;

public class C_exercise3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int [][] matriz = new int [N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }


        for (int i = 0; i < N; i++) {
            int maiorElemento = matriz[i][0];
            for (int j = 1; j < N; j++) {
                if (matriz[i][j]>maiorElemento) {
                    maiorElemento = matriz[i][j];
                }
            }
            System.out.println(maiorElemento);
        }
        sc.close();
    }
}
