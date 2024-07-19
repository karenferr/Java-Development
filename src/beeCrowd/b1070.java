package beeCrowd;
import java.util.Scanner;

public class b1070 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int valor = sc.nextInt();

        if (valor % 2 == 0) {
            valor += 1;
            System.out.println(valor);
            valor += 2;
            System.out.println(valor);
            valor += 2;
            System.out.println(valor);
            valor += 2;
            System.out.println(valor);
            valor += 2;
            System.out.println(valor);
            valor += 2;
            System.out.println(valor);
        } else {
            System.out.println(valor);
            valor += 2;
            System.out.println(valor);
            valor += 2;
            System.out.println(valor);
            valor += 2;
            System.out.println(valor);
            valor += 2;
            System.out.println(valor);
            valor += 2;
            System.out.println(valor);
        }
        sc.close();
    }
}
