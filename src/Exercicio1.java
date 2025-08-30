import estruturas.Pilha;

public class Exercicio1 {
    public static void main(String[] args) {
        System.out.println("========= EXERCÍCIO 1 =========");

        Pilha pilha = new Pilha();

        pilha.insere(1);
        pilha.insere(2);
        pilha.insere(3);
        pilha.insere(4);

        pilha.imprime();

        pilha.remove();
        pilha.remove();

        pilha.imprime();

        pilha.insere(5);

        pilha.imprime();
    }
}
