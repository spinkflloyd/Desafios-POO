package poo8_1;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class RemoveIdadeLista {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> idades = new ArrayList<>();

        System.out.println("Digite a idade de 10 pessoas:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Pessoa " + (i + 1) + ": ");
            try {
                int idade = scanner.nextInt();
                idades.add(idade);
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, digite um número inteiro para a idade.");
                scanner.next(); 
                i--; 
            }
        }

        System.out.print("\nDigite a posição da idade que deseja remover: ");
        try {
            int posicaoRemover = scanner.nextInt();

            if (posicaoRemover >= 0 && posicaoRemover < idades.size()) {
                idades.remove(posicaoRemover);
                System.out.println("Idade na posição " + posicaoRemover + " removida com sucesso.");
                System.out.println("Lista de idades atualizada: " + idades);
            } else {
                System.out.println("Posição Inválida");
            }
        } catch (InputMismatchException e) {
            System.out.println("Posição Inválida");
        } finally {
            scanner.close();
        }
    }
}