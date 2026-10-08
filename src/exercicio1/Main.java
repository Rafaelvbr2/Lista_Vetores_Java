package exercicio1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double[] vendas = new double[7];
        double total = 0;
        int melhorDia = 0;

        for (int i = 0; i < vendas.length; i++) {
            System.out.print("Faturamento do dia " + (i + 1) + ": R$ ");
            vendas[i] = entrada.nextDouble();
            total += vendas[i];
            if (vendas[i] > vendas[melhorDia]) {
                melhorDia = i;
            }
        }

        System.out.printf("Total da semana: R$ %.2f%n", total);
        System.out.printf("Media diaria: R$ %.2f%n", total / vendas.length);
        System.out.println("Dia que mais vendeu: dia " + (melhorDia + 1));
        entrada.close();
    }
}
