package ex7;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int maior = a;
        if (b > maior) maior = b;
        if (c > maior) maior = c;

        System.out.println("Maior valor: " + maior);

        scanner.close();
    }
}
