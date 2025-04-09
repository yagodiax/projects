package ex2;

import java.util.Scanner;

public class VistoriaDetran {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número da placa (4 dígitos): ");
        int placa = sc.nextInt();
        int digito = placa % 10;

        switch (digito) {
            case 0: System.out.println("Janeiro do próximo ano"); break;
            case 1: System.out.println("Fevereiro do próximo ano"); break;
            case 2: System.out.println("Março do próximo ano"); break;
            case 3: System.out.println("Abril do próximo ano"); break;
            case 4: System.out.println("Maio do próximo ano"); break;
            case 5: System.out.println("Junho do próximo ano"); break;
            case 6: System.out.println("Setembro deste ano"); break;
            case 7: System.out.println("Outubro deste ano"); break;
            case 8: System.out.println("Novembro deste ano"); break;
            case 9: System.out.println("Dezembro deste ano"); break;
            default: System.out.println("Placa inválida"); break;
        }

        sc.close();
    }
}