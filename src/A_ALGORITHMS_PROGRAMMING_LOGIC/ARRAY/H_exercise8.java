package A_ALGORITHMS_PROGRAMMING_LOGIC.ARRAY;

import java.util.Scanner;

public class H_exercise8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        double[] altura = new double[N];
        char [] sexo = new char [N];


        for (int i = 0; i < N; i++) {
            altura[i] = sc.nextDouble();
            sexo[i] = sc.next().charAt(0);
        }

        double menorAltura = altura[0];
        for (int i = 0; i < N; i++) {
            if (altura[i]<menorAltura) {
                menorAltura = altura[i];
            }
        }
        System.out.println("Menor altura = "+menorAltura);

        double maiorAltura = altura[0];
        for (int i = 0; i < N; i++) {
            if (altura[i]>maiorAltura) {
                maiorAltura = altura[i];
            }
        }
        System.out.println("Menor altura = "+maiorAltura);

        int numeroMulheres = 0;
        double soma = 0;
        for (int i = 0; i < N; i++) {
            if (sexo[i]=='F') {
                soma += altura[i];
                numeroMulheres++;
            }
        }
        double mediaAlturaMulheres = soma / numeroMulheres;
        System.out.printf("Média das alturas das mulheres = %.2f%n", mediaAlturaMulheres);


        int numeroHomens = 0;
        for (int i = 0; i < N; i++) {
            if (sexo[i]=='M') {
                numeroHomens++;
            }
        }
        System.out.println("Numero de homens = "+numeroHomens);
        sc.close();
    }
}
