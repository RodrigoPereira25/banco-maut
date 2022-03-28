import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Cliente {

    private String nome;
    private String CPF;
    private LocalDate dataNascimento;
    private List<Endereco> enderecos = new ArrayList<>();

    public Cliente(String nome, String CPF, LocalDate dataNascimento, Endereco endereco) {
        this.nome = nome;
        this.CPF = CPF;
        this.dataNascimento = dataNascimento;
        this.enderecos.add(endereco);
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

    public List<Endereco> getEnderecos() {
        return enderecos;
    }

}