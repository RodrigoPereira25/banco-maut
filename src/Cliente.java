import java.time.LocalDate;

public class Cliente {

    private String nome;
    private String CPF;
    private LocalDate dataNascimento;
    private String endereco;

    public Cliente(String nome, String CPF, LocalDate dataNascimento, String endereco) {
        this.nome = nome;
        this.CPF = CPF;
        this.dataNascimento = dataNascimento;
        this.endereco = endereco;
    }

    public String getNome() {
        return this.nome;
    }

    public String getCPF() {
        return this.CPF;
    }

    public LocalDate getDataNascimento() {
        return this.dataNascimento;
    }

    public String setEndereco() {
        return this.endereco;
    }
}
