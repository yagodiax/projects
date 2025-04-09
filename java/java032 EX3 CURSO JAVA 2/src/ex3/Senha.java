package ex3;

import java.util.Scanner;

public class Senha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int senha;

        do {
            System.out.print("Digite a senha: ");
            senha = sc.nextInt();
        } while (senha != 1234);

        System.out.println("Senha correta, acesso liberado.");

        sc.close();
    }
}