package poo3_8;

public class Pedido {
    private double valorTotal;

    public Pedido(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public double calcularDesconto() {
        if (valorTotal > 500.00) {
            return valorTotal * 0.20;
        } else if (valorTotal >= 200.00) {
            return valorTotal * 0.10;
        } else {
            return valorTotal * 0.05;
        }
    }

    public double aplicarDesconto() {
        return valorTotal - calcularDesconto();
    }

    public void exibirResumo() {
        System.out.printf("Valor original: R$ %.2f | Desconto: R$ %.2f | Total com desconto: R$ %.2f%n",
                          valorTotal, calcularDesconto(), aplicarDesconto());
    }
}
