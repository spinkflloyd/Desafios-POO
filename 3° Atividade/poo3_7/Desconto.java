package poo3_7;

public class Desconto {

    public static double calcularDesconto(double valorTotal) {
        if (valorTotal > 500.00) {
            return valorTotal * 0.20;
        } else if (valorTotal >= 200.00) {
            return valorTotal * 0.10;
        } else {
            return valorTotal * 0.05;
        }
    }

    public static double aplicarDesconto(double valorTotal) {
        double desconto = calcularDesconto(valorTotal);
        return valorTotal - desconto;
    }

    public static void processarPedidos(double[] valoresPedidos) {
        for (double valor : valoresPedidos) {
            double comDesconto = aplicarDesconto(valor);
            System.out.printf("Pedido: R$ %.2f → Com desconto: R$ %.2f%n", valor, comDesconto);
        }
    }
}
