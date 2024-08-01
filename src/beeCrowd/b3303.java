package beeCrowd;

import java.util.Scanner;

public class b3303 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            String a = sc.next();
            if (a.length() >=10 ) {
                System.out.println("palavrao");
            }
            else {
                System.out.println("palavrinha");
            }
        }
        sc.close();
    }
}
