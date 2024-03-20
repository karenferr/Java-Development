
package algorithms.vetores;


import java.util.Scanner;


public class vetor07 {

    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        // Consuma o caractere de nova linha deixado no buffer de entrada
        sc.nextLine();

        // Declare arrays para armazenar os nomes dos estudantes, a primeira nota e a segunda nota
        String nomes[] = new String[N];
        Double nota1[] = new Double[N];
        Double nota2[] = new Double[N];

        // Loop para ler dados de N estudantes
        for (int i = 0; i < N; i++) {
            nomes[i] = sc.next();
            nota1[i] = sc.nextDouble();
            nota2[i] = sc.nextDouble();
        }

   
        System.out.println("Alunos aprovados:");
        for (int i = 0; i < N; i++) {
            // Calcule a média das duas notas para o estudante atual
            double media = (nota1[i] + nota2[i]) / 2;
            // Verifique se a média do estudante é maior ou igual a 6
            if (media >= 6) {
                // Imprima o nome do estudante se ele for aprovado
                System.out.println(nomes[i]);
            }
        }

        sc.close();
    }
}

