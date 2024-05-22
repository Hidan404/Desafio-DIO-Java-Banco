public class Conta {
    private long agencia;
    private Cliente cliente;
    private double saldo;

    public Conta(long agencia, Cliente cliente) {
        this.agencia = agencia;
        this.cliente = cliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public double sacar(double valor){
        if (saldo >= valor) {
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente para saque");
        }
        return saldo;
    }

    public double depositar(double valor){
        saldo += valor;
        return saldo;
    }

    public void tranferencia(double valor, Conta contaRecebida){
        if (saldo >= valor) {
            sacar(valor);
            contaRecebida.depositar(valor);
        } else {
            throw new RuntimeException("Saldo insuficiente para executar esta transação");
        }
    }

    @Override
    public String toString() {
        return "Conta agencia: " + agencia + ", cliente: " + cliente + ", saldo: " + saldo;
    }
}