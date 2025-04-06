package ex6;

import java.util.Scanner;

public class FaturamentoArmazem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantas mercadorias? ");
        int n = sc.nextInt();

        double faturamentoTotal = 0;

        for (int i = 1; i <= n; i++) {
            sc.nextLine();
            System.out.print("Nome da mercadoria " + i + ": ");
            String nome = sc.nextLine();
            System.out.print("Preço unitário: ");
            double preco = sc.nextDouble();
            System.out.print("Quantidade vendida: ");
            int quantidade = sc.nextInt();

            double total = preco * quantidade;
            faturamentoTotal += total;
        }

        System.out.println("Faturamento total do armazém: R$ " + faturamentoTotal);
    }
}
