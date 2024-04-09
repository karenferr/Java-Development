package C_POO.classes.E_precificacao;

public class ServicoDePrecificacao {
    void definirPrecoVenda(Produto produto, double percentualMargemLucro) {

        double precoVendaCalculado = Matematica.calcularAcrescimo(produto.precoCusto, percentualMargemLucro);

        precoVendaCalculado += Produto.custoEmbalagem;

        produto.precoVenda = precoVendaCalculado;
    }
}
