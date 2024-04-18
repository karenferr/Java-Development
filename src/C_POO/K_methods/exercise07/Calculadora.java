package C_POO.K_methods.exercise07;

public class Calculadora {
    public void somar(int... numeros) {
        int soma = 0;
        for (int num : numeros) {
            soma += num;
        }
        System.out.println("Soma: " + soma);
    }
}
