package poo3_10;

public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro("Toyota", "Corolla", 2022);
        carro.exibirInformacoes();

        if (carro.ehRecente()) {
            System.out.println("O carro é recente.");
        } else {
            System.out.println("O carro não é recente.");
        }
    }
}
