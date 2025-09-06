package estruturas;

public class FilaVetor {
    private final int[] dados;
    private final int capacidade;
    private int tamanho;
    private int frente;
    private int atras;

    public FilaVetor(int capacidade) {
        this.capacidade = capacidade;
        this.tamanho = 0;
        this.dados = new int[capacidade];
        this.frente = -1;
        this.atras = -1;
    }

    public void insere(int dado) {
        if (this.tamanho < capacidade) {
            if (this.frente == -1 && this.atras == -1) {
                this.frente = 0;
                this.atras = 0;
                this.dados[atras] = dado;
            } else {
                this.atras = (this.atras + 1) % this.capacidade;
                this.dados[atras] = dado;
            }

            this.tamanho++;
        }
    }

    public Integer remove() {
        Integer dado = null;

        if (this.tamanho > 0) {
            dado = this.dados[this.frente];

            this.frente = (this.frente + 1) % this.capacidade;
            this.tamanho--;
        }

        return dado;
    }

    public boolean vazia() {
        return this.tamanho == 0;
    }

    public boolean cheia() { return  this.tamanho >= this.capacidade; }

    public void imprime() {
        System.out.print("FRENTE -> [");
        for (int i = 0; i < this.tamanho; i++) {
            System.out.print(this.dados[i]);

            if (i != (this.tamanho - 1)) {
                System.out.print(", ");
            }
        }
        System.out.println("] <- ATRÁS");
    }

    public int getFrente() {
        if (this.tamanho > 0) {
            return this.dados[this.frente];
        }

        return -1; // Não há próximo
    }

    public int getCapacidade() {
        return this.capacidade;
    }
}
