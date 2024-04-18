package C_POO.K_methods.exercise03;

public class Calculadora {
    public double divideDoisNumeros(int num1, int num2) {
        if (num2 == 0) {
            return 0; // Evita divisão por zero.
        }
        return (double) num1 / num2;
    }
}
