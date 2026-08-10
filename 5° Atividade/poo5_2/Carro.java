package poo5_2;

class Carro extends Veiculo {
    private double valorDiaria = 100.0;

    public Carro(String modelo) {
        super(modelo);
    }

    @Override
    public double calcularAluguel(int dias) {
        return dias * valorDiaria;
    }
}