import estruturas.Fila;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        System.out.println("========= EXERCÍCIO 2 =========");

        Fila fila = new Fila();
        Scanner sc = new Scanner(System.in);
        int dado = -1;

        do {
            System.out.print("Digite um número para inserir na fila (-1 para sair, -2 para remover): ");
            dado = Integer.parseInt(sc.nextLine());

            if (dado == -1) {
                System.out.println("Saindo...");
            } else if (dado == -2) {
                System.out.println("Removendo elemento...");
                Integer removido = fila.remove();

                if (removido != null) System.out.println("Removido elemento " + removido);
                else System.out.println("A fila está vazia.");
            } else {
                System.out.println("Inserindo elemento " + dado);
                fila.insere(dado);
            }

            fila.imprime();
        } while (dado != -1);

        sc.close();
    }
}
