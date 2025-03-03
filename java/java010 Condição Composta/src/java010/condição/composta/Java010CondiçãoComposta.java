package java010.condição.composta;

import java.util.Scanner;

public class Java010CondiçãoComposta {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o Ano em que voce Nasceu: ");
        int nasc = teclado.nextInt();
        int idade = 2025 - nasc;
        System.out.println("Voce tem " + idade + " Anos");
        if (idade >= 18) {
            System.out.println("Voce e Maior de Idade");
        } 
        else {
            System.out.println("Voce e Menor de Idade");
        }
    }
    
}
