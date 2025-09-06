import estruturas.FilaVetor;

import java.util.Scanner;

public class Exercicio3Vetores {
    public static void main(String[] args) {
        System.out.println("========= EXERCÍCIO 3 COM FILAS VETORIAIS =========");
        System.out.println("AS FILAS DEVEM SER PREENCHIDAS DE FORMA ORDENADA");

        Scanner sc = new Scanner(System.in);
        int dado = -1;

        System.out.print("Digite o tamanho da filaA: ");
        int tamanhoFilaA = Integer.parseInt(sc.nextLine());

        System.out.print("Digite o tamanho da filaB: ");
        int tamanhoFilaB = Integer.parseInt(sc.nextLine());

        FilaVetor filaA = new FilaVetor(tamanhoFilaA), filaB = new FilaVetor(tamanhoFilaB);

        do {
            System.out.print("Digite um número para inserir na filaA (-1 para ir para a próxima, -2 para remover): ");
            dado = Integer.parseInt(sc.nextLine());

            if (dado == -1) {
                System.out.println("Indo para a próxima fila...");
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

        } while (dado != -1 && !filaA.cheia());

        System.out.println();

        do {
            System.out.print("Digite um número para inserir na filaB (-1 para fazer merge, -2 para remover): ");
            dado = Integer.parseInt(sc.nextLine());

            if (dado == -1) {
                System.out.println("Indo para a próxima fila...");
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

        } while (dado != -1 && !filaB.cheia());

        System.out.println("=============================================");

        System.out.println("FILA A");
        filaA.imprime();

        System.out.println("FILA B");
        filaB.imprime();

        FilaVetor filaC = Merge.merge(filaA, filaB);
        System.out.println("FILA C MESCLADA");
        filaC.imprime();
    }
}
