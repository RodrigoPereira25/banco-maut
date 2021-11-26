public class ExecutaApp {

    public static void main(String[] args) {

        System.out.println("Banco Maut" + "\n");
        
        //Conta 1, Cliente 1
        Conta conta1 = new Conta();
        conta1.agencia = 1234;
        conta1.numero = 1234567;
        conta1.saldo = 0;

        Cliente cliente = new Cliente();
        cliente.nome = "Edivaldo Macêdo";
        cliente.CPF = "123.456.789-01";
        
        System.out.println("Cliente: " + cliente.nome);
        System.out.println("CPF: " + cliente.CPF);
        System.out.println("Agência: " + conta1.agencia);
        System.out.println("Número da Conta: " + conta1.numero);
        System.out.println("Saldo: R$" + conta1.saldo + "\n"); 
        
        //Conta 2, Cliente 1
        Conta conta2 = new Conta();
        conta2.agencia = 1234;
        conta2.numero = 7891011;
        conta2.saldo = 5000;
        
        System.out.println("Cliente: " + cliente.nome);
        System.out.println("CPF: " + cliente.CPF);
        System.out.println("Agência: " + conta2.agencia);
        System.out.println("Número da Conta: " + conta2.numero);
        System.out.println("Saldo: R$" + conta2.saldo + "\n");
        
        //Conta 3, Cliente 1
        Conta conta3 = new Conta();
        conta3.agencia = 1234;
        conta3.numero = 1220586;
        conta3.saldo = 25;
        
        System.out.println("Cliente: " + cliente.nome);
        System.out.println("CPF: " + cliente.CPF);
        System.out.println("Agência: " + conta3.agencia);
        System.out.println("Número da Conta: " + conta3.numero);
        System.out.println("Saldo: R$" + conta3.saldo);

    } 
}
