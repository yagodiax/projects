package ex3;

import java.util.Scanner;

public class CalculoDelta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor de A: ");
        double a = scanner.nextDouble();

        System.out.print("Digite o valor de B: ");
        double b = scanner.nextDouble();

        System.out.print("Digite o valor de C: ");
        double c = scanner.nextDouble();

        double delta = (b * b) - (4 * a * c);

        System.out.println("Delta = " + delta);

        if (delta < 0) {
            System.out.println("A equação não possui raízes reais.");
        } else if (delta == 0) {
            System.out.println("A equação possui uma única raiz real.");
        } else {
            System.out.println("A equação possui duas raízes reais.");
        }

        scanner.close();
    }
}