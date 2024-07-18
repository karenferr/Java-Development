package A_algorithms.beeCrowd;

import java.util.Scanner;

public class b1985 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int quantidadeProdutos = sc.nextInt();


        double soma = 0;

        if (quantidadeProdutos <= 5 && quantidadeProdutos >= 1) {
            for (int i = 0; i < quantidadeProdutos; i++) {
                int codigo = sc.nextInt();
                int quantidadeCadaProduto = sc.nextInt();

                if (quantidadeCadaProduto <= 500 && quantidadeCadaProduto >= 1) {
                    double preco;

                    if (codigo == 1001) {
                        preco = 1.50;
                    } else if (codigo == 1002) {
                        preco = 2.50;
                    } else if (codigo == 1003) {
                        preco = 3.50;
                    } else if (codigo == 1004) {
                        preco = 4.50;
                    } else if (codigo == 1005) {
                        preco = 5.50;
                    } else {
                        System.out.println("Código inválido");
                        continue;
                    }

                    soma += preco * quantidadeCadaProduto;
                }

                else {
                    System.out.println("Quantidade de cada produto inválida");
                }

            }
            System.out.printf("%.2f%n", soma);
        } else {
            System.out.println("Quantidade de produtos inválida");
        }

        sc.close();
    }
}
