public class Main {
    public static void main(String[] args) {

        Conta cc = new ContaCorrente(1, "001", "Erick");
        Conta cp = new ContaPoupanca(2, "001", "Maria");
        Conta pj = new ContaJuridica(3, "001", "Empresa");

        System.out.println("=== Conta Corrente ===");
        cc.depositar(500);
        cc.sacar(100);
        cc.exibirSaldo();
        System.out.println("Tarifa: " + cc.calcularTarifaMensal());

        System.out.println("\n=== Conta Poupança ===");
        cp.depositar(1000);
        cp.sacar(200);
        cp.exibirSaldo();
        System.out.println("Tarifa: " + cp.calcularTarifaMensal());

        System.out.println("\n=== Conta PJ ===");
        pj.depositar(2000);
        pj.sacar(300);
        pj.exibirSaldo();
        System.out.println("Tarifa: " + pj.calcularTarifaMensal());
    }
}