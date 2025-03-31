public class BancoDigital {
    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaCorrente("12345", 1000);
        ContaBancaria conta2 = new ContaPoupanca("67890");

        conta1.depositar(500);
        conta2.depositar(1000);

        System.out.println("Saldo conta corrente: " + conta1.consultarSaldo());
        System.out.println("Saldo conta poupança: " + conta2.consultarSaldo());

        conta1.transferir(conta2, 200);

        System.out.println("Saldo conta corrente após transferência: " + conta1.consultarSaldo());
        System.out.println("Saldo conta poupança após transferência: " + conta2.consultarSaldo());

        conta2.aplicarJuros();
        System.out.println("Saldo conta poupança após juros: " + conta2.consultarSaldo());
    }
}
