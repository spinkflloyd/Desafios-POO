package poo3_6;

public class Loja {
    private static double totalVendas = 0.0;

    public void registrarVenda(Produto produto, int quantidade) {
        if (produto.reduzirEstoque(quantidade)) {
            double valorVenda = produto.getPreco() * quantidade;
            totalVendas += valorVenda;
            System.out.printf("Venda registrada: %d x %s (R$ %.2f)%n", 
                              quantidade, produto.getNome(), valorVenda);
        } else {
            System.out.println("Venda não realizada: estoque insuficiente ou quantidade inválida.");
        }
    }

    public static double getTotalVendas() {
        return totalVendas;
    }
}
