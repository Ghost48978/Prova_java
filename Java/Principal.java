import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);

        ContaCorrente cc1 = new ContaCorrente(1, "Julio", 1000, "1234", 1000);
        ContaPoupanca cp1 = new ContaPoupanca(2, "Cris", 1000, "1234", 10);

        System.out.println("Bem-vindo!");

        int tentativas = 3;
        while (tentativas > 0) {
            System.out.print("Digite o número da conta: ");
            int numeroConta = Scanner.nextInt();

            System.out.print("Digite a senha: ");
            String senhaConta = Scanner.next();

            if (cc1.getNumero() == numeroConta && cc1.verificarSenha(senhaConta)) {
                realizarOperacoes(cc1);
                break;
            } else if (cp1.getNumero() == numeroConta && cp1.verificarSenha(senhaConta)) {
                realizarOperacoes(cp1);
                break;
            } else {
                System.out.println("Número da conta ou senha incorretos. Tente novamente.");
                tentativas--;
            }
        }

        System.out.println("Programa encerrado.");
    }

    /**
     * @param conta
     */
    private static void realizarOperacoes(Conta conta) {
        int escolha;

        do {
            System.out.println("Selecione a operação:");
            System.out.println("1. Sacar");
            System.out.println("2. Depositar");
            System.out.println("3. Sair");

            escolha = new Scanner(System.in).nextInt();

            switch (escolha) {
                case 1:
                    System.out.print("Digite o valor para sacar: ");
                    double valorSaque = new Scanner(System.in).nextDouble();
                    conta.sacar(valorSaque);
                    break;
                case 2:
                    System.out.print("Digite o valor para depositar: ");
                    double valorDeposito = new Scanner(System.in).nextDouble();
                    conta.depositar(valorDeposito);
                    break;
                case 3:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }



        } while (escolha != 3);
    }
}
