package poo8_5;

import poo7_5.ContaCorrente;
import poo7_5.SaldoInsuficienteException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Banco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String numeroConta;
        double saldoInicial = 0;
        poo7_5.ContaCorrente minhaConta = null;

        System.out.print("Digite o número da conta: ");
        numeroConta = scanner.nextLine();

        boolean saldoValido = false;
        while (!saldoValido) {
            System.out.print("Digite o saldo inicial: ");
            try {
                saldoInicial = scanner.nextDouble();
                saldoValido = true;
            } catch (InputMismatchException e) {
                System.out.println("Erro: Por favor, digite um valor numérico para o saldo.");
                scanner.next(); 
            }
        }

        minhaConta = new ContaCorrente(numeroConta, saldoInicial);
        System.out.println("\nConta Corrente criada com número: " + minhaConta.getNumeroConta() + " e saldo inicial: R$" + String.format("%.2f", minhaConta.getSaldo()));

        System.out.println("\nRealize 10 saques:");
        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite o valor do " + i + "º saque: ");
            try {
                double valorSaque = scanner.nextDouble();
                minhaConta.sacar(valorSaque);
            } catch (InputMismatchException e) {
                System.out.println("Erro: Por favor, digite um valor numérico para o saque.");
                scanner.next(); 
            } catch (SaldoInsuficienteException e) {
                System.out.println("Erro ao realizar o saque: " + e.getMessage());
            }
        }

        scanner.close();
    }
}