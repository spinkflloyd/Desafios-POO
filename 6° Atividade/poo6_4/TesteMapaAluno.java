package poo6_4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TesteMapaAluno {
    public static void main(String[] args) {
        Map<String, Aluno> mapaDeAlunos = new HashMap<>();

        Aluno aluno1 = new Aluno("511", "Spink", 19, "Ciencias da computacao");
        Aluno aluno2 = new Aluno("512", "Evelyn", 19, "Farmacia");
        Aluno aluno3 = new Aluno("519", "Taki Tachibana", 19, "Artes visuais");
        Aluno aluno4 = new Aluno("514", "Jojo", 18, "Ciencias contaveis");
        Aluno aluno5 = new Aluno("517", "Lelouch", 19, "Xadrez");

        mapaDeAlunos.put(aluno1.getMatricula(), aluno1);
        mapaDeAlunos.put(aluno2.getMatricula(), aluno2);
        mapaDeAlunos.put(aluno3.getMatricula(), aluno3);
        mapaDeAlunos.put(aluno4.getMatricula(), aluno4);
        mapaDeAlunos.put(aluno5.getMatricula(), aluno5);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a matrícula do aluno que você deseja buscar: ");
        String matriculaBusca = scanner.nextLine();

        Aluno alunoEncontrado = mapaDeAlunos.get(matriculaBusca);

        if (alunoEncontrado != null) {
            System.out.println("\nDados do aluno com matrícula " + matriculaBusca + ":");
            System.out.println(alunoEncontrado);
        } else {
            System.out.println("\nAluno não encontrado!");
        }

        scanner.close();
    }
}