package B_POO.B_METHODS.A_METHODS;

public class Main {
    public static void main(String[] args) {

        Calculadora calculadora1 = new Calculadora();

        int soma = calculadora1.soma(1,3);
        System.out.println("Soma: " + soma);
        int subtracao = calculadora1.subtracao(10, 5);
        System.out.println("Subtração: " + subtracao);
        int multiplicacao = calculadora1.multiplicacao(10,10);
        System.out.println("Multiplicação: " + multiplicacao);
        double divisao = calculadora1.divisao(10,0);
        System.out.println("Raiz Quadrada: " + calculadora1.raizQuadrada(9));
        System.out.println("Resto da Divisão: " + calculadora1.restoDivisao(100, 50));
        System.out.println("Média: " + calculadora1.media(10,10,10));


    }
}
