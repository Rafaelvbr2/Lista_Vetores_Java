package exercicio6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] senhas = new int[10];
        boolean[] idosos = new boolean[10];
        int tamanho = 10;

        for (int i = 0; i < tamanho; i++) {
            System.out.print("Senha do cliente " + (i + 1) + ": ");
            senhas[i] = entrada.nextInt();
            System.out.print("Eh idoso? (1 = sim, 0 = nao): ");
            idosos[i] = entrada.nextInt() == 1;
        }

        for (int atendimento = 1; atendimento <= 3; atendimento++) {
            int posicao = 0;
            for (int i = 0; i < tamanho; i++) {
                if (idosos[i]) {
                    posicao = i;
                    break;
                }
            }
            System.out.println("Atendimento " + atendimento + ": senha " + senhas[posicao]);

            for (int i = posicao; i < tamanho - 1; i++) {
                senhas[i] = senhas[i + 1];
                idosos[i] = idosos[i + 1];
            }
            tamanho--;
            senhas[tamanho] = 0;
            idosos[tamanho] = false;

            System.out.print("Fila agora: ");
            for (int i = 0; i < senhas.length; i++) {
                System.out.print(senhas[i] + " ");
            }
            System.out.println();
        }
        entrada.close();
    }
}
