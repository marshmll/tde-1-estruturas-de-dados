import estruturas.FilaVetor;

public class Exercicio3Vetores {
    public static void main(String[] args) {
        System.out.println("========= EXERCÍCIO 3 COM FILAS DE VETORES =========");

        FilaVetor filaA = new FilaVetor(4);
        filaA.insere(12);
        filaA.insere(35);
        filaA.insere(52);
        filaA.insere(64);

        FilaVetor filaB = new FilaVetor(5);
        filaB.insere(5);
        filaB.insere(15);
        filaB.insere(23);
        filaB.insere(55);
        filaB.insere(75);

        System.out.println("FILA A");
        filaA.imprime();

        System.out.println("FILA B");
        filaB.imprime();

        FilaVetor filaC = Merge.mergeFilaVetorOrdenado(filaA, filaB);
        System.out.println("FILA C MESCLADA");
        filaC.imprime();
    }
}
