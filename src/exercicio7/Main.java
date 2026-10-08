package exercicio7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String[] nomes = new String[6];
        double[] vendas = new double[6];

        for (int i = 0; i < nomes.length; i++) {
            System.out.print("Nome do vendedor " + (i + 1) + ": ");
            nomes[i] = entrada.nextLine();
            System.out.print("Total vendido: R$ ");
            vendas[i] = Double.parseDouble(entrada.nextLine().replace(',', '.'));
        }

        // Ordeno os valores e os nomes juntos para nao misturar os vendedores.
        for (int i = 0; i < vendas.length - 1; i++) {
            for (int j = i + 1; j < vendas.length; j++) {
                if (vendas[j] > vendas[i]) {
                    double auxiliarVenda = vendas[i];
                    vendas[i] = vendas[j];
                    vendas[j] = auxiliarVenda;

                    String auxiliarNome = nomes[i];
                    nomes[i] = nomes[j];
                    nomes[j] = auxiliarNome;
                }
            }
        }

        System.out.println("Ranking de vendedores:");
        for (int i = 0; i < nomes.length; i++) {
            System.out.printf("%d lugar: %s - R$ %.2f%n", i + 1, nomes[i], vendas[i]);
        }
        entrada.close();
    }
}
