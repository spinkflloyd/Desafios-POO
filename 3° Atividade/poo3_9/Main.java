package poo3_9;

public class Main {
    public static void main(String[] args) {
        Aluno[] alunos = {
            new Aluno("João", 8.5),
            new Aluno("Maria", 7.0),
            new Aluno("Carlos", 9.2),
            new Aluno("Ana", 6.8)
        };

        double media = Aluno.calcularMedia(alunos);
        System.out.printf("Média das notas da turma: %.2f%n", media);
    }
}
