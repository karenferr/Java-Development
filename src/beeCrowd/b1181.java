package beeCrowd;

import java.util.Scanner;

public class b1181 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int L = sc.nextInt();  // Lê a linha a ser considerada
        char T = sc.next().charAt(0);  // Lê o caractere indicando a operação ('S' para Soma ou 'M' para Média)

        double[][] matriz = new double[12][12];  // Inicializa a matriz 12x12

        // Preenche a matriz com os valores fornecidos
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++) {
                matriz[i][j] = sc.nextDouble();
            }
        }

        double soma = 0.0;  // Inicializa a variável soma

        // Soma os valores da linha L
        for (int j = 0; j < 12; j++) {
            soma += matriz[L][j];
        }

        // Verifica se a operação é Soma ('S') ou Média ('M') e imprime o resultado
        if (T == 'S') {
            System.out.printf("%.1f%n", soma);  // Imprime a soma com uma casa decimal
        } else if (T == 'M') {
            double media = soma / 12.0;  // Calcula a média
            System.out.printf("%.1f%n", media);  // Imprime a média com uma casa decimal
        }

        sc.close();  // Fecha o scanner
    }
}

