public class ContaJuridica extends Conta {

    public ContaJuridica(int numero, String agencia, String titular) {
        super(numero, agencia, titular);
    }

    @Override
    public void sacar(double valor) {
        double taxa = 1.50;
        double total = valor + taxa;

        if (saldo >= total) {
            saldo -= total;
            System.out.println("Sacou: " + valor + " (taxa 1.50)");
        } else {
            System.out.println("Saldo insuficiente");
        }
    }

    public double calcularTarifaMensal() {
        return 20.0;
    }
}