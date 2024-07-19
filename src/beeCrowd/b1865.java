package beeCrowd;

import java.util.Scanner;

public class b1865 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int casos = sc.nextInt();


        for (int i = 0; i < casos; i++) {
            String nome = sc.next();
            int forca = sc.nextInt();

            if (nome.equals("Thor")) {
                System.out.println("Y");
            }
            else if (forca <= 25000){
                System.out.println("N");
            }
            else {
                System.out.println("M");
            }

        }
        sc.close();
    }
}
