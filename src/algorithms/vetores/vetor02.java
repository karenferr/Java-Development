package algorithms.vetores;

import java.util.Scanner;

public class vetor02 { 

    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in); 

        int N = sc.nextInt(); // Lê um inteiro da entrada e armazena na variável N.

        int vet[] = new int[N]; // Declaração de um array de inteiros com tamanho N.

        for (int i = 0; i < N; i++) { // Loop que itera N vezes.
            vet[i] = sc.nextInt(); // Lê um inteiro da entrada e armazena no array "vet" na posição i.
        }

        int contagemPares = 0; // Inicialização da variável contagemPares para contar números pares.

        for (int i = 0; i < N; i++) { // Loop que itera N vezes.
            if (vet[i] % 2 == 0) { // Verifica se o número na posição i do array "vet" é par.
                contagemPares++; // Incrementa a contagem de números pares.
                System.out.println(vet[i]); 
            }
        }
        System.out.println(contagemPares); 
        sc.close(); 
    }
}
