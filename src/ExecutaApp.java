import java.time.LocalDate;

public class ExecutaApp {

    public static void main(String[] args) {

        System.out.println("Banco Maut" + "\n");

        // Cliente 1 │ Conta 1
        Cliente cliente = new Cliente("Arlindo Macêdo", "123.456.789-12", LocalDate.of(1945, 2, 8), "Rua Carlos Matos, 12, Santa Fé, Picos - PI");
        System.out.println(cliente.getNome());
        System.out.println(cliente.getCPF());
        System.out.println(cliente.getDataNascimento());
        System.out.println(cliente.setEndereco());

        Conta conta1 = new Conta(5678, 1234567, 7, cliente);
        System.out.println("Quantidade de contas no Banco Maut: " + conta1.getQuantidadeContas());
        System.out.println("Agência: " + conta1.getAgencia());
        System.out.println("Número da Conta: " + conta1.getNumero());
        System.out.println("Saldo: R$" + conta1.getSaldo());

        // Operações Bancárias Conta 1 │ Cliente 1
        conta1.deposita(750);
        System.out.println("Saldo atual da conta: R$" + conta1.getSaldo());

        conta1.saca(800);
        System.out.println("Saldo atual da conta: R$" + conta1.getSaldo() + "\n");

        
        
        
        // Cliente 2 │ Conta 2
        Cliente cliente2 = new Cliente("Lorena Ohanna", "101.855.893-45", LocalDate.of(1945, 2, 8), "Rua Epaminondas Silva, 456, Coahb, Goiânia - GO");
        System.out.println(cliente2.getNome());
        System.out.println(cliente.getCPF());
        System.out.println(cliente.getDataNascimento());
        System.out.println(cliente.setEndereco());

        Conta conta2 = new Conta(1234, 7891011, 5000, cliente2);
        System.out.println("Quantidade de contas no Banco Maut: " + conta1.getQuantidadeContas());
        System.out.println("Agência: " + conta2.getAgencia());
        System.out.println("Número da Conta: " + conta2.getNumero());
        System.out.println("Saldo: R$" + conta2.getSaldo());

        // Operações Bancárias Conta 2 │ Cliente 2
        conta2.deposita(200);
        System.out.println("Saldo atual da conta: R$" + conta2.getSaldo());

        conta2.saca(967);
        System.out.println("Saldo atual da conta: R$" + conta2.getSaldo());

        conta2.transfere(2000, conta1);
        System.out.println("Conta de Destino: " + conta1 + "\n");
        

        
        
        // Cliente 2 │ Conta 3
        System.out.println(cliente2.getNome());
        System.out.println(cliente2.getCPF());
        System.out.println(cliente2.getDataNascimento());
        System.out.println(cliente2.setEndereco());

        Conta conta3 = new Conta(1234, 2021223, 10, cliente2);
        System.out.println("Quantidade de contas no Banco Maut: " + conta1.getQuantidadeContas());
        System.out.println("Agência: " + conta3.getAgencia());
        System.out.println("Número da Conta: " + conta3.getNumero());
        System.out.println("Saldo: R$" + conta3.getSaldo());

        // Operações Bancárias Conta 3 │ Cliente 2
        conta3.deposita(2);
        System.out.println("Saldo atual da conta: R$" + conta3.getSaldo());

        conta3.saca(20);
        System.out.println("Saldo atual da conta: R$" + conta3.getSaldo() + "\n");
    }
}
