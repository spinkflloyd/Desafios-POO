package poo5_1;

class CartaoCredito implements Pagamento {
    private String numeroCartao;
    private String titular;
    private String dataValidade;
    private String cvv;

    public CartaoCredito(String numeroCartao, String titular, String dataValidade, String cvv) {
        this.numeroCartao = numeroCartao;
        this.titular = titular;
        this.dataValidade = dataValidade;
        this.cvv = cvv;
    }

    @Override
    public void processarPagamento(double valor) {
        System.out.println("Processando pagamento de R$" + String.format("%.2f", valor) + " com cartão de crédito.");
        System.out.println("Número do cartão: ****-****-****-" + numeroCartao.substring(numeroCartao.length() - 4));
        System.out.println("Pagamento aprovado");
    }
}