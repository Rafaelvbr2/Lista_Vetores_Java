package exercicio4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double[] salarios = new double[8];
        double aumentoTotal = 0;

        for (int i = 0; i < salarios.length; i++) {
            System.out.print("Salario do funcionario " + (i + 1) + ": R$ ");
            salarios[i] = entrada.nextDouble();
        }

        for (int i = 0; i < salarios.length; i++) {
            double antigo = salarios[i];
            double novo = antigo * 1.10;
            if (novo > 5000) {
                novo = 5000;
            }
            // Quem ja recebe acima do teto nao pode ter o salario reduzido.
            if (novo < antigo) {
                novo = antigo;
            }
            aumentoTotal += novo - antigo;
            System.out.printf("Funcionario %d: antes R$ %.2f | depois R$ %.2f%n", i + 1, antigo, novo);
        }
        System.out.printf("Aumento total da folha: R$ %.2f%n", aumentoTotal);
        entrada.close();
    }
}
