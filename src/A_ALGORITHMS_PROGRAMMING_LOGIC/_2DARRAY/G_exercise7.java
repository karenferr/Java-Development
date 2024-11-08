package A_ALGORITHMS_PROGRAMMING_LOGIC._2DARRAY;

import java.util.Scanner;

public class G_exercise7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int M = sc.nextInt(); //linhas
        int N = sc.nextInt(); //colunas
        int [][]x = new int [M][N];

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                x[i][j] = sc.nextInt();
            } 
        }
        
        int fila = sc.nextInt();

        fila = fila - 1; // como nossa matriz comeca na linha 0, vamos decrementar o valor da fila

        int ultimoDaFila = x[fila][N-1];

        for (int j=N-1; j>0; j--) {
            x[fila][j] = x[fila][j-1];
        }

        x[fila][0] = ultimoDaFila;

        for (int i=0; i<M; i++) {
            for (int j=0; j<N; j++) {
                System.out.print(x[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
