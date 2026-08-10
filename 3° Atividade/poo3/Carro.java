package poo3;

public class Carro {
    // Atributos privados
    private String marca;
    private String modelo;
    private int ano;
    private int velocidadeAtual;
    private int marcha;

    // Construtor
    public Carro(String marca, String modelo, int ano) {
        setMarca(marca);
        setModelo(modelo);
        setAno(ano);
        this.velocidadeAtual = 0; // valor inicial
        this.marcha = 1; // marcha inicial
    }

    // Método para acelerar
    public void acelerar() {
        velocidadeAtual += 10;
    }

    // Método para frear
    public void frear() {
        velocidadeAtual -= 10;
        if (velocidadeAtual < 0) {
            velocidadeAtual = 0;
        }
    }

    // Método para trocar marcha
    public void trocarMarcha(int novaMarcha) {
        if (novaMarcha < 1 || novaMarcha > 5) {
            System.out.println("Marcha inválida. Escolha uma marcha entre 1 e 5.");
            return;
        }

        boolean marchaValida = false;

        switch (novaMarcha) {
            case 1:
                marchaValida = velocidadeAtual <= 20;
                break;
            case 2:
                marchaValida = velocidadeAtual > 20 && velocidadeAtual <= 40;
                break;
            case 3:
                marchaValida = velocidadeAtual > 40 && velocidadeAtual <= 60;
                break;
            case 4:
                marchaValida = velocidadeAtual > 60 && velocidadeAtual <= 80;
                break;
            case 5:
                marchaValida = velocidadeAtual > 80;
                break;
        }

        if (marchaValida) {
            marcha = novaMarcha;
            System.out.println("Marcha trocada para: " + marcha);
        } else {
            System.out.println("Não é possível trocar para a marcha " + novaMarcha + " com a velocidade atual de " + velocidadeAtual + " km/h.");
        }
    }

    // Método para exibir detalhes
    public void exibirDetalhes() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Velocidade Atual: " + velocidadeAtual + " km/h");
        System.out.println("Marcha Atual: " + marcha);
    }

    // Getter e Setter para marca
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        if (marca != null && !marca.trim().isEmpty()) {
            this.marca = marca;
        } else {
            throw new IllegalArgumentException("Marca não pode ser nula ou vazia.");
        }
    }

    // Getter e Setter para modelo
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        if (modelo != null && !modelo.trim().isEmpty()) {
            this.modelo = modelo;
        } else {
            throw new IllegalArgumentException("Modelo não pode ser nulo ou vazio.");
        }
    }

    // Getter e Setter para ano
    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        if (ano >= 1886) {
            this.ano = ano;
        } else {
            throw new IllegalArgumentException("Ano não pode ser inferior a 1886.");
        }
    }

    // Getter para velocidadeAtual
    public int getVelocidadeAtual() {
        return velocidadeAtual;
    }

    // Getter para marcha
    public int getMarcha() {
        return marcha;
    }
}
