package poo6_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CadastroAluno cadastro = new CadastroAluno();

        System.out.println("Digite os dados de 10 alunos:");
        for (int i = 0; i < 10; i++) {
            System.out.println("\nAluno " + (i + 1) + ":");
            System.out.print("Matrícula: ");
            String matricula = scanner.nextLine();
            System.out.print("Nome: ");
            String nome = scanner.nextLine();
            System.out.print("Idade: ");
            int idade = scanner.nextInt();
            scanner.nextLine(); 
            System.out.print("Curso: ");
            String curso = scanner.nextLine();

            Aluno novoAluno = new Aluno(matricula, nome, idade, curso);
            cadastro.adicionarAluno(novoAluno);
        }

        cadastro.imprimirListaDeAlunos();

        scanner.close();
    }
}