package beeCrowd;

import java.util.Scanner;

public class b1789 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {

            int L = sc.nextInt();
            int maior = 0;

            for (int i = 0; i < L; i++) {
                int []V = new int[L];
                V[i] = sc.nextInt();

                if (V[i] > maior) maior = V[i];
            }

            if (maior >= 20) {
                System.out.println(3);
            } else if (maior>=10) {
                System.out.println(2);
            }
            else {
                System.out.println(1);
            }

        }
        sc.close();
    }
}
