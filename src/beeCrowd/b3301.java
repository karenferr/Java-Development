package beeCrowd;

import java.util.Scanner;

public class b3301 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

                while (sc.hasNext()) {
                    int H  = sc.nextInt();
                    int Z = sc.nextInt();
                    int L = sc.nextInt();

                    if (H>Z && H<L || H>L && H<Z) {
                        System.out.println("huguinho");
                    }
                    else if (Z>H && Z<L || Z>L && Z<H) {
                        System.out.println("zezinho");
                    }
                    else {
                        System.out.println("luisinho");
                    }
                }
        sc.close();
    }
}
