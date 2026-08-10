package Poo;

import java.util.Scanner;

public class EncontraMaiorMenor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];
        int maior, menor, posMaior = 0, posMenor = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            numeros[i] = scanner.nextInt();
        }

        maior = menor = numeros[0];

        for (int i = 1; i < 10; i++) {
            if (numeros[i] > maior) {
                maior = numeros[i];
                posMaior = i;
            }
            if (numeros[i] < menor) {
                menor = numeros[i];
                posMenor = i;
            }
        }

        System.out.println("Maior número: " + maior + " (Posição: " + posMaior + ")");
        System.out.println("Menor número: " + menor + " (Posição: " + posMenor + ")");

        scanner.close();
    }
}
