import java.util.Scanner;

public class ContaCorrente extends Conta {

    private double limite;

    public ContaCorrente(int numero, String nome, double saldo, String senha, double limite) {
        super(numero, nome, saldo, senha);
        this.limite = limite;
    }

    public double getLimite() {
        return this.limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    @Override
    public void sacar(double valor) {
        if (valor > 0 && valor <= this.getSaldo() + this.getLimite()) {
            double novoSaldo = this.getSaldo() - valor;
            if (novoSaldo >= 0) {
                this.setSaldo(novoSaldo);
                System.out.println("Saque efetuado com sucesso. Novo saldo: " + this.getSaldo());
            } else {
                System.out.println("Saldo insuficiente. Tente novamente.");
            }
        } else {
            System.out.println("Valor de saque inválido. Tente novamente.");
        }
    }
    

    @Override
    public void atualizar(double taxa) {
       
    }
}
