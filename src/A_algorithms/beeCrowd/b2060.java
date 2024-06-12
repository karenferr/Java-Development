package A_algorithms.beeCrowd;

import java.util.Scanner;

public class b2060 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int multiploDois = 0;
        int multiploTres = 0;
        int multiploQuatro = 0;
        int multiploCinco = 0;

        for (int i = 0; i < N; i++) {
                int numeros = sc.nextInt();
                if (numeros % 2 == 0) {
                    multiploDois++;
                }
                if (numeros % 3 == 0) {
                    multiploTres++;
                }
                if (numeros % 4 == 0) {
                    multiploQuatro++;
                }
                if (numeros % 5 == 0){
                    multiploCinco++;
                }
        }
        System.out.println(multiploDois + " Multiplo(s) de 2");
        System.out.println(multiploTres + " Multiplo(s) de 3");
        System.out.println(multiploQuatro + " Multiplo(s) de 4");
        System.out.println(multiploCinco + " Multiplo(s) de 5");
    }
}

