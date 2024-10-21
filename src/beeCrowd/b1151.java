package beeCrowd;

import java.util.Scanner;

public class b1151 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int primeiro = 0;
        int segundo = 1;

        if (N >= 1) {
            System.out.print(primeiro);
        }
        if (N >= 2) {
            System.out.print(" " + segundo);
        }
        for (int i = 2; i < N; i++) {
            int proximo = primeiro + segundo;
            System.out.print(" " + proximo);
            primeiro = segundo;
            segundo = proximo;
        }
        System.out.println();
        sc.close();
    }
}

