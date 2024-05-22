import java.util.Random;

public class Cliente {
    String nome;
    int idade;
    char sexo;
    String cpf = gerarCPF();
    public Cliente(String nome, int idade, char i) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = i;
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
}
