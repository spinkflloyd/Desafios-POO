package poo6_3;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ConjuntoDePalavras {
    private Set<String> palavras;

    public ConjuntoDePalavras(String palavrasSeparadasPorVirgula) {
        this.palavras = new HashSet<>();
        if (palavrasSeparadasPorVirgula != null && !palavrasSeparadasPorVirgula.isEmpty()) {
            String[] palavrasArray = palavrasSeparadasPorVirgula.split(",");
            for (String palavra : palavrasArray) {
                this.palavras.add(palavra.trim());
            }
        }
    }

    public boolean contemTodas(String palavrasParaVerificar) {
        if (palavrasParaVerificar == null || palavrasParaVerificar.isEmpty()) {
            return true;
        }
        String[] palavrasArray = palavrasParaVerificar.split(",");
        for (String palavra : palavrasArray) {
            if (!this.palavras.contains(palavra.trim())) {
                return false;
            }
        }
        return true;
    }

    public Set<String> getPalavras() {
        return this.palavras;
    }
}