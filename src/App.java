public class App {
    public static void main(String[] args) throws Exception {
      Banco banco = new Banco("Itau",4566258 );
        Cliente ronald = new Cliente("ROnald", 45, 'M');
        ronald.gerarCPF();
        Conta contaCorrente = new ContaCorrente(456789, ronald);
        contaCorrente.depositar(500);
        banco.adicionarConta(contaCorrente);
        banco.imprimirContas();
    }
}
