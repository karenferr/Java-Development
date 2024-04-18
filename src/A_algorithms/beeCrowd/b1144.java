package A_algorithms.beeCrowd;
import java.util.Scanner;

public class b1144 {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for (int i=1; i<=N; i++){
            if (N<1000 && N>1) {
                System.out.println(i + " "+ i*i +" "+i*i*i);
                System.out.println(i + " "+ (i*i+1) +" "+(i*i*i+1));
            }
    }
        sc.close();
        }
        }