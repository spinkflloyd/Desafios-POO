package poo3_5;

public class ContaCorrente {
    private String numeroConta;
    private double saldo;
    private double limite;

    public ContaCorrente(String numeroConta, double limiteInicial) {
        this.numeroConta = numeroConta;
        this.saldo = 0.0;
        this.limite = limiteInicial > 0 ? limiteInicial : 0.0;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$ " + valor + " realizado com sucesso.");
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }

    public void sacar(double valor) {
        if (valor > 0) {
            if (saldo - valor >= -limite) {
                saldo -= valor;
                System.out.println("Saque de R$ " + valor + " realizado com sucesso.");
            } else {
                System.out.println("Saque negado! Saldo insuficiente considerando o limite.");
            }
        } else {
            System.out.println("Valor de saque inválido.");
        }
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getLimite() {
        return limite;
    }

    public void exibirInformacoes() {
        System.out.println("Conta: " + numeroConta);
        System.out.printf("Saldo: R$ %.2f%n", saldo);
        System.out.printf("Limite: R$ %.2f%n", limite);
    }
}
