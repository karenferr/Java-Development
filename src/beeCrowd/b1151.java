package beeCrowd;

import java.util.Scanner;

public class b1151 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        System.out.println(0);
        System.out.println(1);
        for (int i = 2; i <= N; i++) {
            int fibonacci = (i-1)+(i-2);
            if (fibonacci<0) {
                System.out.println(1);
            }
            else {
                System.out.println(fibonacci);
            }
        }

        sc.close();
    }
}
