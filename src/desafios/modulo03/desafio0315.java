package desafios.modulo03;

import java.util.Scanner;

public class desafio0315 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Valor do empréstimo: ");
        double valorEmprestimo = sc.nextDouble();

        System.out.print("Quantidade de parcelas: ");
        int quantidadeParcelas = sc.nextInt();

        if (valorEmprestimo>0 && quantidadeParcelas>=1) {
            double taxaJuros;
            switch (quantidadeParcelas) {
                case 1:
                case 2:
                    taxaJuros = 1.99;
                    break;
                case 3:
                    taxaJuros = 2.99;
                    break;
                default:
                    taxaJuros = 3.99;
                    break;
            }

            double tarifaFixa = (valorEmprestimo >= 100) ? 1.50 : 0;
            double totalJuros = valorEmprestimo * (taxaJuros / 100 * quantidadeParcelas);
            double custoTotal = valorEmprestimo + tarifaFixa + totalJuros;

            System.out.printf("Tarifa fixa: R$%.2f%n", tarifaFixa);
            System.out.printf("Total de juros: R$%.2f%n", totalJuros);
            System.out.printf("Custo total: R$%.2f%n", custoTotal);
        }
        else {
            System.out.println("Erro: O valor do empréstimo deve ser positivo e a quantidade de parcelas deve ser pelo menos 1.");
        }


        sc.close();
    }
}
