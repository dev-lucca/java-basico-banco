import java.util.Scanner;

public class AberturaConta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Mensagem de abertura de conta
        System.out.println(" Abertura de Conta ");

        // Solicitar informações do cliente
        System.out.println("Bem-vindo ao nosso banco!");
        System.out.println("Por favor, insira as seguintes informações para abrir sua conta:");

        System.out.print("nome: ");
        String nome = scanner.nextLine();

        System.out.print("CPF: 123.456.789.58");
        String cpf = scanner.nextLine();

        System.out.print("Data de Nascimento (18/05/2000): ");
        String dataNascimento = scanner.nextLine();

        System.out.print("Endereço: Rua da Travessa, 1528 ");
        String endereco = scanner.nextLine();

        // Solicitar saldo inicial
        System.out.print("Saldo inicial: 512,00");
        double saldoInicial = scanner.nextDouble();

        // Solicitar valor disponível para saque
        System.out.print("Valor disponível para saque: 150,00 ");
        double valorDisponivelSaque = scanner.nextDouble();

        // Gerar número de conta aleatório
        String numeroConta = gerarNumeroConta();

        // Criar a conta
        ContaBancaria conta = new ContaBancaria(nome, cpf, dataNascimento, endereco, numeroConta, saldoInicial, valorDisponivelSaque);

        // Mostrar informações da conta
        System.out.println("\nSua conta foi criada com sucesso!");
        System.out.println("Detalhes da Conta:");
        System.out.println(conta);
        
        scanner.close();
    }

    // Método para gerar número de conta aleatório
    private static String gerarNumeroConta() {
        StringBuilder numeroConta = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            numeroConta.append((int) (Math.random() * 10));
        }
        return numeroConta.toString();
    }
}

class ContaBancaria {
    private String nome;
    private String cpf;
    private String dataNascimento;
    private String endereco;
    private String numeroConta;
    private double saldo;
    private double valorDisponivelSaque;

    // Construtor
    public ContaBancaria(String nome, String cpf, String dataNascimento, String endereco, String numeroConta, double saldo, double valorDisponivelSaque) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.endereco = endereco;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.valorDisponivelSaque = valorDisponivelSaque;
    }

    // Método toString para imprimir detalhes da conta
    @Override
    public String toString() {
        return "Nome: " + nome + "\nCPF: " + cpf + "\nData de Nascimento: " + dataNascimento + "\nEndereço: " + endereco
                + "\nNúmero da Conta: " + numeroConta + "\nSaldo: " + saldo + "\nValor Disponível para Saque: " + valorDisponivelSaque;
    }
}
