package beeCrowd;

import java.util.Scanner;

public class b1075 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        if (N<10000) {
            for (int i = 1; i < 10000; i++) {
                if (i%N==2) {
                    System.out.println(i);
                }
            }
        }
        sc.close();
    }
}
