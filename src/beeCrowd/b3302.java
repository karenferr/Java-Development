package beeCrowd;

import java.util.Scanner;

public class b3302 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for (int i = 1; i <= N; i++) {
            int x = sc.nextInt();
            System.out.println("resposta "+i+": "+x);
        }

        sc.close();
    }
}
