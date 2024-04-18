package C_POO.B_hospital;

public class IndiceMassaCorporal {
    double resultado;
    double peso;
    double altura;

    boolean temObesidade() {
        return resultado >= 30;
    }

    boolean taAbaixoDoPesoIdeal () {
        return resultado < 18.5;
    }
}
