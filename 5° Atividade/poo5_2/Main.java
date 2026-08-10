package poo5_2;

public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro("Sedan");
        Moto moto = new Moto("Scooter");
        int diasAluguel = 5;

        double valorAluguelCarro = carro.calcularAluguel(diasAluguel);
        System.out.println("O valor do aluguel do carro " + carro.getModelo() + " por " + diasAluguel + " dias é: R$" + String.format("%.2f", valorAluguelCarro));

        double valorAluguelMoto = moto.calcularAluguel(diasAluguel);
        System.out.println("O valor do aluguel da moto " + moto.getModelo() + " por " + diasAluguel + " dias é: R$" + String.format("%.2f", valorAluguelMoto));
    }
}