package B_POO.A_CLASSES.EX2;

public class Main {
    public static void main(String[] args) {

        Livro fantasia = new Livro();
        fantasia.titulo = "Harry Potter";
        fantasia.autor = "J. K. Howling";
        fantasia.anoPublicacao = 1999;
        System.out.println("Titulo: "+ fantasia.titulo+" Autor: "+
                fantasia.autor+" Ano: "+ fantasia.anoPublicacao);

    }
}
