package poo7_3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PreencheVetor {

    public static void main(String[] args) {
        int[] vetor = new int[10];
        Scanner scanner = new Scanner(System.in);
        int contador = 0;

        System.out.println("Digite valores inteiros para preencher o vetor (digite 0 para parar):");

        while (true) {
            try {
                System.out.print("Digite o valor para a posição " + contador + ": ");
                int valor = scanner.nextInt();
                vetor[contador] = valor;
                contador++;

                if (valor == 0) {
                    break; 
                }

                if (contador == vetor.length) {
                    System.out.println("Aviso: O vetor está cheio. A leitura será interrompida.");
                    break; 
                }

            } catch (InputMismatchException e) {
                System.out.println("Erro: Por favor, digite um valor inteiro.");
                scanner.next(); 
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Erro: Você tentou inserir mais valores do que a capacidade do vetor (10).");
                break; 
            }
        }

        System.out.println("\nValores armazenados no vetor:");
        for (int i = 0; i < contador; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();

        scanner.close();
    }
}