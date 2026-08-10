package poo3_11;

public class Main {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria("Alice", 1000.00);
        conta.exibirDados();

        conta.depositar(500.00);
        conta.sacar(300.00);
        conta.sacar(1500.00); 

        conta.exibirDados();
    }
}
