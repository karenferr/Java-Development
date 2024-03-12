package desafios.modulo05.desafio0507;

public class Principal {
    public static void main(String[] args) {

        Cachorro cachorro1 = new Cachorro();
        cachorro1.nome = "Theo";
        cachorro1.raca = "Shih-tzu";
        cachorro1.sexo = 'M';
        cachorro1.idade = 10;

        Cachorro cachorro2 = new Cachorro();
        cachorro2.nome = "Amora";
        cachorro2.raca = "Shih-tzu";
        cachorro2.sexo = 'F';
        cachorro2.idade = 3;

        System.out.printf(" Nome: %s%n Raça: %s%n Sexo: %s%n Idade: %d%n",
                cachorro1.nome, cachorro1.raca,cachorro1.sexo, cachorro1.idade);
        System.out.println("----------");
        System.out.printf(" Nome: %s%n Raça: %s%n Sexo: %s%n Idade: %d%n",
                cachorro2.nome, cachorro2.raca,cachorro2.sexo, cachorro2.idade);
    }
}
