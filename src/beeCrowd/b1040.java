package A_algorithms.estruturaCondicional;

import java.util.Scanner;

public class b1040 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float N1 = sc.nextFloat();
        float N2 = sc.nextFloat();
        float N3 = sc.nextFloat();
        float N4 = sc.nextFloat();
        float media;

        media = (N1 * 2 + N2 * 3 + N3 * 4 + N4 * 1) / 10.0f;

        if (media >= 7) {
            System.out.printf("Media: %.1f%n", media);
            System.out.println("Aluno aprovado.");
        } else if (media >= 5 && media <= 6.9) {
            System.out.printf("Media: %.1f%n", media);
            System.out.println("Aluno em exame.");
            float notaExame = sc.nextFloat();
            System.out.printf("Nota do exame: %.1f%n", notaExame);
            float mediaExame = (media + notaExame) / 2;
            if (mediaExame >= 5) {
                System.out.println("Aluno aprovado.");
                System.out.printf("Media final: %.1f%n", mediaExame);
            } else {
                System.out.println("Aluno reprovado.");
                System.out.printf("Media final: %.1f%n", mediaExame);
            }
        } else {
            System.out.printf("Media: %.1f%n", media);
            System.out.println("Aluno reprovado.");
        }

        sc.close();
    }
}
