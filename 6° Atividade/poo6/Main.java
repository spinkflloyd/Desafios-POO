package poo6;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Circulo circulo1 = new Circulo(5.0);
        Circulo circulo2 = new Circulo(3.2);
        Circulo circulo3 = new Circulo(7.8);
        Circulo circulo4 = new Circulo(2.1);
        Circulo circulo5 = new Circulo(9.5);

        List<Circulo> listaDeCirculos = new ArrayList<>();
        listaDeCirculos.add(circulo1);
        listaDeCirculos.add(circulo2);
        listaDeCirculos.add(circulo3);
        listaDeCirculos.add(circulo4);
        listaDeCirculos.add(circulo5);

        System.out.println("Área dos círculos:");
        for (Circulo circulo : listaDeCirculos) {
            double area = circulo.calcularArea();
            System.out.println("Área: " + String.format("%.2f", area));
        }
    }
}