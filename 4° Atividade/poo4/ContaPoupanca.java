package poo4;

public class ContaPoupanca extends Conta {
    private static final double JUROS_MENSAIS = 0.005; 

    public ContaPoupanca(String numero, double saldoInicial) {
        super(numero, saldoInicial);
    }

    public void aplicarJuros() {
        double juros = getSaldo() * JUROS_MENSAIS;
        depositar(juros);
    }
}