package poo3;

public class Main {
    public static void main(String[] args) {
        Carro meuCarro = new Carro("Honda", "Civic", 2022);

        meuCarro.exibirDetalhes();
        meuCarro.acelerar(); 
        meuCarro.trocarMarcha(1); 
        meuCarro.acelerar(); 
        meuCarro.trocarMarcha(2); 
        meuCarro.acelerar(); 
        meuCarro.trocarMarcha(2); 

        System.out.println("\nApós aceleração e trocas de marcha:");
        meuCarro.exibirDetalhes();
    }
}
