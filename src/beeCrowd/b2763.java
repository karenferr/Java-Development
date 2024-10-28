package beeCrowd;

import java.util.Scanner;

public class b2763 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {

            String numero = sc.nextLine();

            String[] partes = numero.split("[.-]");

            for (String parte : partes) {
                System.out.println(parte);
            }

        }
        sc.close();
    }
}
