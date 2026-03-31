public class ContaCorrente extends Conta {

    public ContaCorrente(int numero, String agencia, String titular) {
        super(numero, agencia, titular);
    }

    public double calcularTarifaMensal() {
        return 12.0;
    }
}