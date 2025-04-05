package ex9;

import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double salario = scanner.nextDouble();

        if (salario < 5000) {
            double reajustado = salario * 1.30;
            System.out.println("Salário reajustado: R$ " + reajustado);
        } else {
            System.out.println("Salário sem reajuste: R$ " + salario);
        }

        scanner.close();
    }
}
