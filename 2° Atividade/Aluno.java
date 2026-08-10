package poo2;

public class Aluno {
    private String nome;
    private String cpf;
    private double[] notas;

    public Aluno(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
        this.notas = new double[4]; 
    }

    public void setNotas(double nota1, double nota2, double nota3, double nota4) {
        this.notas[0] = nota1;
        this.notas[1] = nota2;
        this.notas[2] = nota3;
        this.notas[3] = nota4;
    }

    public double calcularMedia() {
        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }
        return soma / notas.length;
    }

    public void modificarNota(int indice, double novaNota) {
        if (indice >= 0 && indice < notas.length) {
            notas[indice] = novaNota;
        } else {
            System.out.println("Índice inválido!");
        }
    }

    public static void main(String[] args) {
        Aluno aluno = new Aluno("João Silva", "696.276.576-02");

        aluno.setNotas(7.5, 8.0, 6.5, 9.0);

        double media = aluno.calcularMedia();

        System.out.println("Média inicial: " + media);

        aluno.modificarNota(1, 9.5);

        double novaMedia = aluno.calcularMedia();

        System.out.println("Nova média: " + novaMedia);
    }
}