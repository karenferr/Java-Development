package beeCrowd;

import java.util.Scanner;

public class b1864 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String frase = "LIFE IS NOT A PROBLEM TO BE SOLVED BUT A REALITY TO BE EXPERIENCED";

        int N = sc.nextInt();

        String result = frase.substring(0,N);

        System.out.println(result);
        sc.close();
    }

}
