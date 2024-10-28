package beeCrowd;

import java.util.Scanner;

public class b1866 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int C = sc.nextInt();

        for (int i = 0; i < C; i++) {

            int N = sc.nextInt();

            if (N%2==0) {
                System.out.println(0);
            }
            if (N%2!=0) {
                System.out.println(1);
            }
        }
        sc.close();
    }
}
