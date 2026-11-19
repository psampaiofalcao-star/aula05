import java.util.Scanner;

public class ex3 {
    static boolean ehPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    static void exibirPrimos(int[] numeros) {
        System.out.print("Primos:");
        for (int i = 0; i < numeros.length; i++) {
            if (ehPrimo(numeros[i])) {
                System.out.print(" " + numeros[i]);
            }
        }
        System.out.println();
    }

    static void main() {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[8];

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Digite o número " + (i + 1) + ":");
            numeros[i] = sc.nextInt();
        }

        exibirPrimos(numeros);
    }
}

