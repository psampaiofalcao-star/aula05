import java.util.Scanner;

public class ex10 {
    static int contarMovimentos(int discos) {
        if (discos == 0) {
            return 0;
        }
        return 2 * contarMovimentos(discos - 1) + 1;
    }

    static void hanoi(int n, char origem, char destino, char auxiliar) {
        if (n == 1) {
            System.out.println("Mover disco 1 de " + origem + " para " + destino);
            return;
        }
        hanoi(n - 1, origem, auxiliar, destino);
        System.out.println("Mover disco " + n + " de " + origem + " para " + destino);
        hanoi(n - 1, auxiliar, destino, origem);
    }

    static void main() {
        Scanner sc = new Scanner(System.in);
        int[] jogos = new int[3];

        for (int i = 0; i < jogos.length; i++) {
            System.out.println("Digite a quantidade de discos do jogo " + (i + 1) + ":");
            jogos[i] = sc.nextInt();
        }

        for (int i = 0; i < jogos.length; i++) {
            System.out.println("Jogo " + (i + 1) + ":");
            hanoi(jogos[i], 'A', 'C', 'B');
            System.out.println("Total: " + contarMovimentos(jogos[i]) + " movimentos");
        }
    }
}

