package A_algorithms.matrizes;

import java.util.Scanner;

public class J_matriz {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int numeroFilas = sc.nextInt(); 
		int qtdSoldados = sc.nextInt(); // Lê a quantidade de soldados em cada fila
		
		int[][] mat = new int[numeroFilas][qtdSoldados];
		
		// Leitura dos dados de entrada
		for (int linha=0; linha<numeroFilas; linha++) {
			for (int coluna=0; coluna<qtdSoldados; coluna++) {
				mat[linha][coluna] = sc.nextInt(); 
			}
		}

		int fila = sc.nextInt(); // Lê a fila que será modificada
		
		// Como nossa matriz começa na linha 0, vamos decrementar o valor da fila
		fila = fila - 1; 

		// Passo 1: Vamos salvar o último soldado da fila escolhida
		int ultimoDaFila = mat[fila][qtdSoldados-1];
		
		// Passo 2: Vamos mover todos os soldados da fila (menos o último) para a direita,
		// mas teremos que fazer isso da direita para a esquerda (contagem decrescente)
		for (int coluna=qtdSoldados-1; coluna>0; coluna--) {
			mat[fila][coluna] = mat[fila][coluna-1];
		}

		// Passo 3: Agora vamos colocar o último soldado na primeira posição da fila
		mat[fila][0] = ultimoDaFila;
	
		// Pronto! Agora vamos imprimir a matriz alterada:
		for (int linha=0; linha<numeroFilas; linha++) {
			for (int coluna=0; coluna<qtdSoldados; coluna++) {
				System.out.print(mat[linha][coluna] + " "); // Imprime cada valor da matriz
			}
			System.out.println(); // Pula para a próxima linha após imprimir todos os soldados de uma fila
		}
		
		sc.close(); 
	}
}
