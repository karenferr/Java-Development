package beeCrowd;

import java.util.Scanner;

public class b2009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int tipoCha = sc.nextInt();
        int resposta = 0;

        int soma = 0;
        for (int i = 0; i < 5; i++) {
             resposta = sc.nextInt();

            if (tipoCha == resposta) {
                soma++;
            }
        }

        System.out.println(soma);

        sc.close();
    }
}
