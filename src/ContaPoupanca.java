public class ContaPoupanca extends Conta {

    private double rendimento;

    public ContaPoupanca(int agencia, int numero, double saldo, Cliente nomeCliente) {
        super(agencia, numero, saldo, nomeCliente);
        this.rendimento = 0.02;
    }

    public void setRendimento(double rendimento) {
        this.rendimento = rendimento;

    }

    public double getRendimento() {
        return rendimento;
    }

    @Override
    public boolean saca(double valor) {
        if (valor > 0 && valor <= super.saldo) {
            super.saldo = this.saldo - valor;
            System.out.println("Saque realizado com sucesso! Valor do saque solicitado R$:" + valor);
            super.enviaNotificacao("Saque", valor);
            return true;
        } else {
            System.out.println("Você não possui saldo suficente! Valor do saque solicitado: R$" + valor);
            return false;
        }
    }
}