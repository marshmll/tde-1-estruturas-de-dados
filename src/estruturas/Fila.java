package estruturas;

public class Fila extends ListaEncadeada {
    private Node frente;

    public Fila() {
        super();
        this.frente = null;
    }


    @Override
    public void insere(int dado) {
        Node novoNode = new Node(dado);

        if (this.tamanho == 0) {
            this.atras = novoNode;
            this.frente = novoNode;
        } else {
            this.atras.setProximo(novoNode);
            this.atras = novoNode;
        }

        this.tamanho++;
    }

    @Override
    public Integer remove() {
        Integer dado = null;

        if (this.tamanho > 0) {
            dado = frente.getDado();
            this.frente = this.frente.getProximo();
            this.tamanho--;
        }

        return dado;
    }

    public void imprime() {
        System.out.print("FRENTE -> [");
        for (Node n = this.frente; n != null; n = n.getProximo()) {
            System.out.print(n.getDado());
            if (n.getProximo() != null) System.out.print(", ");
        }
        System.out.println("] <- ATRÁS");
    }

    public Node getFrente() {
        if (this.tamanho > 0) {
            return this.frente;
        }

        return null;
    }
}
