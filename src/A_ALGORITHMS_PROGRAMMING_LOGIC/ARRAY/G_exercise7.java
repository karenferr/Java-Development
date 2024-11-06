package A_ALGORITHMS_PROGRAMMING_LOGIC.ARRAY;


import java.util.Scanner;

public class G_exercise7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        String []nome = new String [N];
        double []nota1 = new double[N];
        double []nota2 = new double[N];

        for (int i = 0; i < N; i++) {
            nome[i] = sc.next();
            nota1[i] = sc.nextDouble();
            nota2[i] = sc.nextDouble();
        }

        System.out.println("Alunos aprovados:");


        for (int i = 0; i < N; i++) {
            double soma = 0;
            soma += nota1[i] + nota2[i];

            double media = soma / 2;

            if (media >= 6) {
                System.out.println(nome[i]);
            }
        }
        sc.close();
    }
}
