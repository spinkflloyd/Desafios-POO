package poo3_9;

public class Aluno {
    private String nome;
    private double notaFinal;

    public Aluno(String nome, double notaFinal) {
        this.nome = nome;
        this.notaFinal = notaFinal;
    }

    public String getNome() {
        return nome;
    }

    public double getNotaFinal() {
        return notaFinal;
    }

    public static double calcularMedia(Aluno[] alunos) {
        if (alunos == null || alunos.length == 0) {
            throw new IllegalArgumentException("Lista de alunos não pode ser vazia.");
        }

        double soma = 0.0;
        for (Aluno aluno : alunos) {
            soma += aluno.getNotaFinal();
        }

        return soma / alunos.length;
    }
}
