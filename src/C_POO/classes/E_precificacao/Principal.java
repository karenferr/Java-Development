package C_POO.classes.E_precificacao;

public class Principal {
    public static void main(String[] args) {

        Produto.custoEmbalagem = 10;
        Produto tenisNike = new Produto();
        tenisNike.alterarPrecoCusto(100);

        ServicoDePrecificacao servicoDePrecificacao = new ServicoDePrecificacao();
        servicoDePrecificacao.definirPrecoVenda(tenisNike, 20);

        System.out.printf("Preco de custo: %.2f%n", tenisNike.precoCusto);
        System.out.printf("Preco de venda: %.2f%n", tenisNike.precoVenda);
    }
}
