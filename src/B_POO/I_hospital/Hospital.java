package B_POO.I_hospital;

public class Hospital {
    public static void main(String[] args) {

        Paciente paciente1 = new Paciente();
        paciente1.nome = "Karen";
        paciente1.numero = 10000;
        paciente1.tipoSanguineo = "A+";
        paciente1.saude = "Saudável";

        Paciente paciente2 = new Paciente();
        paciente2.nome = "Liliane";
        paciente2.numero = 500;
        paciente2.tipoSanguineo = "A+";
        paciente2.saude = "Saudável";

        System.out.printf("Nome paciente: %s%n Número: %d%n Tipo Sanguíneo: %s%n Saúde: %s%n",
                paciente2.nome, paciente2.numero, paciente2.tipoSanguineo, paciente2.saude);
        System.out.printf("Nome paciente: %s%n Número: %d%n Tipo Sanguíneo: %s%n Saúde: %s%n",
                paciente2.nome, paciente2.numero, paciente2.tipoSanguineo, paciente2.saude);


    }
}
