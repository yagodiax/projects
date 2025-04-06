package ex4;

import java.util.Scanner;

public class MediaIdades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int idade, soma = 0, count = 0;

        do {
            System.out.print("Digite uma idade (0 para sair): ");
            idade = sc.nextInt();
            if (idade != 0) {
                soma += idade;
                count++;
            }
        } while (idade != 0);

        if (count > 0) {
            double media = (double) soma / count;
            System.out.println("Média das idades: " + media);
        } else {
            System.out.println("Nenhuma idade válida foi informada.");
        }
    }
}
