package poo7;

import java.util.Scanner;

public class CaractereNaPosicao {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite um número: ");
        try {
            int posicao = scanner.nextInt();
            if (posicao >= 0 && posicao < nome.length()) {
                char letra = nome.charAt(posicao);
                System.out.println("O caractere na posição " + posicao + " é: " + letra);
            } else {
                System.out.println("Posição Inválida");
            }
        } catch (java.util.InputMismatchException e) {
            System.out.println("Posição Inválida");
        } finally {
            scanner.close();
        }
    }
}