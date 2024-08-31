package B_POO.A_CLASSES.EX5;

public class Main {
    public static void main(String[] args) {

        Filme filme1 = new Filme();
        filme1.titulo = "Barbie";
        filme1.diretor = "Greta Gerwig";
        filme1.ano = 2023;

        System.out.println(filme1.titulo);
        System.out.println("------------------");
        System.out.println(filme1.diretor);
        System.out.println("------------------");
        System.out.println(filme1.ano);
    }
}
