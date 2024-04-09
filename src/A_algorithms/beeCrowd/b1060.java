package A_algorithms.beeCrowd;

import java.util.Scanner;

public class b1060 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int quantidade = 0;
        for (int i=0; i<6; i++) {
            double valor = sc.nextDouble();
            if (valor > 0) {
                quantidade++;
            }
        }

        System.out.println(quantidade + " valores positivos");
        sc.close();
    }
}
