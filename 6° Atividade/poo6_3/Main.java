package poo6_3;

public class Main {
    public static void main(String[] args) {
        ConjuntoDePalavras conjunto1 = new ConjuntoDePalavras("casa, carro, árvore, livro");
        System.out.println("Conjunto 1: " + conjunto1.getPalavras());

        System.out.println("Conjunto 1 contém 'casa, livro'? " + conjunto1.contemTodas("casa, livro"));
        System.out.println("Conjunto 1 contém 'casa, flor'? " + conjunto1.contemTodas("casa, flor"));
        System.out.println("Conjunto 1 contém ''? " + conjunto1.contemTodas(""));
        System.out.println("Conjunto 1 contém null? " + conjunto1.contemTodas(null));

        ConjuntoDePalavras conjunto2 = new ConjuntoDePalavras("");
        System.out.println("\nConjunto 2: " + conjunto2.getPalavras());
        System.out.println("Conjunto 2 contém 'sol'? " + conjunto2.contemTodas("sol"));
    }
}