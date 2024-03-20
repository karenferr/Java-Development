package desafios.modulo05.desafio0525;

public class contratoTrabalho {
    Funcionario novoFuncionario;
    int horaNormal;
    int horaExtra;

    boolean possuiAdicionalParaFilhos() {
        return novoFuncionario.temFilhos();
    }

}
