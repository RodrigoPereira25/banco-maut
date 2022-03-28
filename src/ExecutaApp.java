import java.time.LocalDate;

public class ExecutaApp {

    public static void main(String[] args) {

        System.out.println("Banco Maut" + "\n");

        // Cliente 1 │ Conta 1
        Cliente cliente1 = new Cliente("Arlindo Macêdo", "123.456.789-12", LocalDate.of(1945, 2, 8),
                new Endereco("Rua Carlos Matos", 12, "Santa Fé", "Picos", "PI"));
        System.out.println(cliente1.getNome());
        System.out.println(cliente1.getCPF());
        System.out.println(cliente1.getDataNascimento());
        System.out.println(cliente1.getEnderecos());
        Conta cc1 = new ContaCorrente(5678, 1234567, 7, cliente1);
        System.out.println("Quantidade de contas no Banco Maut: " + cc1.getQuantidadeContas());
        System.out.println("Agência: " + cc1.getAgencia());
        System.out.println("Número da Conta: " + cc1.getNumero());
        System.out.println("Saldo: R$" + cc1.getSaldo());

        // Operações Bancárias Conta 1 │ Cliente 1
        cc1.deposita(750);
        System.out.println("Saldo atual da conta: R$" + cc1.getSaldo());

        cc1.saca(800);
        System.out.println("Saldo atual da conta: R$" + cc1.getSaldo() + "\n");

        // Cliente 2 │ Conta 2
        Cliente cliente2 = new Cliente("Lorena Ohanna", "101.855.893-45", LocalDate.of(1945, 2, 8),
                new Endereco("Rua Epaminondas Silva", 456, "Cohab", "Goiânia", "GO"));
        System.out.println(cliente2.getNome());
        System.out.println(cliente2.getCPF());
        System.out.println(cliente2.getDataNascimento());
        System.out.println(cliente2.getEnderecos());

        Conta cp1 = new ContaPoupanca(1234, 7891011, 5000, cliente2);
        System.out.println("Quantidade de contas no Banco Maut: " + cc1.getQuantidadeContas());
        System.out.println("Agência: " + cp1.getAgencia());
        System.out.println("Número da Conta: " + cp1.getNumero());
        System.out.println("Saldo: R$" + cp1.getSaldo());

        // Operações Bancárias Conta 2 │ Cliente 2
        cp1.deposita(200);
        System.out.println("Saldo atual da conta: R$" + cp1.getSaldo());

        cp1.saca(967);
        System.out.println("Saldo atual da conta: R$" + cp1.getSaldo());

        cp1.transfere(2000, cc1);
        System.out.println("Conta de Destino: " + cc1 + "\n");

        // Cliente 2 │ Conta 3
        System.out.println(cliente2.getNome());
        System.out.println(cliente2.getCPF());
        System.out.println(cliente2.getDataNascimento());
        System.out.println(cliente2.getEnderecos());

        Conta cc3 = new ContaCorrente(1234, 2021223, 10, cliente2);
        System.out.println("Quantidade de contas no Banco Maut: " + cc1.getQuantidadeContas());
        System.out.println("Agência: " + cc3.getAgencia());
        System.out.println("Número da Conta: " + cc3.getNumero());
        System.out.println("Saldo: R$" + cc3.getSaldo());

        // Operações Bancárias Conta 3 │ Cliente 2
        cc3.deposita(2);
        System.out.println("Saldo atual da conta: R$" + cc3.getSaldo());

        cc3.saca(20);
        System.out.println("Saldo atual da conta: R$" + cc3.getSaldo() + "\n");

    }

}
