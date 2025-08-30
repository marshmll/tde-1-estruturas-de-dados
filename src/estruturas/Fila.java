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
    public void remove() {
        if (this.tamanho > 0) {
            this.frente = this.frente.getProximo();

            this.tamanho--;
        } else System.out.println("A fila está vazia.");
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
