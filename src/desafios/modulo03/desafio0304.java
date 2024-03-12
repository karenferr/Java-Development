package desafios.modulo03;

import java.util.Scanner;

public class desafio0304 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ano: ");
        int ano = sc.nextInt();

        if (ano%400 ==0 || ano%4== 0 && ano%100 != 0) {
            System.out.println("Ano bissexto");
        }
        else {
            System.out.println("Ano não bissexto");
        }

        sc.close();
    }
}
