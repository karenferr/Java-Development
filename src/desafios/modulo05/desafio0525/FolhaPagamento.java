package desafios.modulo05.desafio0525;

public class FolhaPagamento {

    double calcularSalario(int horasNormais, int horasExtras, double valorNormal, double valorExtra) {
        double salarioNormal = horasNormais * valorNormal;
        double salarioExtra = horasExtras * valorExtra;

        double salarioTotal = salarioNormal + salarioExtra;

        if (contratoTrabalho.temAdicionalParaFilhos()) {
            salarioTotal *= 1.10;
        }
        return salarioTotal;
    }
}
