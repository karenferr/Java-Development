package A_PROGRAMMING_LOGIC_AND_ALGORITHMS.vetores;

import java.util.Scanner; 

public class H_vetor {

    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in); 

        int N = sc.nextInt(); // Lê um número inteiro do usuário - quantidade de pessoas.

        String nome[] = new String[N]; // Declaração de um array de Strings para armazenar os nomes.
        int idade[] = new int[N]; // Declaração de um array de inteiros para armazenar as idades.

        for (int i = 0; i < N; i++) { // Loop para preencher os arrays com nomes e idades.
            nome[i] = sc.next(); // Lê o nome da pessoa e armazena no array.
            idade[i] = sc.nextInt(); // Lê a idade da pessoa e armazena no array.
        }

        int pessoaMaisVelha = 0; // Variável para armazenar o índice da pessoa mais velha, inicializada com 0.

        for (int i = 1; i < N; i++) { // Loop para encontrar a pessoa mais velha.
            if (idade[i] > idade[pessoaMaisVelha]) { // Verifica se a idade da pessoa atual é maior do que a pessoa mais velha atual.
                pessoaMaisVelha = i; // Atualiza o índice da pessoa mais velha se a condição for verdadeira.
            }
        }

        System.out.println("Pessoa mais velha: " + nome[pessoaMaisVelha]); 
        sc.close(); 
    }
}

