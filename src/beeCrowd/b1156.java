package beeCrowd;

public class b1156 {
    public static void main(String[] args) {

        double S = 1; // Começamos com o primeiro termo da série, que é 1/1
        int numerator = 3; // O segundo numerador começa em 3
        double denominator = 2; // O denominador começa em 2, que é 2^1


        while (numerator <= 39) {
            S += numerator / denominator;  // Adiciona o termo atual à soma S
            numerator += 2;                // Incrementa o numerador por 2
            denominator *= 2;              // Dobra o valor do denominador
        }

        System.out.printf("%.2f%n", S);
    }
}

