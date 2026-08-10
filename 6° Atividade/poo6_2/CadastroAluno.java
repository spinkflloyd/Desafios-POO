package poo6_2;

import java.util.ArrayList;
import java.util.List;


class CadastroAluno {
    private List<Aluno> listaDeAlunos;

    public CadastroAluno() {
        this.listaDeAlunos = new ArrayList<>();
    }

    public void adicionarAluno(Aluno aluno) {
        this.listaDeAlunos.add(aluno);
    }

    public void imprimirListaDeAlunos() {
        if (listaDeAlunos.isEmpty()) {
            System.out.println("A lista de alunos está vazia.");
        } else {
            System.out.println("Lista de Alunos:");
            for (Aluno aluno : listaDeAlunos) {
                System.out.println(aluno);
            }
        }
    }
}