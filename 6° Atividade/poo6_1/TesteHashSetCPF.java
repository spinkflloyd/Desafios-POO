package poo6_1;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class TesteHashSetCPF {
    public static void main(String[] args) {
        Set<String> cpfs = new HashSet<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite 10 CPFs:");
        for (int i = 0; i < 10; i++) {
            System.out.print("CPF " + (i + 1) + ": ");
            String cpf = scanner.nextLine();
            cpfs.add(cpf);
        }

        System.out.println("\nDigite mais alguns CPFs (incluindo alguns repetidos para teste):");
        for (int i = 0; i < 3; i++) { 
            System.out.print("CPF de teste " + (i + 1) + ": ");
            String cpfTeste = scanner.nextLine();
            cpfs.add(cpfTeste);
        }

        System.out.println("\nConteúdo do HashSet de CPFs:");
        for (String cpf : cpfs) {
            System.out.println(cpf);
        }

        scanner.close();
    }
}