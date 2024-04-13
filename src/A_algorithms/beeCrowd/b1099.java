package A_algorithms.beeCrowd;

import java.util.Scanner;

public class b1099 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int N = sc.nextInt();

        for (int i=0; i<N; i++) {
            int X = sc.nextInt();
            int Y = sc.nextInt();

            int valorMinimo, valorMaximo;

            if (X<Y) {
                valorMinimo = X;
                valorMaximo = Y;
            }
            else {
                valorMinimo = Y;
                valorMaximo = X;
            }

            int somaImpares = 0;
            for (int numero = valorMinimo + 1; numero < valorMaximo; numero++) {
                if (numero%2 != 0) {
                    somaImpares += numero;
                }
            }

            System.out.println(somaImpares);

        }
        sc.close();

    }
}
