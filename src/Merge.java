import estruturas.Fila;
import estruturas.FilaVetor;

public final class Merge {
    private Merge() {}

    public static FilaVetor merge(FilaVetor filaA, FilaVetor filaB) {
        FilaVetor filaC = new FilaVetor(filaA.getCapacidade() + filaB.getCapacidade());

        while (!filaA.vazia() && !filaB.vazia()) {
            if (filaA.getFrente() <= filaB.getFrente()) {
                filaC.insere(filaA.getFrente());
                filaA.remove();
            } else {
                filaC.insere(filaB.getFrente());
                filaB.remove();
            }
        }

        while (!filaA.vazia()) {
            filaC.insere(filaA.getFrente());
            filaA.remove();
        }

        while (!filaB.vazia()) {
            filaC.insere(filaB.getFrente());
            filaB.remove();
        }

        return filaC;
    }

    public static Fila merge(Fila filaA, Fila filaB) {
        Fila filaC = new Fila();

        while (filaA.getFrente() != null && filaB.getFrente() != null) {
            if (filaA.getFrente().getDado() <= filaB.getFrente().getDado()) {
                filaC.insere(filaA.getFrente().getDado());
                filaA.remove();
            }
            else {
                filaC.insere(filaB.getFrente().getDado());
                filaB.remove();
            }
        }

        while (filaA.getFrente() != null) {
            filaC.insere(filaA.getFrente().getDado());
            filaA.remove();
        }

        while (filaB.getFrente() != null) {
            filaC.insere(filaB.getFrente().getDado());
            filaB.remove();
        }

        return filaC;
    }
}