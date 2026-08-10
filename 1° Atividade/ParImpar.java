package Poo;

import java.util.ArrayList;
import java.util.Random;

public class ParImpar {
    public static void main(String[] args) {
        Random random = new Random();
        int[] numeros = new int[20];
        ArrayList<Integer> pares = new ArrayList<>();
        ArrayList<Integer> impares = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            numeros[i] = random.nextInt(50) + 1;
            if (numeros[i] % 2 == 0) {
                pares.add(numeros[i]);
            } else {
                impares.add(numeros[i]);
            }
        }

        System.out.println("Array completo: ");
        exibirArray(numeros);

        System.out.println("Números pares: ");
        exibirArrayList(pares);
        System.out.println("Quantidade de pares: " + pares.size());

        System.out.println("Números ímpares: ");
        exibirArrayList(impares);
        System.out.println("Quantidade de ímpares: " + impares.size());
    }

    public static void exibirArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void exibirArrayList(ArrayList<Integer> list) {
        for (int num : list) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
