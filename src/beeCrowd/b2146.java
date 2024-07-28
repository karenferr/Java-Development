package beeCrowd;

import java.util.Scanner;

public class b2146 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextInt()) {
            int N = sc.nextInt();
            if (N >= 1001 && N <= 9999) {
                System.out.println(N - 1);
            }
        } // método hasNextInt() para verificar se há mais inteiros na entrada. O loop continua enquanto houver inteiros a serem lidos.

        sc.close();
    }
}
