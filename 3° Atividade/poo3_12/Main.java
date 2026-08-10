package poo3_12;

public class Main {
    public static void main(String[] args) {
        Item[] itens = {
            new Item("Notebook", "A001", 10, 3500.00),
            new Item("Mouse", "A002", 50, 80.00),
            new Item("Teclado", "A003", 30, 120.00)
        };

        Inventario inventario = new Inventario(itens);
        inventario.exibirInventario();

        System.out.println("\nAtualizando estoque com uma venda:");
        itens[0].atualizarEstoque(2); 

        inventario.exibirInventario();
    }
}
