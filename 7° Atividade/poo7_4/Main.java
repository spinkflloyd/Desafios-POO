package poo7_4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Triangulo triangulo1 = new Triangulo(3, 4, 5);
            System.out.println("Triângulo 1 criado com lados: " + triangulo1.getLadoA() + ", " + triangulo1.getLadoB() + ", " + triangulo1.getLadoC());
        } catch (DimensoesInvalidasException e) {
            System.err.println("Erro ao criar o Triângulo 1: " + e.getMessage());
        }

        try {
            Object triangulo1 = null;
			if (triangulo1 != null) {
                ((Triangulo) triangulo1).setLadoA(10);
                System.out.println("Dimensão do lado A do Triângulo 1 alterada para: " + ((Triangulo) triangulo1).getLadoA());
            }
        } catch (DimensoesInvalidasException e) {
            System.err.println("Erro ao alterar o lado A do Triângulo 1: " + e.getMessage());
        }

        Scanner scanner = new Scanner(System.in);
        double ladoX = 0, ladoY = 0, ladoZ = 0;

        System.out.println("\nDigite as dimensões de um novo triângulo:");
        try {
            System.out.print("Lado X: ");
            ladoX = scanner.nextDouble();
            System.out.print("Lado Y: ");
            ladoY = scanner.nextDouble();
            System.out.print("Lado Z: ");
            ladoZ = scanner.nextDouble();
        } catch (java.util.InputMismatchException e) {
            System.err.println("Erro: Por favor, digite valores numéricos.");
            scanner.next(); 
            scanner.close();
            return; 
        }

        try {
            Triangulo triangulo2 = new Triangulo(ladoX, ladoY, ladoZ);
            System.out.println("Triângulo 2 criado com lados: " + triangulo2.getLadoA() + ", " + triangulo2.getLadoB() + ", " + triangulo2.getLadoC());
        } catch (DimensoesInvalidasException e) {
            System.err.println("Erro ao criar o Triângulo 2: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}