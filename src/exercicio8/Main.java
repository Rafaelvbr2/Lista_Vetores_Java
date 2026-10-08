package exercicio8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Quantidade de vendas da filial 1: ");
        int n1 = entrada.nextInt();
        System.out.print("Quantidade de vendas da filial 2: ");
        int n2 = entrada.nextInt();
        if (n1 < 0 || n2 < 0) {
            System.out.println("As quantidades nao podem ser negativas.");
            entrada.close();
            return;
        }

        double[] filial1 = new double[n1];
        double[] filial2 = new double[n2];
        double[] relatorio = new double[n1 + n2];

        System.out.println("Digite as vendas da filial 1 em ordem crescente:");
        for (int i = 0; i < n1; i++) {
            filial1[i] = entrada.nextDouble();
        }
        System.out.println("Digite as vendas da filial 2 em ordem crescente:");
        for (int i = 0; i < n2; i++) {
            filial2[i] = entrada.nextDouble();
        }

        int i = 0, j = 0, k = 0;
        // Comparo a proxima venda de cada filial e pego a menor.
        while (i < n1 && j < n2) {
            if (filial1[i] <= filial2[j]) {
                relatorio[k++] = filial1[i++];
            } else {
                relatorio[k++] = filial2[j++];
            }
        }
        while (i < n1) {
            relatorio[k++] = filial1[i++];
        }
        while (j < n2) {
            relatorio[k++] = filial2[j++];
        }

        System.out.println("Relatorio final em ordem crescente:");
        for (int p = 0; p < relatorio.length; p++) {
            System.out.printf("R$ %.2f%n", relatorio[p]);
        }
        entrada.close();
    }
}
