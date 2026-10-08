package exercicio2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] estoque = new int[10];
        int quantidadeCritica = 0;

        for (int i = 0; i < estoque.length; i++) {
            System.out.print("Estoque do produto " + (i + 1) + ": ");
            estoque[i] = entrada.nextInt();
        }

        System.out.println("Produtos com menos de 5 unidades:");
        for (int i = 0; i < estoque.length; i++) {
            if (estoque[i] < 5) {
                quantidadeCritica++;
                System.out.println("Posicao " + (i + 1) + ": " + estoque[i] + " unidades");
            }
        }
        System.out.println("Total em estoque critico: " + quantidadeCritica);
        entrada.close();
    }
}
