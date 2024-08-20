package beeCrowd;

import java.util.Scanner;

public class b1175 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] N = new int[20];

        for (int i = 0; i < N.length; i++) {
            N[i] = sc.nextInt();
        }

        for (int i = 0; i<10; i++) {
            int vetor = N[i]; // Armazena o valor do elemento N[i] em uma variável temporária vetor
            N[i] = N[19 - i]; // Substitui o valor de N[i] pelo valor correspondente na posição oposta, que é N[19 - i]
            N[19 - i] = vetor; // substitui o valor de N[19 - i] (ou seja, o valor do elemento na posição oposta) pelo valor armazenado na variável vetor
        }

        for (int i = 0; i < 20; i++) {
            System.out.println("N[" + i + "] = " + N[i]);
        }

        sc.close();
    }
}
