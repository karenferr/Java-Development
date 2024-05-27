package A_algorithms.beeCrowd;
import java.util.Scanner;

public class b1589 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        if (T<=10000) {
            for (int i=0; i<T; i++) {
            int r1 = sc.nextInt();
            int r2 = sc.nextInt();
            System.out.println(r1+r2);
            }
        }
        sc.close();

    }
}
