package poo3_8;

public class Main {
    public static void main(String[] args) {
        Pedido[] pedidos = {
            new Pedido(150.00),
            new Pedido(350.00),
            new Pedido(700.00)
        };

        for (Pedido p : pedidos) {
            p.exibirResumo();
        }
    }
}
