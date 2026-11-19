import java.util.Scanner;

public class ex4 {
    static double calcularImc(double peso, double altura) {
        return peso / (altura * altura);
    }

    static String classificarImc(double imc) {
        if (imc < 18.5) {
            return "Abaixo do peso";
        } else if (imc < 25) {
            return "Peso normal";
        } else if (imc < 30) {
            return "Sobrepeso";
        } else {
            return "Obesidade";
        }
    }

    static void exibirRelatorio(double[] pesos, double[] alturas) {
        for (int i = 0; i < pesos.length; i++) {
            double imc = calcularImc(pesos[i], alturas[i]);
            System.out.printf("Pessoa %d: IMC %.2f - %s\n", i + 1, imc, classificarImc(imc));
        }
    }

    static void main() {
        Scanner sc = new Scanner(System.in);
        double[] pesos = new double[4];
        double[] alturas = new double[4];

        for (int i = 0; i < pesos.length; i++) {
            System.out.println("Digite o peso da pessoa " + (i + 1) + ":");
            pesos[i] = sc.nextDouble();
            System.out.println("Digite a altura da pessoa " + (i + 1) + ":");
            alturas[i] = sc.nextDouble();
        }

        exibirRelatorio(pesos, alturas);
    }
}

