package poo4_1;

import java.util.Stack;

public class PilhaDeCaixas {
    private double alturaMaxima;
    private Stack<Caixa> pilha;
    private double alturaAtual;
    private double pesoTotal;

    public PilhaDeCaixas(double alturaMaxima) {
        this.alturaMaxima = alturaMaxima;
        this.pilha = new Stack<>();
        this.alturaAtual = 0;
        this.pesoTotal = 0;
    }

    public double getAlturaMaxima() {
        return alturaMaxima;
    }

    public void setAlturaMaxima(double alturaMaxima) {
        this.alturaMaxima = alturaMaxima;
    }

    public double getAlturaAtual() {
        return alturaAtual;
    }

    public double getPesoTotal() {
        return pesoTotal;
    }

    public boolean empilhar(Caixa caixa) {
        if (alturaAtual + caixa.getAltura() <= alturaMaxima) {
            if (caixa instanceof CaixaFragil) {
                CaixaFragil caixaFragil = (CaixaFragil) caixa;
                for (Caixa c : pilha) {
                    if (c instanceof CaixaFragil) {
                        CaixaFragil cFragil = (CaixaFragil) c;
                        if (pesoTotal > cFragil.getPesoMaximoSuportado()) {
                            return false; 
                        }
                    }
                }
                if (pesoTotal > caixaFragil.getPesoMaximoSuportado()) {
                    return false; 
                }
            }
            pilha.push(caixa);
            alturaAtual += caixa.getAltura();
            pesoTotal += caixa.getPeso();
            return true;
        }
        return false; 
    }

    public Caixa desempilhar() {
        if (pilha.isEmpty()) {
            System.out.println("A pilha está vazia. Não há caixas para desempilhar.");
            return null;
        }
        Caixa caixa = pilha.pop();
        alturaAtual -= caixa.getAltura();
        pesoTotal -= caixa.getPeso();
        return caixa;
    }

    public void exibirPilha() {
        System.out.println("--- Pilha de Caixas ---");
        for (int i = pilha.size() - 1; i >= 0; i--) {
            pilha.get(i).exibirEtiqueta();
            System.out.println("---");
        }
        System.out.println("Altura Total da Pilha: " + alturaAtual + " cm");
        System.out.println("Peso Total da Pilha: " + pesoTotal + " kg");
    }
}