package B_POO.A_CLASSES.EX3;

public class Main {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno();
        aluno1.nome = "Karen";
        aluno1.curso = "Engenharia de Software";
        aluno1.matricula = 200029337;

        Aluno aluno2 = new Aluno();
        aluno2.nome = "Rafael";
        aluno2.curso = "Direito";
        aluno2.matricula = 000000001;

        System.out.println(aluno1.nome);
        System.out.println(aluno1.curso);
        System.out.println(aluno1.matricula);
        System.out.println("---------------");
        System.out.println(aluno2.nome);
        System.out.println(aluno2.curso);
        System.out.println(aluno2.matricula);
    }
}
