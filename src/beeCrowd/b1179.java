package beeCrowd;

import java.util.Scanner;

public class b1179 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] par = new int[5];
        int[] impar = new int[5];
        // Índices controlam a quantidade de elementos nos vetores
        int parIndex = 0;
        int imparIndex = 0;

        for (int i = 0; i < 15; i++) {
            int valor = sc.nextInt(); // Lê o número

            if (valor % 2 == 0) { // Se número for par
                par[parIndex] = valor; // Armazena no vetor de pares
                parIndex++; // Incrementa o índice de controle
                // Se o vetor de pares estiver cheio, imprime e reinicia
                if (parIndex == 5) {
                    for (int j = 0; j < 5; j++) {
                        System.out.println("par[" + j + "] = " + par[j]);
                    }
                    parIndex = 0; // Reinicia o índice para reutilizar o vetor
                }

            } else {
                impar[imparIndex] = valor;
                imparIndex++;

                if (imparIndex == 5) {
                    for (int j = 0; j < 5; j++) {
                        System.out.println("impar[" + j + "] = " + impar[j]);
                    }
                    imparIndex = 0;
                }
            }
        }

        // Após ler os 15 números, imprime os valores restantes
        // Imprime os ímpares e pares restantes
        for (int j = 0; j < imparIndex; j++) {
            System.out.println("impar[" + j + "] = " + impar[j]);
        }
        for (int j = 0; j < parIndex; j++) {
            System.out.println("par[" + j + "] = " + par[j]);
        }


        sc.close();
    }
}
