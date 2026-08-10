package poo8_5;

import poo7_5.SaldoInsuficienteException;

public class ContaCorrente {
    private String numeroConta;
    private double saldo;

    public ContaCorrente(String numeroConta, double saldoInicial) {
        this.numeroConta = numeroConta;
        this.saldo = saldoInicial;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void sacar(double valor) throws poo7_5.SaldoInsuficienteException {
        if (valor > saldo) {
            throw new SaldoInsuficienteException("Saldo insuficiente para realizar o saque.");
        }
        saldo -= valor;
        System.out.println("Saque de R$" + String.format("%.2f", valor) + " realizado com sucesso.");
        System.out.println("Novo saldo: R$" + String.format("%.2f", saldo));
    }

    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Depósito de R$" + String.format("%.2f", valor) + " realizado com sucesso.");
        System.out.println("Novo saldo: R$" + String.format("%.2f", saldo));
    }
}