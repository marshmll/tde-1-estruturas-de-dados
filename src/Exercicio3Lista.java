import estruturas.Fila;

import java.util.Scanner;

public class Exercicio3Lista {
    public static void main(String[] args) {
        System.out.println("========= EXERCÍCIO 3 COM FILAS DINÂMICAS =========");
        System.out.println("AS FILAS DEVEM SER PREENCHIDAS DE FORMA ORDENADA");

        Fila filaA = new Fila(), filaB = new Fila();
        Scanner sc = new Scanner(System.in);
        int dado = -1;

        do {
            System.out.print("Digite um número para inserir na filaA (-1 para ir para a próxima, -2 para remover): ");
            dado = Integer.parseInt(sc.nextLine());

            if (dado == -1) {
                System.out.println("Indo para a próxima filaA...");
            } else if (dado == -2) {
                System.out.println("Removendo elemento...");
                Integer removido = filaA.remove();

                if (removido != null) System.out.println("Removido elemento " + removido);
                else System.out.println("A filaA está vazia.");
            } else {
                System.out.println("Inserindo elemento " + dado);
                filaA.insere(dado);
                filaA.imprime();
            }
        } while (dado != -1);

        do {
            System.out.print("Digite um número para inserir na filaB (-1 para fazer merge, -2 para remover): ");
            dado = Integer.parseInt(sc.nextLine());

            if (dado == -1) {
                System.out.println("Fazendo merge...");
            } else if (dado == -2) {
                System.out.println("Removendo elemento...");
                Integer removido = filaB.remove();

                if (removido != null) System.out.println("Removido elemento " + removido);
                else System.out.println("A filaB está vazia.");
            } else {
                System.out.println("Inserindo elemento " + dado);
                filaB.insere(dado);
                filaB.imprime();
            }

        } while (dado != -1);

        System.out.println("FILA A");
        filaA.imprime();

        System.out.println("FILA B");
        filaB.imprime();

        Fila filaC = Merge.merge(filaA, filaB);
        System.out.println("FILA C MESCLADA");
        filaC.imprime();
    }
}
