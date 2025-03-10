package contabanco;

import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        int Numero;
        String Agencia;
        String NomeCliente;
        float Saldo;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Por favor, digite o número da Agência ! ");
        Numero = teclado.nextInt();
        teclado.nextLine();
        
        System.out.print("Por favor, digite o nome da Agência ! ");
        Agencia = teclado.nextLine();
        
        System.out.print("Por favor, digite seu Nome ! ");
        NomeCliente = teclado.nextLine();
        
        System.out.print("Por favor, digite seu Saldo ! ");
        Saldo = teclado.nextFloat();
        teclado.nextLine();
        
        System.out.println("\nOlá " + NomeCliente + ", obrigado por criar uma conta em nosso banco, " +
                "sua agência é " + Agencia + ", conta " + Numero + " e seu saldo " + Saldo + 
                " já está disponível para saque.");
    }
    
}