package poo5;

public class Main {
    public static void main(String[] args) {
        java.util.List<Animal> animais = new java.util.ArrayList<>();

        animais.add(new Cachorro());
        animais.add(new Gato());
        animais.add(new Cachorro());
        animais.add(new Gato());

        for (Animal animal : animais) {
            animal.emitirSom();
        }
    }
}