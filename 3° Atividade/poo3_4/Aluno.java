package poo3_4;

public class Aluno {
    private String nome;
    private double nota;

    public Aluno(String nome, double nota) {
        this.nome = nome;
        this.nota = nota;
    }

    public String getNome() {
        return nome;
    }

    public double getNota() {
        return nota;
    }

    public static double calcularMedia(Aluno[] alunos) {
        if (alunos == null || alunos.length == 0) {
            throw new IllegalArgumentException("O array de alunos não pode ser nulo ou vazio.");
        }

        double soma = 0;
        for (Aluno aluno : alunos) {
            soma += aluno.getNota();
        }

        return soma / alunos.length;
    }
}
