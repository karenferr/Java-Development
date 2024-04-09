package C_POO.classes.B_hospital;

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
