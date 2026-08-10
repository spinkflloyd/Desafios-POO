package poo3_12;

public class Item {
    private String nome;
    private String codigo;
    private int quantidade;
    private double precoUnitario;

    public Item(String nome, String codigo, int quantidade, double precoUnitario) {
        this.nome = nome;
        this.codigo = codigo;
        this.quantidade = Math.max(0, quantidade);
        this.precoUnitario = Math.max(0, precoUnitario);
    }

    // Getters
    public String getNome() {
        return nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    public void atualizarEstoque(int quantidadeVendida) {
        if (quantidadeVendida <= 0) {
            System.out.println("Quantidade vendida deve ser positiva.");
        } else if (quantidadeVendida > quantidade) {
            System.out.println("Estoque insuficiente para a venda.");
        } else {
            quantidade -= quantidadeVendida;
            System.out.printf("Venda realizada: %d unidades de %s. Estoque restante: %d%n",
                              quantidadeVendida, nome, quantidade);
        }
    }

    public double calcularValorTotal() {
        return quantidade * precoUnitario;
    }

    public void exibirItem() {
        System.out.printf("Item: %s | Código: %s | Quantidade: %d | Preço: R$ %.2f | Valor total: R$ %.2f%n",
                          nome, codigo, quantidade, precoUnitario, calcularValorTotal());
    }
}
