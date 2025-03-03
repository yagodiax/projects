package java009.media;

import java.util.Scanner;

public class Java009Media {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite a Primeira Nota: ");
        float n1 = teclado.nextFloat();
        System.out.print("Digite a Segunda Nota: ");
        float n2 = teclado.nextFloat();
        float m = (n1 + n2)/2;
        System.out.println("A sua media e: " + m);
        if (m>6) {
            System.out.println("Parabens pela sua Nota!");
        }
        else {
            System.out.println("Estude mais da proxima vez!");
        }
    }
    
}
