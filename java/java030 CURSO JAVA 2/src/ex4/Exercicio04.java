package ex4;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        if ((a + b > c) && (a + c > b) && (b + c > a)) {
            System.out.println("Os lados formam um triângulo.");
        } else {
            System.out.println("Os valores informados não podem formar um triângulo.");
        }

        scanner.close();
    }
}
