package B_POO.B_METHODS.A_METHODS;

public class Calculadora {

    public int soma (int a, int b) {
        return a + b;
    }
    public int subtracao (int a, int b) {
        return a - b;
    }
    public int multiplicacao (int a, int b) {
        return a * b;
    }
    public double divisao (int a, int b) {
        if (b!=0) {
            return (double) a/b;
        } else {
            System.out.println("Erro: divisão por 0");
            return 0;
        }
    }
    public double raizQuadrada (int numero) {
        return Math.sqrt(numero);
    }
    public double restoDivisao(int num1, int num2) {
        return num1 % num2;
    }
    public double media(int a, int b, int c) {
        return (double) (a+b+c)/3;
    }

}
