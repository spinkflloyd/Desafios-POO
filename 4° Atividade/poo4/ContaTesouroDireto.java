package poo4;

public class ContaTesouroDireto extends ContaPoupanca {
    private static final double JUROS_MENSAIS = 0.01; 

    public ContaTesouroDireto(String numero, double saldoInicial) {
        super(numero, saldoInicial);
    }

    public void depositar(double valor) {
        if (valor > 1000) {
            super.depositar(valor);
        } else {
            System.out.println("Depósito não permitido. Valor deve ser maior que 1000 reais.");
        }
    }

    public void aplicarJuros() {
        double juros = getSaldo() * JUROS_MENSAIS;
        depositar(juros); 
    }
}