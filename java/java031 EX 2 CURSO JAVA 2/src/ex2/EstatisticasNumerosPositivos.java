package ex2;

import java.util.Scanner;

public class EstatisticasNumerosPositivos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um valor para n: ");
        int n = sc.nextInt();

        int soma = 0, somaQuadrados = 0;

        for (int i = 1; i <= n; i++) {
            soma += i;
            somaQuadrados += i * i;
        }

        double media = (double) soma / n;

        System.out.println("Somatório: " + soma);
        System.out.println("Soma dos quadrados: " + somaQuadrados);
        System.out.println("Média: " + media);
    }
}
