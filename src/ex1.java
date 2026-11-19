import java.util.Scanner;


public class ex1 {

    static int contarDigitos(int numero) {
        int quantidade = 0;
        while (numero > 0) {
            numero = numero / 10;
            quantidade++;
        }
        return quantidade;
    }

    static void exibirDigitos(int[] numeros) {
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i] + " tem " + contarDigitos(numeros[i]) + " dígito(s)");
        }
    }

    static void main() {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[5];

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Digite o número " + (i + 1) + ":");
            numeros[i] = sc.nextInt();
        }

        exibirDigitos(numeros);

        {


            }
        }}