package beeCrowd;

import java.util.Scanner;

public class b2717 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();

        int soma = A + B;

        if (soma > N) {
            System.out.println("Deixa para amanha!");
        } else {
            System.out.println("Farei hoje!");
        }
    }
}
