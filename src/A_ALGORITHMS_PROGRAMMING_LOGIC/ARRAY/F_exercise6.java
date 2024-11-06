package A_ALGORITHMS_PROGRAMMING_LOGIC.ARRAY;

import java.util.Scanner;

public class F_exercise6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        String []arrayNome = new String [N];
        int []arrayIdade = new int [N];

        for (int i = 0; i < N; i++) {
            arrayNome[i] = sc.next();
            arrayIdade[i] = sc.nextInt();
        }

        int maisVelhoIdade = arrayIdade[0];
        String maisVelhoNome = null;
        for (int i = 0; i < N; i++) {
            if (arrayIdade[i]> maisVelhoIdade) {
                maisVelhoIdade = arrayIdade[i];
                maisVelhoNome = arrayNome[i];
            }
        }
        System.out.println("Pessoa mais velha: "+maisVelhoNome);
        sc.close();
    }
}
