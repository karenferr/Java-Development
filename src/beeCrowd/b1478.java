package beeCrowd;

import java.util.Scanner;

public class b1478 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            
            int n = sc.nextInt();
            if (n == 0) break;

            int[][] matriz = new int[n][n];

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    matriz[i][j] = 1 + Math.abs(i - j);
                }
            }

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (j == 0) {
                        System.out.printf("%3d", matriz[i][j]);
                    } else {
                        System.out.printf(" %3d", matriz[i][j]);
                    }
                }
                System.out.println();
            }
            System.out.println();
        }

        sc.close();
    }
}
