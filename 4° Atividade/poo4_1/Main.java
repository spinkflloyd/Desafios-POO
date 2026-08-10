package poo4_1;

public class Main {

    public static void main(String[] args) {
        PilhaDeCaixas pilha = new PilhaDeCaixas(200);

        Caixa caixa1 = new Caixa("1", "Livros", 10, 50);
        Caixa caixa2 = new Caixa("2", "Eletrônicos", 15, 50);
        CaixaFragil caixa3 = new CaixaFragil("3", "Vidros", 5, 50, 20);
        Caixa caixa4 = new Caixa("4", "Roupas", 8, 50);

        System.out.println("Tentando empilhar caixa 1: " + pilha.empilhar(caixa1)); 
        System.out.println("Tentando empilhar caixa 2: " + pilha.empilhar(caixa2)); 
        System.out.println("Tentando empilhar caixa 3: " + pilha.empilhar(caixa3)); 
        System.out.println("Tentando empilhar caixa 4: " + pilha.empilhar(caixa4)); 

        pilha.exibirPilha();

        System.out.println("Desempilhando: " + pilha.desempilhar().getIdentificador());
        pilha.exibirPilha();
    }
}