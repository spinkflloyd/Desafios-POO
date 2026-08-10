package poo3_5;

public class Main {
    public static void main(String[] args) {
        ContaCorrente conta = new ContaCorrente("12345-6", 500.0);

        conta.exibirInformacoes();
        conta.depositar(300.0);
        conta.sacar(600.0); 
        conta.sacar(300.0); 
        conta.exibirInformacoes();
    }
}
