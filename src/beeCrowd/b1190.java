package beeCrowd;

import java.util.Scanner;

public class b1190 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        char O = sc.next().charAt(0); // Operação: Soma ou Média
        double[][] matriz = new double[12][12]; // Declaração e instância da matriz 12x12

        // Leitura dos elementos da matriz
        for (int linha = 0; linha < 12; linha++) {
            for (int coluna = 0; coluna < 12; coluna++) {
                matriz[linha][coluna] = sc.nextDouble();
            }
        }

        double soma = 0;
        int contador = 0;

        // Percorre a área direita da matriz
        for (int linha = 0; linha < 12; linha++) {
            for (int coluna = 0; coluna < 12; coluna++) {
                if (linha < coluna && coluna > 11 - linha) { // Condições para a área direita
                    soma += matriz[linha][coluna];
                    contador++;
                }
            }
        }

        double media = soma / contador;
        if (O == 'M') {
            System.out.printf("%.1f%n", media);
        }
        else {
        System.out.printf("%.1f%n", soma);}

        sc.close();
    }
}
