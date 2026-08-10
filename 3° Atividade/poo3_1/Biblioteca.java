package poo3_1;

public class Biblioteca {
    private Livro[] livros;
    private int contador;

    public Biblioteca(int capacidade) {
        livros = new Livro[capacidade];
        contador = 0;
    }

    // Adicionar livro à biblioteca
    public void adicionarLivro(Livro livro) {
        if (contador < livros.length) {
            livros[contador] = livro;
            contador++;
            System.out.println("Livro adicionado com sucesso!");
        } else {
            System.out.println("Biblioteca cheia! Não é possível adicionar mais livros.");
        }
    }

    // Listar todos os livros
    public void listarLivros() {
        if (contador == 0) {
            System.out.println("Nenhum livro na biblioteca.");
        } else {
            System.out.println("Livros disponíveis na biblioteca:");
            for (int i = 0; i < contador; i++) {
                livros[i].exibirDetalhes();
            }
        }
    }
}
