
package A_algorithms.vetores;
import java.util.Locale;
import java.util.Scanner;

public class G_vetor {


    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        // Declare arrays para armazenar as alturas e os sexos dos indivíduos
        double altura[] = new double[N];
        char sexo[] = new char[N];

        // Loop para ler dados de N indivíduos
        for (int i = 0; i < N; i++) {
            altura[i] = sc.nextDouble();
            sexo[i] = sc.next().charAt(0);
        }

        // Encontre a menor altura entre as alturas lidas
        double menorAltura = altura[0];
        for (int i = 1; i < N; i++) {
            if (altura[i] < menorAltura) {
                menorAltura = altura[i];
            }
        }

        // Encontre a maior altura entre as alturas lidas
        double maiorAltura = altura[0];
        for (int i = 1; i < N; i++) {
            if (altura[i] > maiorAltura) {
                maiorAltura = altura[i];
            }
        }

        // Inicialize variáveis para contagem e soma das alturas das mulheres
        int contagemMulheres = 0;
        double somaAlturaMulheres = 0;

        // Loop para calcular a soma das alturas das mulheres e contar o número de mulheres
        for (int i = 0; i < N; i++) {
            if (sexo[i] == 'F') {
                somaAlturaMulheres = somaAlturaMulheres + altura[i];
                contagemMulheres++;
            }
        }

        // Calcule a média das alturas das mulheres
        double mediaAlturaMulheres = somaAlturaMulheres / contagemMulheres;

        // Inicialize variável para contar o número de homens
        int contagemNumeroHomens = 0;

        // Loop para contar o número de homens
        for (int i = 0; i < N; i++) {
            if (sexo[i] == 'M') {
                contagemNumeroHomens++;
            }
        }

        System.out.printf("Menor altura = %.2f%n", menorAltura);
        System.out.printf("Maior altura = %.2f%n", maiorAltura);

        if (contagemMulheres == 0) {
            System.out.println("Não há mulheres");
        } else {
            System.out.printf("Média das alturas das mulheres = %.2f%n", mediaAlturaMulheres);
        }

        System.out.println("Número de homens = " + contagemNumeroHomens);
        
        sc.close();
    }
}
