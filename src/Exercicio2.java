import estruturas.Fila;

public class Exercicio2 {
    public static void main(String[] args) {
        System.out.println("========= EXERCÍCIO 2 =========");

        Fila fila = new Fila();

        fila.insere(1);
        fila.insere(2);
        fila.insere(3);
        fila.insere(4);

        fila.imprime();

        fila.remove();
        fila.remove();

        fila.imprime();

        fila.insere(5);

        fila.imprime();
    }
}
