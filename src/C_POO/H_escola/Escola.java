package C_POO.H_escola;

public class Escola {
    public static void main(String[] args) {

        Aluno karen = new Aluno();
        karen.nome = "Karen";
        karen.matricula = 200029337;
        karen.semestre = 3;
        karen.media = 10.0;

        Aluno rafael = new Aluno();
        rafael.nome = "Rafael";
        rafael.matricula = 200029030;
        rafael.semestre = 3;
        rafael.media = 10.0;

        System.out.printf("Nome: %s%n Matrícula: %d%n Semestre: %d%n Média: %.1f%n", karen.nome, karen.matricula, karen.semestre, karen.media);
        System.out.printf("Nome: %s%n Matrícula: %d%n Semestre: %d%n Média: %.1f%n", rafael.nome, rafael.matricula, rafael.semestre, rafael.media);
    }
}
