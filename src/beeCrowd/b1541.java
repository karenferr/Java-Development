package beeCrowd;

import java.util.Scanner;

public class b1541 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            int C = sc.nextInt();

            if (A == 0 || B == 0 || C == 0) {
                break;
            }

            int areaCasa = A * B; // area casa
            double areaMinima = areaCasa * 100.0 / C; // area minima do terreno com base no percentual
            int ladoTerreno = (int) Math.sqrt(areaMinima); // lado do terreno quadrado

            System.out.println(ladoTerreno);


        }

        sc.close();
    }
}
