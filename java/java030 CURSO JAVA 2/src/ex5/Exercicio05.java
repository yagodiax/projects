package ex5;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= 4; i++) {
            int valor = scanner.nextInt();
            if (valor % 2 == 0 && valor % 3 == 0) {
                System.out.println(valor + " é divisível por 2 e 3.");
            }
        }

        scanner.close();
    }
}