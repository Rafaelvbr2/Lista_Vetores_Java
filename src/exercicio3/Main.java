package exercicio3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] codigos = {101, 102, 103, 104, 105};
        double[] precos = {12.50, 25.00, 8.90, 44.90, 17.50};
        boolean encontrado = false;

        System.out.print("Digite o codigo do produto: ");
        int codigoProcurado = entrada.nextInt();

        for (int i = 0; i < codigos.length; i++) {
            if (codigos[i] == codigoProcurado) {
                System.out.printf("Preco do produto: R$ %.2f%n", precos[i]);
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("Produto nao cadastrado");
        }
        entrada.close();
    }
}
