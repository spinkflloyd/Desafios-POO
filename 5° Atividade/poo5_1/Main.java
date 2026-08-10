package poo5_1;

public class Main {
    public static void finalizarCompra(Pagamento pagamento, double valorTotal) {
        System.out.println("\nIniciando processo de pagamento para o valor de R$" + String.format("%.2f", valorTotal) + ".");
        pagamento.processarPagamento(valorTotal);
        System.out.println("Compra finalizada com sucesso");
    }

    public static void main(String[] args) {
        CartaoCredito cartao = new CartaoCredito("6975694851275869", "Ferreirinha", "12/25", "569");
        Dinheiro dinheiro = new Dinheiro();
        double valorDaCompra = 100.50;

        finalizarCompra(cartao, valorDaCompra);
        finalizarCompra(dinheiro, 50.00);
    }
}