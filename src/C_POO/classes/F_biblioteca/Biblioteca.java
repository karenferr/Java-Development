package C_POO.classes.F_biblioteca;

public class Biblioteca {
    public static void main(String[] args) {

        Livro novoLivro = new Livro();
        novoLivro.titulo = "Atomic Habits";
        novoLivro.autor = "Unknown";
        novoLivro.ano = 2017;

        Livro novoLivro2 = new Livro();
        novoLivro2.titulo = "Love";
        novoLivro2.autor = "God";
        novoLivro2.ano = 1;

        System.out.printf("Livro: %s%n Autor: %s%n Ano: %d%n", novoLivro.titulo, novoLivro.autor, novoLivro.ano);
        System.out.printf("Livro: %s%n Autor: %s%n Ano: %d%n", novoLivro2.titulo, novoLivro2.autor, novoLivro2.ano);

    }
}
