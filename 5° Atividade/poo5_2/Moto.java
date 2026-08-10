package poo5_2;

class Moto extends Veiculo {
    private double valorDiaria = 50.0;

    public Moto(String modelo) {
        super(modelo);
    }

    public double calcularAluguel(int dias) {
        return dias * valorDiaria;
    }
}