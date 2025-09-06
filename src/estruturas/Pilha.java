package estruturas;

public class Pilha extends ListaEncadeada {
    public Pilha() {
        super();
    }

    @Override
    public void insere(int dado) {
        if (this.atras == null) {
            this.atras = new Node(dado);
        } else {
            Node novoNode = new Node(dado);
            novoNode.setProximo(this.atras);
            this.atras = novoNode;
        }

        this.tamanho++;
    }

    @Override
    public Integer remove() {
        Integer dado = null;

        if (this.tamanho > 0) {
            dado = this.atras.getDado();

            this.tamanho--;
            this.atras = this.atras.getProximo();
        }

        return dado;
    }

    public void imprime() {
        System.out.print("[");
        this.iterarEImprimir(this.atras);
        System.out.println("] <- TOPO");
    }

    // Imprime recursivamente a lista do último da lista (primeiro a ser inserido)
    // para o primeiro da lista (último a ser inserido).
    private void iterarEImprimir(Node node) {
        if (node == null) return;

        if (node.getProximo() != null) {
            iterarEImprimir(node.getProximo());
        }

        System.out.print(node.getDado());
        if (node != this.atras) {
            System.out.print(", ");
        }
    }
}
