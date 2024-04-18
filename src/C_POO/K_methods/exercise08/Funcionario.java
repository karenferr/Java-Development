package C_POO.K_methods.exercise08;
// Crie uma classe Funcionário com os seguintes atributos: nome, idade, salario
// três salários devem ser guardados
// Crie dois métodos : 1. Para imprimir os dados 2. Para tirar a média dos salários e imprimir o resultado

public class Funcionario {
    public String nome;
    public int idade;
    public double[] salarios;

    public void imprime() {
        System.out.println(this.nome);
        System.out.println(this.idade);
        System.out.println(this.salarios);
    }
}
