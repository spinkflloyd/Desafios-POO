package poo3_6;

public class Main {
    public static void main(String[] args) {
        Produto produto1 = new Produto("Notebook", 3500.00, 10);
        Produto produto2 = new Produto("Mouse", 150.00, 20);

        Loja loja1 = new Loja();
        Loja loja2 = new Loja();

        loja1.registrarVenda(produto1, 2); 
        loja2.registrarVenda(produto2, 5); 

        System.out.printf("Total de vendas acumulado: R$ %.2f%n", Loja.getTotalVendas());
    }
}
