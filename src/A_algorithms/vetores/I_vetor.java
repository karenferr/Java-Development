
package A_algorithms.vetores;
import java.util.Scanner;
public class I_vetor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        // Declare arrays para armazenar nomes, valores de compra e valores de venda
        String vetNomes[] = new String[N];
        Double vetCompras[] = new Double[N];
        Double vetVendas[] = new Double[N];

        // Declare variáveis para contagem de diferentes categorias de lucro
        int contLucroAbaixo10 = 0;
        int contLucro10ate20 = 0;
        int contLucroMaior20 = 0;

        // Inicialize variáveis para soma dos valores totais de compra e venda
        double somaValorTotalCompras = 0;
        double somaValorTotalVendas = 0;

        // Loop para ler dados de N registros
        for (int i = 0; i < N; i++) {
            vetNomes[i] = sc.next();
            vetCompras[i] = sc.nextDouble();
            vetVendas[i] = sc.nextDouble();

            double porcentagemLucro = (vetVendas[i] - vetCompras[i]) / vetCompras[i] * 100;

            if (porcentagemLucro < 10) {
                contLucroAbaixo10++;
            } else if (10 <= porcentagemLucro && porcentagemLucro <= 20) {
                contLucro10ate20++;
            } else {
                contLucroMaior20++;
            }

            somaValorTotalCompras = somaValorTotalCompras + vetCompras[i];
            somaValorTotalVendas = somaValorTotalVendas + vetVendas[i];
        }

        double lucroTotal = somaValorTotalVendas - somaValorTotalCompras;

        System.out.println("Lucro abaixo de 10%: " + contLucroAbaixo10);
        System.out.println("Lucro entre 10% e 20%: " + contLucro10ate20);
        System.out.println("Lucro acima de 20%: " + contLucroMaior20);
        System.out.println("Valor total de compra: " + somaValorTotalCompras);
        System.out.println("Valor total de venda: " + somaValorTotalVendas);
        System.out.println("Lucro total: " + lucroTotal);
        sc.close();
    }
}
