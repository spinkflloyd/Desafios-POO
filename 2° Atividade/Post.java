package poo2;

public class Post {
    private String texto;
    private String link;
    private int numeroCurtidas;
    private int numeroCompartilhamentos;

    public Post(String texto, String link) {
        this.texto = texto;
        this.link = link;
        this.numeroCurtidas = 0;
        this.numeroCompartilhamentos = 0;
    }

    public void curtir() {
        this.numeroCurtidas++;
    }

    public void compartilhar() {
        this.numeroCompartilhamentos++;
    }

    public void exibirInformacoes() {
        System.out.println("Texto: " + this.texto);
        System.out.println("Link: " + this.link);
        System.out.println("Curtidas: " + this.numeroCurtidas);
        System.out.println("Compartilhamentos: " + this.numeroCompartilhamentos);
    }

    public static void main(String[] args) {
        String meuUltimoPost = "Adorei o dia de hoje!";
        String meuSiteFavorito = "https://www.google.com";
        
        Post meuPost = new Post(meuUltimoPost, meuSiteFavorito);

        meuPost.curtir();
        meuPost.curtir();
        meuPost.curtir();

        System.out.println("Número de curtidas: " + meuPost.numeroCurtidas);

        meuPost.compartilhar();
        meuPost.compartilhar();

        System.out.println("Número de compartilhamentos: " + meuPost.numeroCompartilhamentos);
    }
}