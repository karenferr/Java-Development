package algorithms.estruturaCondicional;

import java.util.Scanner;

public class b1045 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();
        sc.close();

        // Verifica o maior lado
        double maior = A;
        if (B > maior) {
            maior = B;
        }
        if (C > maior) {
            maior = C;
        }

        // Verifica o tipo de triângulo
        if (maior >= A + B + C - maior) {
            System.out.println("NAO FORMA TRIANGULO");
        } else {
            if (A * A == B * B + C * C || B * B == A * A + C * C || C * C == A * A + B * B) {
                System.out.println("TRIANGULO RETANGULO");
            } else if (A * A > B * B + C * C || B * B > A * A + C * C || C * C > A * A + B * B) {
                System.out.println("TRIANGULO OBTUSANGULO");
            } else {
                System.out.println("TRIANGULO ACUTANGULO");
            }

            if (A == B && B == C) {
                System.out.println("TRIANGULO EQUILATERO");
            } else if (A == B || A == C || B == C) {
                System.out.println("TRIANGULO ISOSCELES");
            }
        }
    }
}
