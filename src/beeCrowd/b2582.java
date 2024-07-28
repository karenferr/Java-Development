package beeCrowd;

import java.util.Scanner;

public class b2582 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int c = sc.nextInt();

        for (int i = 0; i < c; i++) {
            int X = sc.nextInt();
            int Y = sc.nextInt();
            int soma = X + Y;

            if (soma==0) {
                System.out.println("PROXYCITY");
            }
            else if (soma==1) {
                System.out.println("P.Y.N.G.");
            }
            else if (soma==2) {
                System.out.println("DNSUEY!");
            }
            else if (soma==3) {
                System.out.println("SERVERS");
            }
            else if (soma==4) {
                System.out.println("HOST!");
            }
            else if (soma==5) {
                System.out.println("CRIPTONIZE");
            }
            else if (soma==6) {
                System.out.println("OFFLINE DAY");
            }
            else if (soma==7) {
                System.out.println("SALT");
            }
            else if (soma==8) {
                System.out.println("ANSWER!");
            }
            else if (soma==9) {
                System.out.println("RAR?");
            }
            else {
                System.out.println("WIFI ANTENNAS");
            }
        }

        sc.close();
    }
}
