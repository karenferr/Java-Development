package A_PROGRAMMING_LOGIC_AND_ALGORITHMS.vetores;

import java.util.Scanner; 

public class C_vetor {

    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in); 

        int N = sc.nextInt(); // Lê um inteiro da entrada e armazena na variável N.
        int vetA[] = new int[N]; // Declaração de um array de inteiros chamado vetA com tamanho N.
        int vetB[] = new int[N]; // Declaração de um array de inteiros chamado vetB com tamanho N.
        int vetC[] = new int[N]; // Declaração de um array de inteiros chamado vetC com tamanho N.

        for (int i = 0; i < N; i++) { // Loop que itera N vezes.
            vetA[i] = sc.nextInt();  // Lê um inteiro da entrada e armazena no array "vetA" na posição i.
        }
        for (int i = 0; i < N; i++) { // Loop que itera N vezes.
            vetB[i] = sc.nextInt();  // Lê um inteiro da entrada e armazena no array "vetB" na posição i.
        }
        for (int i = 0; i < N; i++) { // Loop que itera N vezes.
            vetC[i] = vetA[i] + vetB[i];  
            System.out.println(vetC[i]); 
        }
        
        sc.close(); 
    }
}

