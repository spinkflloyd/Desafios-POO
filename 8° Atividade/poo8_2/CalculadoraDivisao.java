package poo8_2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculadoraDivisao {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double numerador = 0;
        double denominador = 0;

        try {
            System.out.print("Digite o numerador: ");
            numerador = scanner.nextDouble();

            System.out.print("Digite o denominador: ");
            denominador = scanner.nextDouble();

            if (denominador == 0) {
                throw new ArithmeticException("Divisão por zero não permitida.");
            }

            double resultado = numerador / denominador;
            System.out.println("O resultado da divisão é: " + resultado);

        } catch (InputMismatchException e) {
            System.out.println("Erro: Por favor, digite valores numéricos.");
            scanner.next(); 
        } catch (ArithmeticException e) {
            System.out.println("Erro: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}