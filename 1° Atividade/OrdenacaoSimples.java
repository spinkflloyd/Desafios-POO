package Poo;

import java.util.Arrays;
import java.util.Scanner;

public class OrdenacaoSimples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nomes = new String[8];

        for (int i = 0; i < 8; i++) {
            System.out.print("Digite o nome da pessoa " + (i + 1) + ": ");
            nomes[i] = scanner.nextLine();
        }

        System.out.println("\nLista antes da ordenação:");
        exibirArray(nomes);

        Arrays.sort(nomes);

        System.out.println("\nLista após a ordenação:");
        exibirArray(nomes);

        scanner.close();
    }

    public static void exibirArray(String[] array) {
        for (String nome : array) {
            System.out.println(nome);
        }
    }
}
