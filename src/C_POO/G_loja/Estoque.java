package C_POO.G_loja;

public class Estoque {
    public static void main(String[] args) {

        Produto iPhone = new Produto();
        iPhone.nome = "iPhone 15";
        iPhone.marca = "Apple";
        iPhone.preco = 4999;
        iPhone.quantidadeEmEstoque = 100;

        Produto Macbook = new Produto();
        Macbook.nome = "Macbook M2";
        Macbook.marca = "Apple";
        Macbook.preco = 9999;
        Macbook.quantidadeEmEstoque = 50;

        System.out.printf("Produto: %s%n Marca: %s%n Preço: %.1f%n Quantidade: %d%n", iPhone.nome, iPhone.marca, iPhone.preco, iPhone.quantidadeEmEstoque);
        System.out.printf("Produto: %s%n Marca: %s%n Preço: %.1f%n Quantidade: %d%n", Macbook.nome, Macbook.marca, Macbook.preco, Macbook.quantidadeEmEstoque);
    }
}
