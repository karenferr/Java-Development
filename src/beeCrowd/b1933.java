package beeCrowd;

import java.util.Scanner;

public class b1933 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        if (A>B) {
            System.out.println(A);
        }
        else {
            System.out.println(B);
        }

        sc.close();
    }
}
