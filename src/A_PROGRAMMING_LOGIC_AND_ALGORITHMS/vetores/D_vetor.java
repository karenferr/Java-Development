package A_PROGRAMMING_LOGIC_AND_ALGORITHMS.vetores;

import java.util.Scanner; 

public class D_vetor {

    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in); 

        int N = sc.nextInt(); // Lê um inteiro da entrada e armazena na variável N.
        double vet[] = new double[N]; // Declaração de um array de números em ponto flutuante (double) chamado vet com tamanho N.
        
        double soma = 0; // Inicialização da variável soma para calcular a soma dos valores do array.
        for (int i = 0; i < N; i++) { // Loop que itera N vezes.
            vet[i] = sc.nextDouble(); // Lê um número em ponto flutuante da entrada e armazena no array "vet" na posição i.
            soma = soma + vet[i]; // Adiciona o valor lido à variável soma.
        }
        
        double media = soma / N; // Calcula a média dos valores no array.
        System.out.println(media); // Imprime a média.
        
        for (int i = 0; i < N; i++) { // Loop que itera N vezes.
            if (vet[i] < media) { // Verifica se o valor na posição i do array "vet" é menor que a média.
                System.out.println(vet[i]); 
            }
        }
        
        sc.close(); 
    }
}

