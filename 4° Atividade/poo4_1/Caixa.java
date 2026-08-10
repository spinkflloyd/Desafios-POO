package poo4_1;

public class Caixa {
    private String identificador;
    private String conteudo;
    private double peso;
    private double altura;

    public Caixa(String identificador, String conteudo, double peso, double altura) {
        this.identificador = identificador;
        this.conteudo = conteudo;
        setPeso(peso); 
        setAltura(altura); 
    }

    public String getIdentificador() {
        return identificador;
    }

    public String getConteudo() {
        return conteudo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        if (peso <= 0) {
            throw new IllegalArgumentException("Peso deve ser maior que zero.");
        }
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        if (altura <= 0) {
            throw new IllegalArgumentException("Altura deve ser maior que zero.");
        }
        this.altura = altura;
    }

    public void exibirEtiqueta() {
        System.out.println("Identificador: " + identificador);
        System.out.println("Conteúdo: " + conteudo);
        System.out.println("Peso: " + peso + " kg");
        System.out.println("Altura: " + altura + " cm");
    }
}