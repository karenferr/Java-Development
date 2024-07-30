package beeCrowd;

import java.util.Scanner;

public class b2949 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int testes = sc.nextInt();
        char raca;

        int anoes = 0;
        int elfos = 0;
        int humanos = 0;
        int magos = 0;
        int hobbits = 0;
        for (int i = 0; i < testes; i++) {
            String nome = sc.next();
             raca = sc.next().charAt(0);
             if (raca=='A') {
                 anoes++;
             }
             else if (raca=='E') {
                 elfos++;
             }
             else if (raca=='H') {
                 humanos++;
             }
             else if (raca=='M') {
                 magos++;
             }
             else if (raca=='X') {
                 hobbits++;
             }
             else {
                 continue;
             }
        }
        System.out.println(hobbits + " Hobbit(s)");
        System.out.println(humanos + " Humano(s)");
        System.out.println(elfos + " Elfo(s)");
        System.out.println(anoes + " Anao(oes)");
        System.out.println(magos + " Mago(s)");

        sc.close();
    }
}
