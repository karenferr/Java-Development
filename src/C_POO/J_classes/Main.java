package C_POO.J_classes;

public class Main {
    public static void main(String[] args) {
        Carro fusca = new Carro();
        fusca.nome = "Fusca";
        fusca.modelo = "Esporte";
        fusca.ano = 1969;

        Carro mustang = new Carro();
        mustang.nome = "Mustang";
        mustang.modelo = "GT 500";
        mustang.ano = 1968;

        System.out.println("Carro 1: " + fusca.nome + ", " + fusca.modelo + ", " + fusca.ano);
        System.out.println("Carro 2: " + mustang.nome + ", " + mustang.modelo + ", " + mustang.ano);
    }
}
