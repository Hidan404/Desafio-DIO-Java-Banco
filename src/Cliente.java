import java.util.Random;

public class Cliente {
    private String nome;
    private int idade;
    private char sexo;
    private String cpf;

    public Cliente(String nome, int idade, char sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.cpf = gerarCPF();
    }

    public static String gerarCPF() {
        Random random = new Random();
        String cpf = "";
        int numero;

        for (int i = 0; i < 9; i++) {
            numero = random.nextInt(10);
            cpf += Integer.toString(numero);
        }

        return cpf;
    }

    @Override
    public String toString() {
        return "Cliente nome: " + nome + ", idade: " + idade + ", sexo: " + sexo + ", cpf: " + cpf;
    }
}