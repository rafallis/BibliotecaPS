package biblioteca;

import java.util.LinkedList;

public class Acervo {

    private LinkedList<Impresso> impressos;

    public LinkedList<Impresso> getImpressos() {
        return impressos;
    }

    public void setImpressos(LinkedList<Impresso> impressos) {
        this.impressos = impressos;
    }
}
