package beeCrowd;

import java.util.Scanner;

public class b2862 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int C = sc.nextInt();
        for (int i = 0; i < C; i++) {
            int N = sc.nextInt();
            if (N <= 8000) {
                System.out.println("Inseto!");
            }
            else {
                System.out.println("Mais de 8000!");
            }
        }
        sc.close();
    }
}
