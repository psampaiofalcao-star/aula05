public class ex8 {

    static boolean contem(int[] numeros, int valor) {
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == valor) {
                return true;
            }
        }
        return false;
    }

    static int[] sortear(int quantidade, int maximo) {
        int[] numeros = new int[quantidade];
        int preenchidos = 0;

        while (preenchidos < quantidade) {
            int sorteado = (int) (Math.random() * maximo) + 1;
            if (!contem(numeros, sorteado)) {
                numeros[preenchidos] = sorteado;
                preenchidos++;
            }
        }
        return numeros;
    }

    static void exibir(int[] numeros) {
        System.out.print("Números sorteados:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(" " + numeros[i]);
        }
        System.out.println();
    }

    static void main() {
        int[] numeros = sortear(6, 60);
        exibir(numeros);
    }
}

