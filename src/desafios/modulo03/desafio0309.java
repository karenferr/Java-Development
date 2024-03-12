package desafios.modulo03;

import java.util.Scanner;

public class desafio0309 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Peso:");
        double peso = sc.nextDouble();

        System.out.println("Altura:");
        double altura = sc.nextDouble();

        System.out.println("Sexo:");
        char sexo = sc.next().toUpperCase().charAt(0);

        double imc = peso / (altura * altura);

        if (imc<19.1 && sexo=='F') {
            System.out.println("Abaixo do peso");
        }
        else if (imc<25.8 && sexo=='F') {
            System.out.println("No peso ideal");
        }
        else if (imc<27.3 && sexo=='F') {
            System.out.println("Um pouco acima do peso");
        }
        else if (imc<32.3 && sexo=='F') {
            System.out.println("Acima do peso ideal");
        }
        else if (imc>32.3 && sexo=='F') {
            System.out.println("Obeso");
        }
        else if (imc<20.7 && sexo=='M') {
            System.out.println("Abaixo do peso");
        }
        else if (imc<26.4 && sexo=='M') {
            System.out.println("No peso ideal");
        }
        else if (imc<27.8 && sexo=='M') {
            System.out.println("Um pouco acima do peso");
        }
        else if (imc<31.1 && sexo=='M') {
            System.out.println("Acima do peso ideal ");
        }
        else if (imc>31.1 && sexo=='M') {
            System.out.println("Obeso");
        }
        sc.close();
    }
}
