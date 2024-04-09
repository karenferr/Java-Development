package C_POO.classes.A_concessionaria;

public class Carro {
    String fabricante;
    String modelo;
    String cor;
    int anoFabricacao;
    double precoCompra;
    Pessoa proprietario; //lê-se: carro tem um proprietario do tipo pessoa

    void imprimirResumoDepreciacao() {
        double valorRevendaMeuCarro = calcularValorRevenda();
        int tempoDeUsoMeuCarro = calcularTempodeUsoEmAnos();

        if (precoCompra <= 0) {
            System.out.println("Carro com preço de compra zerado. " +
                    "Não foi possível imprimir resumo de depreciação");
            return; // saiu do método e não executou as instruções de saída abaixo
        }
        System.out.printf("Tempo de uso (anos): %d%n", tempoDeUsoMeuCarro);
        System.out.printf("Valor de Revenda: %6.2f%n", valorRevendaMeuCarro);
    }

    double calcularIpva() {
        int tempoDeUsoEmAnos = calcularTempodeUsoEmAnos();

        if (tempoDeUsoEmAnos >= 10) {
            return 0;
        }
        return calcularValorRevenda() * 0.04;
    }

    int calcularTempodeUsoEmAnos() {
        return 2022 - anoFabricacao;
    }

    double calcularValorRevenda() {
        int tempoDeUsoEmAnos = 2022 - anoFabricacao;
        int vidaUtilEmAnos = 20;

        double valorRevenda = (precoCompra / vidaUtilEmAnos) * (vidaUtilEmAnos - tempoDeUsoEmAnos);

        if (valorRevenda < 0) {
            valorRevenda = 0;
        }
        //void: metodo sem retorno
        return valorRevenda;
    }
}

