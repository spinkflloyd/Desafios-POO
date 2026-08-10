package poo2;

public class Medico {
    private int codigo;
    private String nome;
    private char sexo;
    private String especialidade;
    private Endereco endereco;

    public Medico(int codigo, String nome, char sexo, String especialidade, Endereco endereco) {
        this.codigo = codigo;
        this.nome = nome;
        this.sexo = sexo;
        this.especialidade = especialidade;
        this.endereco = endereco;
    }

    public void exibirMedico() {
        System.out.println("Código: " + codigo);
        System.out.println("Nome: " + nome);
        System.out.println("Sexo: " + sexo);
        System.out.println("Especialidade: " + especialidade);
        endereco.exibirEndereco();
    }

    public static void main(String[] args) {
        Endereco endereco = new Endereco("Rua da Piçarra", 456, "Bloco A", "Centro Médico", "Cedro", "PE", "56130-000");
        Medico medico = new Medico(1, "Dr. Zubeldia", 'M', "Cardiologia", endereco);
        medico.exibirMedico();
    }
}
