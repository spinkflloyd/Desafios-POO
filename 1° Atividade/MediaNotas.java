package Poo;
import java.util.Scanner;

public class MediaNotas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] notas = new double[5];
        double soma = 0;

        for (int i = 0; i < 5; i++) {
            System.out.print("Insira a nota do aluno " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
            soma += notas[i];
        }

        double media = soma / 5;
        int acimaDaMedia = 0;

        for (double nota : notas) {
            if (nota > media) {
                acimaDaMedia++;
            }
        }

        System.out.printf("Média: %.2f%n", media);
        System.out.println("Notas acima da média: " + acimaDaMedia);

        scanner.close();
    }
}
