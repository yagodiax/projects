package ex10;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double lab = scanner.nextDouble();
        double av = scanner.nextDouble();
        double exame = scanner.nextDouble();

        double media = (lab * 2 + av * 3 + exame * 5) / 10;

        System.out.println("Média ponderada: " + media);

        if (media >= 8 && media <= 10) {
            System.out.println("Conceito: A");
        } else if (media >= 7) {
            System.out.println("Conceito: B");
        } else if (media >= 6) {
            System.out.println("Conceito: C");
        } else if (media >= 5) {
            System.out.println("Conceito: D");
        } else {
            System.out.println("Conceito: E");
        }

        scanner.close();
    }
}
