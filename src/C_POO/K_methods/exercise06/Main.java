package C_POO.K_methods.exercise06;

public class Main {
    public static void main(String[] args) {
        Estudante estudante1 = new Estudante();
        estudante1.nome = "Midoriya";
        estudante1.idade = 15;
        estudante1.sexo = 'M';

        Estudante estudante2 = new Estudante();
        estudante2.nome = "Sakura";
        estudante2.idade = 16;
        estudante2.sexo = 'F';

        estudante1.imprimir();
        estudante2.imprimir();
    }
}
