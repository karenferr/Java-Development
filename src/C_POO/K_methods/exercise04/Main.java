package C_POO.K_methods.exercise04;

public class Main {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int a = 1;
        int b = 2;
        calculadora.alteraDoisNumeros(a, b);
        System.out.println("Após o método: a = " + a + ", b = " + b);
    }
}
