package beeCrowd;

import java.util.Scanner;

public class b1145 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt();
        int Y = sc.nextInt();

        int contador = 0;
        for (int i = 1; i <= Y; i++) {

            System.out.print(i);
            contador++;

            if (contador == X) {
                // Se contador = X, quebra a linha e reseta o contador
                System.out.println();
                contador = 0;
            }
            else {
                // Coloca espaço apenas se não for o último elemento da linha
                System.out.print(" ");
            }
        }
        sc.close();
    }
}
