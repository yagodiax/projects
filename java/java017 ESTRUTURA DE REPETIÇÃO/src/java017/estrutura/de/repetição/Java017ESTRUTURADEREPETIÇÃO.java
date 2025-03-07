package java017.estrutura.de.repetição;

import java.util.Scanner;

public class Java017ESTRUTURADEREPETIÇÃO {

    public static void main(String[] args) {
        int n, s=0;
        String resp;
        Scanner teclado = new Scanner(System.in); 
        do {
            System.out.print("Digite um Numero: ");
            n = teclado.nextInt();
            s += n;
            System.out.println("Quer Continuar? [S/N] ");
            resp = teclado.next();
        } while (resp.equals("S"));
        System.out.println("A Soma de todos os Valores é " + s);
    }
    
}
