package desafios.modulo02;

import java.util.Scanner;

public class desafio0223 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nome = sc.nextLine();
        double valorHora = sc.nextDouble();
        int horasTrabalhadas = sc.nextInt();
        double valorDescontos = sc.nextDouble();

        double total = valorHora * horasTrabalhadas;
        double totalDevido = total - valorDescontos;

        System.out.println("Folha de pagamento: " + nome);
        System.out.printf("%d horas x %.2f = %.2f%n", horasTrabalhadas, valorHora, total);
        System.out.println("Descontos: " + valorDescontos);
        System.out.printf("Total devido: %.2f", totalDevido);
        sc.close();
    }
}
