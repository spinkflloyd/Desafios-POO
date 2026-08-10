package poo2;

public class Endereco {
    private String rua;
    private int numero;
    private String complemento;
    private String bairro;
    private String cidade;
    private String uf;
    private String cep;

    public Endereco(String rua, int numero, String complemento, String bairro, String cidade, String uf, String cep) {
        this.rua = rua;
        this.numero = numero;
        this.complemento = complemento;
        this.bairro = bairro;
        this.cidade = cidade;
        this.uf = uf;
        this.cep = cep;
    }

    public void exibirEndereco() {
        System.out.println("Endereço: " + rua + ", " + numero + ", " + complemento + ", " + bairro + ", " + cidade + ", " + uf + ", " + cep);
    }

    public static void main(String[] args) {
        Endereco endereco = new Endereco("Rua do Meio", 123, "Apto 101", "Lugar das pea", "Cedro", "PE", "56130-000");
        endereco.exibirEndereco();
    }
}
