package poo3_4;

public class Main {
    public static void main(String[] args) {
        Aluno[] turma = {
            new Aluno("João", 7.5),
            new Aluno("Maria", 8.0),
            new Aluno("Pedro", 6.5),
            new Aluno("Ana", 9.0)
        };

        double media = Aluno.calcularMedia(turma);
        System.out.printf("Média da turma: %.2f%n", media);
    }
}
