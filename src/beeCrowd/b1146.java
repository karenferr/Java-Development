package beeCrowd;

import java.util.Scanner;

public class b1146 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            int X = sc.nextInt();
            if (X==0) {
                break;
            }

            for (int i = 1; i <= X; i++) {
                System.out.print(i + " ");
            }

        }
        sc.close();

    }
}
