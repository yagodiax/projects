package ex1;

import java.util.Scanner;

public class SomaDezNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int soma = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite o " + i + "º número: ");
            int num = sc.nextInt();
            soma += num;
        }

        System.out.println("A soma é: " + soma);
    }
}
