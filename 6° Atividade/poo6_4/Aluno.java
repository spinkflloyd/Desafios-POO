package poo6_4;

class Aluno {
    private String matricula;
    private String nome;
    private int idade;
    private String curso;

    public Aluno(String matricula, String nome, int idade, String curso) {
        this.matricula = matricula;
        this.nome = nome;
        this.idade = idade;
        this.curso = curso;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getCurso() {
        return curso;
    }

    @Override
    public String toString() {
        return "Matrícula: " + matricula + "\nNome: " + nome + "\nIdade: " + idade + "\nCurso: " + curso;
    }
}