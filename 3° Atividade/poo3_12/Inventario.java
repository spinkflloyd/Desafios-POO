package poo3_12;

public class Inventario {
    private Item[] itens;

    public Inventario(Item[] itens) {
        this.itens = itens;
    }

    public double calcularValorTotalInventario() {
        double total = 0.0;
        for (Item item : itens) {
            total += item.calcularValorTotal();
        }
        return total;
    }

    public void exibirInventario() {
        for (Item item : itens) {
            item.exibirItem();
        }
        System.out.printf("Valor total do inventário: R$ %.2f%n", calcularValorTotalInventario());
    }
}
