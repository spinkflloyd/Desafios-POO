package poo4;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<ContaPoupanca> contas = new ArrayList<>(10);
        for (int i = 0; i < 10; i++) {
            contas.add(null); 
        }

        ContaTesouroDireto contaTesouro = new ContaTesouroDireto("TD-123", 10000.0);
        contas.set(0, contaTesouro); 

        ContaPoupanca contaPoupanca = new ContaPoupanca("CP-456", 10000.0);
        contas.set(1, contaPoupanca); 

        System.out.println("Saldo Conta Tesouro Direto: " + contas.get(0).getSaldo());

        System.out.println("Saldo Conta Poupanca: " + contas.get(1).getSaldo());

        contas.get(0).depositar(1500.0); 
        System.out.println("Saldo Conta Tesouro Direto após depósito: " + contas.get(0).getSaldo());
        contas.get(0).depositar(500.0);  
        System.out.println("Saldo Conta Tesouro Direto após depósito inválido: " + contas.get(0).getSaldo());

        System.out.println("Saldo Conta Tesouro Direto: " + contas.get(0).getSaldo());

        contas.get(1).depositar(500.0);
        System.out.println("Saldo Conta Poupanca após depósito: " + contas.get(1).getSaldo());

        System.out.println("Saldo Conta Poupanca: " + contas.get(1).getSaldo());

        contas.get(0).aplicarJuros();
        System.out.println("Saldo Conta Tesouro Direto após juros: " + contas.get(0).getSaldo());

        System.out.println("Saldo Conta Tesouro Direto: " + contas.get(0).getSaldo());

        contas.get(1).aplicarJuros();
        System.out.println("Saldo Conta Poupanca após juros: " + contas.get(1).getSaldo());

        System.out.println("Saldo Conta Poupanca: " + contas.get(1).getSaldo());
    }
}