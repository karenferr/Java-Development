package B_POO.K_methods.exercise05;

public class Main {
    public static void main(String[] args) {
        Estudante estudante1 = new Estudante();
        estudante1.nome = "Victor";
        estudante1.idade = 20;
        estudante1.sexo = 'M';

        Estudante estudante2 = new Estudante();
        estudante2.nome = "Vitória";
        estudante2.idade = 16;
        estudante2.sexo = 'F';

        ImpressoraEstudante impressora = new ImpressoraEstudante();
        impressora.imprimirEstudante(estudante1);
        impressora.imprimirEstudante(estudante2);
    }
}
