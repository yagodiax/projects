package ex5;

import java.util.Scanner;

public class MenuOpcoes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao;

        System.out.println("Menu de opções:");
        System.out.println("1. Somar dois números");
        System.out.println("2. Número ao quadrado");
        System.out.print("Digite a opção: ");
        opcao = sc.nextInt();

        switch (opcao) {
            case 1:
                System.out.print("Primeiro número: ");
                int n1 = sc.nextInt();
                System.out.print("Segundo número: ");
                int n2 = sc.nextInt();
                System.out.println("Soma: " + (n1 + n2));
                break;

            case 2:
                System.out.print("Número: ");
                int n = sc.nextInt();
                System.out.println("Quadrado: " + (n * n));
                break;

            default:
                System.out.println("Opção inválida.");
        }

        sc.close();
    }
}
