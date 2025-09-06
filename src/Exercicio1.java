import estruturas.Pilha;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        System.out.println("========= EXERCÍCIO 1 =========");

        Pilha pilha = new Pilha();
        Scanner sc = new Scanner(System.in);
        int dado = -1;

        do {
            System.out.print("Digite um número para inserir na pilha (-1 para sair, -2 para remover): ");
            dado = Integer.parseInt(sc.nextLine());

            if (dado == -1) {
                System.out.println("Saindo...");
            } else if (dado == -2) {
                System.out.println("Removendo elemento...");
                Integer removido = pilha.remove();

                if (removido != null) System.out.println("Removido elemento " + removido);
                else System.out.println("A pilha está vazia.");
            } else {
                System.out.println("Inserindo elemento " + dado);
                pilha.insere(dado);
            }

            pilha.imprime();
        } while (dado != -1);

        sc.close();
    }
}
