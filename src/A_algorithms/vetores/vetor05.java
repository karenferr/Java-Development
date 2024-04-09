package A_algorithms.vetores;

import java.util.Scanner; 

public class vetor05 { 

    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in); 
        
        int N = sc.nextInt(); // Lê um inteiro da entrada e armazena na variável N.
        int vet[] = new int[N]; // Declaração de um array de inteiros chamado vet com tamanho N.

        for (int i = 0; i < N; i++) { // Loop que itera N vezes.
            vet[i] = sc.nextInt(); // Lê um inteiro da entrada e armazena no array "vet" na posição i.
        }

        int soma = 0; // Inicialização da variável soma para calcular a soma dos números pares.
        int contagemPares = 0; // Inicialização da variável contagemPares para contar números pares.

        for (int i = 0; i < N; i++) { // Loop que itera N vezes.
            if (vet[i] % 2 == 0) { // Verifica se o número na posição i do array "vet" é par.
                soma = soma + vet[i]; // Adiciona o valor par à variável soma.
                contagemPares++; // Incrementa a contagem de números pares.
            }
        }
        double media = (double) soma / contagemPares; 
        System.out.println(media); 

        sc.close(); 
    }
}

