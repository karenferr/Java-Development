package beeCrowd;

import java.util.Scanner;

public class b1164 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();


            for (int i = 1; i <= N; i++) {

                int X = sc.nextInt();
                int soma = 0;

                for (int j = 1; j < X; j++) {
                    if (X%j == 0) {
                        soma += j;
                    }
                }

                if (soma == X) {
                    System.out.println(X + " eh perfeito");
                } else {
                    System.out.println(X + " nao eh perfeito");
                }

            }
        sc.close();
        }

    }



