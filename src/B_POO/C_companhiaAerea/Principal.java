package B_POO.C_companhiaAerea;

public class Principal {
    public static void main(String[] args) {
        Aeronave aviaoGol = new Aeronave();
        aviaoGol.totalAssentos = 100;

        aviaoGol.desativar();
        aviaoGol.ativar();

        aviaoGol.reservarAssentos(10);

        System.out.printf("GOL (%S): %d assentos disponíveis%n",
                aviaoGol.ativo ? "Ativo" : "Inativo",
                aviaoGol.calcularAssentosDisponiveis());

        Aeronave aviaoLATAM = new Aeronave();
        aviaoLATAM.totalAssentos = 120;

        aviaoLATAM.reservarAssentos(5);

        System.out.printf("LATAM (%S): %d assentos disponíveis%n",
                aviaoLATAM.ativo ? "Ativo" : "Inativo",
                aviaoLATAM.calcularAssentosDisponiveis());
    }
}
