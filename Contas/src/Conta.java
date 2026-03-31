public abstract class Conta {

        int numero;
        String agencia;
        String titular;
        double saldo;

        public Conta(int numero, String agencia, String titular) {
            this.numero = numero;
            this.agencia = agencia;
            this.titular = titular;
            this.saldo = 0;
        }

        public void depositar(double valor) {
            saldo += valor;
            System.out.println("Depositou: " + valor);
        }

        public void sacar(double valor) {
            if (saldo >= valor) {
                saldo -= valor;
                System.out.println("Sacou: " + valor);
            } else {
                System.out.println("Saldo insuficiente");
            }
        }

        public void exibirSaldo() {
            System.out.println("Saldo: " + saldo);
        }

        // método que será diferente em cada conta
        public abstract double calcularTarifaMensal();
    }

