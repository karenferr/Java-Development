package beeCrowd;

import java.util.Scanner;

public class b2702 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int ca = sc.nextInt();
        int ba = sc.nextInt();
        int pa = sc.nextInt();
        int cr = sc.nextInt();
        int br = sc.nextInt();
        int pr = sc.nextInt();

        int diferencaCaCr = ca - cr;
        int diferencaBaBr = ba - br;
        int diferencaPaPr = pa - pr;

        int semRefeicao1 = 0;
        int semRefeicao2 = 0;
        int semRefeicao3 = 0;

        if (diferencaCaCr < 0) {
            semRefeicao1 = Math.abs(diferencaCaCr);
        }
        else {
            semRefeicao1 = 0;
        }

        if (diferencaBaBr < 0) {
            semRefeicao2 = Math.abs(diferencaBaBr);
        }
        else {
            semRefeicao2 = 0;
        }
         if (diferencaPaPr < 0){
            semRefeicao3 = Math.abs(diferencaPaPr);;
        }
         else {
             semRefeicao3 = 0;
         }

        System.out.println(semRefeicao1+semRefeicao2+semRefeicao3);

        sc.close();
    }
}
