package beeCrowd;

import java.util.Scanner;

public class b2936 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int []porcoes = new int [5];
        for (int i = 0; i < porcoes.length; i++) {
            porcoes[i] = sc.nextInt();
        }
            int curupira = 300 * porcoes[0];
            int boitata = 1500 * porcoes[1];
            int boto = 600 * porcoes[2];
            int mapinguari = 1000 * porcoes[3];
            int lara = 150 * porcoes[4];
            int chica = 225;
        System.out.println(curupira+boitata+boto+mapinguari+lara+chica);
        sc.close();
    }
}
