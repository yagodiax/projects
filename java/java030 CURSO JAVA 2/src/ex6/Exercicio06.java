package ex6;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= 4; i++) {
            int valor = scanner.nextInt();
            if (valor % 2 == 0 || valor % 3 == 0) {
                System.out.println(valor + " é divisível por 2 ou 3.");
            }
        }

        scanner.close();
    }
}
