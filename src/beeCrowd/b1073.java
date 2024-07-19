package beeCrowd;

import java.util.Scanner;

public class b1073 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = 6;


        if (N > 5 && N < 2000) {
            for (int i=2; i<=N; i= i+2) {
                int quadradoPares = i * i;
                System.out.println(i + "^2 = " + quadradoPares);
            } // Incremento de 2 em 2 para apenas os pares
        }

        sc.close();
    }
}
