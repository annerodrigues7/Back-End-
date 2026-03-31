public class ContaPoupanca extends Conta {

    public ContaPoupanca(int numero, String agencia, String titular) {
        super(numero, agencia, titular);
    }

    public double calcularTarifaMensal() {
        return 0.0;
    }
}

