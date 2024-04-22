package B_POO.B_hospital;

public class Principal {
    public static void main(String[] args) {
        CalculadoraImc calculadoraImc = new CalculadoraImc();

        Paciente karen = new Paciente();
        karen.peso = 175;
        karen.altura = 1.82;

        IndiceMassaCorporal imc = calculadoraImc.calcular(karen);

        if (imc.temObesidade()) {
            System.out.printf("Paciente com altura de %.2f e peso de %.2f " + "está com obesidade%n", imc.altura, imc.peso);
        }
        System.out.printf("IMC: %.2f%n", imc.resultado);
    }
}
