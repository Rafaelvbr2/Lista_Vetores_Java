package exercicio5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] notas = new int[10];
        int[] contagem = new int[11];

        for (int i = 0; i < notas.length; i++) {
            do {
                System.out.print("Nota do cliente " + (i + 1) + " (0 a 10): ");
                notas[i] = entrada.nextInt();
            } while (notas[i] < 0 || notas[i] > 10);
            contagem[notas[i]]++;
        }

        int maisVotada = 0;
        for (int i = 0; i < contagem.length; i++) {
            System.out.println("Nota " + i + ": " + contagem[i] + " voto(s)");
            if (contagem[i] > contagem[maisVotada]) {
                maisVotada = i;
            }
        }
        System.out.println("Nota mais votada: " + maisVotada + " (" + contagem[maisVotada] + " votos)");
        entrada.close();
    }
}
