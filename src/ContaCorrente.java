public class ContaCorrente extends Conta {

    double chequeEspecial;

    public ContaCorrente(int agencia, int numero, double saldo, Cliente nomeCliente) {
        super(agencia, numero, saldo, nomeCliente);
        this.chequeEspecial = 100;
    }

    public void setchequeEspecial(double chequeEspecial) {
        this.chequeEspecial = chequeEspecial;

    }

    public double getchequeEspecial() {
        return chequeEspecial;
    }

    @Override
    public boolean saca(double valor) {
        if (valor > 0 && valor <= super.saldo + this.chequeEspecial) {
            super.saldo = super.saldo - valor;
            System.out.println("Saque realizado com sucesso! Valor do saque solicitado R$:" + valor);
            super.enviaNotificacao("Saque", valor);
            return true;
        } else {
            System.out.println("Você não possui saldo suficente! Valor do saque solicitado: R$" + valor);
            return false;
        }
    }

}