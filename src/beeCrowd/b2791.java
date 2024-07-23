package beeCrowd;

import java.util.Scanner;

public class b2791 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int temFeijao = 0;
        for (int i = 1; i <= 4; i++) {
            int posicaoFeijao = sc.nextInt();

           if (posicaoFeijao==1) {
                temFeijao = i;
            }

        }
        System.out.println(temFeijao);

        sc.close();
    }
}
