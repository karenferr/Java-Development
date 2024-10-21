package beeCrowd;
import java.util.Scanner;

public class b1165 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for (int i = 0; i < N; i++) {

            int X = sc.nextInt();
            int contador = 0;

            for (int j = 2; j < X; j++) {
                if (X%j==0) {
                   contador++;
                }
            }

            if (contador>0 || X==1) {
                System.out.println(X+" nao eh primo");
            }
            else {
                System.out.println(X+" eh primo");
            }
        }
        sc.close();

    }
}
