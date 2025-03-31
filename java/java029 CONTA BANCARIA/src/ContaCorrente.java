public class ContaCorrente extends ContaBancaria {
    private double limite;

    public ContaCorrente(String numeroConta, double limite) {
        super(numeroConta);
        this.limite = limite;
    }

    @Override
    public boolean sacar(double valor) {
        if (valor > 0 && (saldo + limite) >= valor) {
            saldo -= valor;
            return true;
        }
        return false;
    }

    @Override
    public void aplicarJuros() {
        // Conta Corrente não tem juros
    }
}