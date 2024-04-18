package C_POO.B_hospital;

public class CalculadoraImc {

    IndiceMassaCorporal calcular(Paciente paciente) {

        IndiceMassaCorporal imc = new IndiceMassaCorporal(); // novo objeto imc da classe IndiceMassaCorporal
        imc.resultado = paciente.peso / (paciente.altura* paciente.altura);
        imc.peso = paciente.peso;
        imc.altura = paciente.altura;

        return imc;

    }
}
