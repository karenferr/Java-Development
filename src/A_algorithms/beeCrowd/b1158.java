package A_algorithms.beeCrowd;
import java.util.Scanner;

public class b1158 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

         int N = sc.nextInt();

        for (int i =0; i<N; i++) {
            int X = sc.nextInt();
            int Y = sc.nextInt();

            if (X%2==0) {
                X++;
            }

            int soma = 0;
            for (int j=0; j<Y; j++) {
                soma +=X;
                X+=2;
            }
            System.out.println(soma);
        }
        sc.close();
        }
}

