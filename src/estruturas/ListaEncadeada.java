package estruturas;

public abstract class ListaEncadeada {
    protected Node atras;
    protected int tamanho;

    public ListaEncadeada() {
        this.atras = null;
        this.tamanho = 0;
    }

    public abstract void insere(int dado);

    public abstract Integer remove();
}
