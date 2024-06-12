package A_algorithms.beeCrowd;

import java.util.Scanner;

public class b2344 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int nota = sc.nextInt();
        if (nota>=0 && nota<=100){
        if (nota>=86) {
            System.out.println("A");
        }
        else if (nota>=61) {
            System.out.println("B");
        }
        else if (nota>=36) {
            System.out.println("C");
        }
        else if (nota>=1) {
            System.out.println("D");
        }
        else {
            System.out.println("E");
        }
        }

        sc.close();
    }
}
