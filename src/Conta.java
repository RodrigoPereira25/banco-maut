public class Conta {

    private int agencia;
    private int numero;
    protected double saldo;
    private Cliente nomeCliente;

    private static int quantidadeContas;

    // Construindo objetos da classe Conta
    public Conta(int agencia, int numero, double saldo, Cliente nomeCliente) {
        this.agencia = agencia;
        this.numero = numero;
        this.saldo = saldo;
        this.nomeCliente = nomeCliente;
        quantidadeContas = quantidadeContas + 1;
    }

    // Método Deposita
    public void deposita(double valor) {
        if (valor > 0) {
            this.saldo = this.saldo + valor;
            System.out.println("Depósito realizado com sucesso! Valor do depósito R$:" + valor);
            this.enviaNotificacao("Depósito", valor);
        } else {
            System.out.println(
                    "Não é possível efetuar esta operação! Só é possível depositar valores acima deste valor: R$0.0");
        }
    }

    // Método Saca
    public boolean saca(double valor) {
        return false;
    }

    // Método Transfere
    public void transfere(double valor, Conta contaDestino) {
        System.out.println("Transferindo valor solicitado...");
        boolean saqueComSucesso = this.saca(valor);
        if (saqueComSucesso) {
            contaDestino.deposita(valor);
            this.enviaNotificacao("Transferência", valor);
        }
    }

    // Métodos de Manipulação de atributos
    protected void enviaNotificacao(String operacao, double valor) {
        new Notificacao().enviaEmail(operacao, valor);
    }

    public int getAgencia() {
        return this.agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public Cliente getnomeCliente() {
        return nomeCliente;
    }

    public int getQuantidadeContas() {
        return quantidadeContas;
    }

}