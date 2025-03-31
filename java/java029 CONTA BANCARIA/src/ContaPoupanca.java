public class ContaPoupanca extends ContaBancaria {
    private static final double TAXA_JUROS = 0.05;

    public ContaPoupanca(String numeroConta) {
        super(numeroConta);
    }

    @Override
    public void aplicarJuros() {
        saldo += saldo * TAXA_JUROS;
    }
}
