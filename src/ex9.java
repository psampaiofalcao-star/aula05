import java.util.Scanner;

public class ex9 {
    static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    static int somar(int[] termos) {
        int soma = 0;
        for (int i = 0; i < termos.length; i++) {
            soma += termos[i];
        }
        return soma;
    }

    static void exibir(int[] termos) {
        for (int i = 0; i < termos.length; i++) {
            System.out.print(termos[i] + " ");
        }
        System.out.println();
    }

    static void main() {
        Scanner sc = new Scanner(System.in);
        int n;

        do {
            System.out.println("Digite N (de 1 a 30):");
            n = sc.nextInt();
        } while (n < 1 || n > 30);

        int[] termos = new int[n];
        for (int i = 0; i < termos.length; i++) {
            termos[i] = fibonacci(i);
        }

        exibir(termos);
        System.out.println("Soma: " + somar(termos));
    }
}

