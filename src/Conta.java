public class Conta {
    private long agencia;
    private Cliente cliente;
    private double saldo;
    private String nome;

    public Conta(long agencia, Cliente cliente, String nome) {
        this.agencia = agencia;
        this.cliente = cliente;
        this.nome = nome;
    }

    public double sacar(double valor){
        return this.saldo-=valor;
    }

    public double depositar(double valor){
        return this.saldo+= valor;
    }

    public void tranferencia(double valor,Conta contarecebida){
        this.sacar(valor);
        contarecebida.depositar(valor);
    }

    
}
