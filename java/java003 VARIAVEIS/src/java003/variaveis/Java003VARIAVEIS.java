package java003.variaveis;

import java.util.Scanner;

public class Java003VARIAVEIS {
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o nome do Aluno: ");
        String nome = teclado.nextLine();
        System.out.print("Digite a nota do Aluno: ");
        float nota  = teclado.nextFloat();
        System.out.format("A nota de %s é igual a: %.2f \n", nome, nota);
    }
    
}