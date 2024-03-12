package modulo05.concessionaria1;

public class Principal {
    public static void main(String[] args) {
        Pessoa eu = new Pessoa(); // cria um novo objeto (eu) do tipo pessoa
        eu.nome = "Karen"; // objeto da classe Pessoa
        eu.cpf = "000.111.222-33";
        eu.anoNascimento = 1999;

        Carro meuCarro = new Carro (); //instanciando um novo carro atribuido a variavel meuCarro do tipo Carro
        meuCarro.anoFabricacao = 2021;
        meuCarro.cor = "Preto";
        meuCarro.fabricante = "Honda";
        meuCarro.modelo = "HR-V";
        meuCarro.precoCompra = 0;
        meuCarro.proprietario = eu;

        System.out.println("Meu Carro:");
        System.out.printf("Modelo: %s%n", meuCarro.modelo);
        System.out.printf("Ano: %d%n", meuCarro.anoFabricacao);
        System.out.printf("Proprietário: %s%n", meuCarro.proprietario.nome);
        meuCarro.imprimirResumoDepreciacao();
        meuCarro.calcularIpva();

        System.out.println();

        Pessoa voce = new Pessoa();
        voce.nome = "Ane";
        voce.cpf = "111.222.333-44";
        voce.anoNascimento = 2022;

        Carro seuCarro = new Carro();
        seuCarro.anoFabricacao = 2022;
        seuCarro.cor = "Branco";
        seuCarro.fabricante = "BMW";
        seuCarro.modelo = "X6";
        seuCarro.precoCompra = 980000;
        seuCarro.proprietario = voce;

        System.out.println("Seu Carro:");
        System.out.printf("Modelo: %s%n", seuCarro.modelo);
        System.out.printf("Ano: %d%n", seuCarro.anoFabricacao);
        System.out.printf("Proprietário: %s%n", seuCarro.proprietario.nome);
        seuCarro.imprimirResumoDepreciacao();
        seuCarro.calcularIpva();
}
}