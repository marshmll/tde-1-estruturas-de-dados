import estruturas.Fila;

public class Exercicio3Lista {
    public static void main(String[] args) {
        System.out.println("========= EXERCÍCIO 3 COM FILAS DINÂMICAS =========");

        Fila filaA = new Fila();
        filaA.insere(12);
        filaA.insere(35);
        filaA.insere(52);
        filaA.insere(64);

        Fila filaB = new Fila();
        filaB.insere(5);
        filaB.insere(15);
        filaB.insere(23);
        filaB.insere(55);
        filaB.insere(75);

        System.out.println("FILA A");
        filaA.imprime();

        System.out.println("FILA B");
        filaB.imprime();

        Fila filaC = Merge.mergeFilaDinamicaOrdenado(filaA, filaB);
        System.out.println("FILA C MESCLADA");
        filaC.imprime();
    }
}
