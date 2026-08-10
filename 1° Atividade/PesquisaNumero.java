package Poo;

import java.util.Random;
import java.util.Scanner;

public class PesquisaNumero {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[15];

        for (int i = 0; i < 15; i++) {
            numeros[i] = random.nextInt(100) + 1;
        }

        System.out.print("Digite um número para pesquisar: ");
        int numPesquisa = scanner.nextInt();
        boolean encontrado = false;

        System.out.print("Número encontrado nas posições: ");
        for (int i = 0; i < 15; i++) {
            if (numeros[i] == numPesquisa) {
                System.out.print(i + " ");
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("\nNúmero não encontrado.");
        } else {
            System.out.println();
        }

        scanner.close();
    }
}
