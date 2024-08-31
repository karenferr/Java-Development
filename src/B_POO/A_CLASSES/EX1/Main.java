package B_POO.A_CLASSES.EX1;

public class Main {
    public static void main(String[] args) {

        Carro carro1 = new Carro();
        carro1.marca = "Toyota";
        carro1.modelo = "Corolla";
        carro1.ano = 2024;
        System.out.println("Marca: "+carro1.marca+" Modelo: "+carro1.modelo+" Ano: "+carro1.ano);

        Carro carro2 = new Carro();
        carro2.marca = "Hyundai";
        carro2.modelo = "HB20";
        carro2.ano = 2024;
        System.out.println("Marca: "+carro2.marca+" Modelo: "+carro2.modelo+" Ano: "+carro2.ano);

    }
}
