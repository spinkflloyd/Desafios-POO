package poo5_1;

class Dinheiro implements Pagamento {
    @Override
    public void processarPagamento(double valor) {
        System.out.println("Processando pagamento de R$" + String.format("%.2f", valor) + " em dinheiro.");
        System.out.println("Valor recebido do cliente: R$" + String.format("%.2f", valor));
        System.out.println("Pagamento concluído");
    }
}