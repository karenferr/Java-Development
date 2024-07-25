package beeCrowd;

import java.util.Scanner;

public class b1133 {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);

        int X = sc.nextInt();
        int Y = sc.nextInt();

        if (Y>X) {
            for (int i = X+1; i < Y; i++) {
                if (i%5==2 || i%5==3) {
                    System.out.println(i);
                }
            }
        }
        else {
            for (int i = Y+1; i < X; i++) {
                if (i%5==2 || i%5==3) {
                    System.out.println(i);
                }
            }
        }

        sc.close();
    }
}
