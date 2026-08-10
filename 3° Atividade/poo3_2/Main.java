package poo3_2;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Ana Silva", 25, 1.68);
        pessoa.exibirInformacoes();

        pessoa.setIdade(26);
        pessoa.setAltura(1.70);

        System.out.println("\nApós atualização:");
        pessoa.exibirInformacoes();
    }
}
