package A_ALGORITHMS_PROGRAMMING_LOGIC.ARRAY;

import java.util.Scanner;

public class I_exercise9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        String[]mercadoria = new String [N];
        double []compra = new double[N];
        double []venda = new double[N];


        for (int i = 0; i < N; i++) {
            mercadoria[i] = sc.next();
            compra[i] = sc.nextDouble();
            venda[i] = sc.nextDouble();
        }

        int contagemLucroAbaixo10 = 0;
        int contagemLucroEntre10e20 = 0;
        int contagemLucroAcima20 = 0;
        for (int i = 0; i < N; i++) {
            if (venda[i]/compra[i]<1.1) {
                contagemLucroAbaixo10++;
            }
            else if (venda[i]/compra[i]>=1.1 && venda[i]/compra[i]<=1.2) {
                contagemLucroEntre10e20++;
            }
            else {
                contagemLucroAcima20++;
            }
        }
        System.out.println("Lucro abaixo de 10%: "+contagemLucroAbaixo10);
        System.out.println("Lucro entre 10% e 20%: "+contagemLucroEntre10e20);
        System.out.println("Lucro acima de 20%: "+contagemLucroAcima20);

        double somaCompra = 0;
        double somaVenda = 0;

        for (int i = 0; i < N; i++) {
            somaCompra += compra[i];
            somaVenda += venda[i];
        }
        System.out.println("Valor total de compra: "+somaCompra);
        System.out.println("Valor total de venda: "+somaVenda);

        double lucroTotal = somaVenda - somaCompra;
        System.out.println("Lucro total: "+lucroTotal);




                sc.close();
    }
}
