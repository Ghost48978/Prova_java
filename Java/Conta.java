import java.util.Scanner;

public abstract class Conta {
    private int numero;
    private String nome;
    private double saldo;
    private String senha;

    public Conta(int numero, String nome, double saldo, String senha) {
        this.numero = numero;
        this.nome = nome;
        this.saldo = saldo;
        this.senha = senha;
    }

    public int getNumero() {
        return this.numero;
    }

    public String getNome() {
        return this.nome;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public String getSenha() {
        return senha;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void depositar(double valor) {
        this.saldo += valor;
    }

    public boolean verificarSenha(String senha) {
        return this.senha.equals(senha);
    }

    public void sacar(double valor) {
        if (valor > 0 && valor <= this.saldo) {
            this.saldo -= valor;
            System.out.println("Saque efetuado com sucesso. Novo saldo: " + this.saldo);
        } else {
            System.out.println("Saldo insuficiente ou valor de saque inválido. Tente novamente.");
        }
    }
    

    public abstract void atualizar(double taxa);

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número da conta: ");
        int numeroConta = scanner.nextInt();

        System.out.print("Digite a senha: ");
        String senhaConta = scanner.next();
    }

    
}
