package poo2;

public class Paciente {
    private int codigo;
    private String nome;
    private String dataNascimento;
    private char sexo;
    private String planoSaude;
    private String alergia;
    private String tipoSanguineo;

    // Construtor
    public Paciente(int codigo, String nome, String dataNascimento, char sexo, String planoSaude, String alergia, String tipoSanguineo) {
        this.codigo = codigo;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.sexo = sexo;
        this.planoSaude = planoSaude;
        this.alergia = alergia;
        this.tipoSanguineo = tipoSanguineo;
    }

    // Método para exibir os dados
    public void exibirDados() {
        System.out.println("Código: " + codigo);
        System.out.println("Nome: " + nome);
        System.out.println("Data de Nascimento: " + dataNascimento);
        System.out.println("Sexo: " + sexo);
        System.out.println("Plano de Saúde: " + planoSaude);
        System.out.println("Alergia: " + alergia);
        System.out.println("Tipo Sanguíneo: " + tipoSanguineo);
    }

    // Método para modificar os dados com os valores de um dos pais
    public void modificarDados(String nome, String dataNascimento, char sexo, String planoSaude, String alergia, String tipoSanguineo) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.sexo = sexo;
        this.planoSaude = planoSaude;
        this.alergia = alergia;
        this.tipoSanguineo = tipoSanguineo;
    }

    // Método main para testar
    public static void main(String[] args) {
        // Passo a: Instanciando um objeto paciente com dados fictícios
        Paciente paciente = new Paciente(1, "Spinkfloyd", "16/06/2004", 'M', "Unimed", "Poeira", "O+");

        // Passo b: Imprimindo os dados do paciente
        System.out.println("Dados do Paciente Inicial:");
        paciente.exibirDados();

        // Passo c: Modificando os dados do paciente com os dados da mãe ou pai
        paciente.modificarDados("Maria Gorete", "29/01/1968", 'F', "Amil", "Poeira", "A+");

        // Passo d: Imprimindo os dados modificados
        System.out.println("\nDados do Paciente Modificados:");
        paciente.exibirDados();
    }
}
