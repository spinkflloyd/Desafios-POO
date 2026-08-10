package poo7_4;

public class Triangulo {
    private double ladoA;
    private double ladoB;
    private double ladoC;

    public Triangulo(double ladoA, double ladoB, double ladoC) throws DimensoesInvalidasException {
        if (!saoDimensoesValidas(ladoA, ladoB, ladoC)) {
            throw new DimensoesInvalidasException("As dimensões fornecidas para o triângulo são inválidas.");
        }
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
    }

    public double getLadoA() {
        return ladoA;
    }

    public void setLadoA(double ladoA) throws DimensoesInvalidasException {
        if (!saoDimensoesValidas(ladoA, this.ladoB, this.ladoC)) {
            throw new DimensoesInvalidasException("A nova dimensão para o lado A é inválida.");
        }
        this.ladoA = ladoA;
    }

    public double getLadoB() {
        return ladoB;
    }

    public void setLadoB(double ladoB) throws DimensoesInvalidasException {
        if (!saoDimensoesValidas(this.ladoA, ladoB, this.ladoC)) {
            throw new DimensoesInvalidasException("A nova dimensão para o lado B é inválida.");
        }
        this.ladoB = ladoB;
    }

    public double getLadoC() {
        return ladoC;
    }

    public void setLadoC(double ladoC) throws DimensoesInvalidasException {
        if (!saoDimensoesValidas(this.ladoA, this.ladoB, ladoC)) {
            throw new DimensoesInvalidasException("A nova dimensão para o lado C é inválida.");
        }
        this.ladoC = ladoC;
    }

    private boolean saoDimensoesValidas(double a, double b, double c) {
        return (a > Math.abs(b - c) && a < (b + c)) &&
               (b > Math.abs(a - c) && b < (a + c)) &&
               (c > Math.abs(a - b) && c < (a + b));
    }
}