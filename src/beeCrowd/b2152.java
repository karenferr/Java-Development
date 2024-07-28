package beeCrowd;

import java.util.Scanner;

public class b2152 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int testes = sc.nextInt();

        String frase;
        int H = 0;
        int M = 0;
        int O = 0;

        for (int i = 0; i < testes; i++) {
             H = sc.nextInt();
             M = sc.nextInt();
             O = sc.nextInt();

            if (O==0) {
                frase = " - A porta fechou!";
            }
            else {
                frase = " - A porta abriu!";
            }
            System.out.printf("%02d:%02d%s%n",H,M,frase);
        }
        sc.close();
    }
}
