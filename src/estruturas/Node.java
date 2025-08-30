package estruturas;

public class Node {
    private Integer dado;
    private Node proximo;

    public Node() {
        this.dado = null;
        this.proximo = null;
    }

    public Node(int dado) {
        this.dado = dado;
        this.proximo = null;
    }

    public Integer getDado() {
        return this.dado;
    }

    public void setDado(int dado) {
        this.dado = dado;
    }

    public Node getProximo() {
        return this.proximo;
    }

    public void setProximo(Node proximo) {
        this.proximo = proximo;
    }
}
