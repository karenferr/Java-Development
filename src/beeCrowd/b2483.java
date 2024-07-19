package beeCrowd;

import java.util.Scanner;

public class b2483 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int I = sc.nextInt();

        if (I<100000 && I>1) {
            System.out.print("Feliz nat");
            for (int i = 0; i < I; i++) {
                System.out.print("a");
            }
            System.out.println("l!");
        }

        sc.close();
    }
}
