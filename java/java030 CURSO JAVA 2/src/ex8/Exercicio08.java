package ex8;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int menor = a;
        if (b < menor) menor = b;
        if (c < menor) menor = c;

        System.out.println("Menor valor: " + menor);

        scanner.close();
    }
}
