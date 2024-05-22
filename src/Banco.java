import java.util.ArrayList;
import java.util.List;

public class Banco {
    private String nome;
    private final long CNPJ;
    private List<Conta> contas;

    public Banco(String nome, long CNPJ) {
        this.nome = nome;
        this.CNPJ = CNPJ;
        this.contas = new ArrayList<>();
    }

    public void adicionarConta(Conta conta) {
        contas.add(conta);
    }

    public void imprimirContas() {
        for (Conta conta : contas) {
            System.out.println(conta);
        }
    }

    @Override
    public String toString() {
        return "Banco nome: " + nome + ", CNPJ: " + CNPJ;
    }
}