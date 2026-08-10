package poo4_1;

public class CaixaFragil extends Caixa {
    private double pesoMaximoSuportado;

    public CaixaFragil(String identificador, String conteudo, double peso, double altura, double pesoMaximoSuportado) {
        super(identificador, conteudo, peso, altura);
        setPesoMaximoSuportado(pesoMaximoSuportado); 
    }

    public double getPesoMaximoSuportado() {
        return pesoMaximoSuportado;
    }

    public void setPesoMaximoSuportado(double pesoMaximoSuportado) {
        if (pesoMaximoSuportado <= 0) {
            throw new IllegalArgumentException("Peso máximo suportado deve ser maior que zero.");
        }
        this.pesoMaximoSuportado = pesoMaximoSuportado;
    }

    public void exibirEtiqueta() {
        super.exibirEtiqueta();
        System.out.println("Peso Máximo Suportado: " + pesoMaximoSuportado + " kg");
    }
}