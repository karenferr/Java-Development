package beeCrowd;
import java.util.Scanner;

public class b1150 {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt();
        int Z = sc.nextInt();

        while (Z<=X) {
            Z = sc.nextInt();
        }

        int soma = 0;
        int contador = 0;

        for (int i=X; soma<=Z; i++) {
            soma += i;
            contador++;
        }

        System.out.println(contador);

        sc.close();
    }
}
