package beeCrowd;
import java.util.Scanner;
public class b1759 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int N = sc.nextInt();

        for (int i=0; i<N; i++) {
            if (i < N - 1) {
                System.out.print("Ho ");
            }
            else {
                System.out.println("Ho!");
            }

        }
        sc.close();
    }
}
