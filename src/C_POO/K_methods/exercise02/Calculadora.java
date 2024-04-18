package C_POO.K_methods.exercise02;

public class Calculadora {
    public void divideDoisNumeros(int num1, int num2) {
        if (num2 == 0) {
            System.out.println("Erro: Divisão por zero.");
        } else {
            int resultado = num1 / num2;
            System.out.println("O resultado da divisão é: " + resultado);
        }
    }
}
