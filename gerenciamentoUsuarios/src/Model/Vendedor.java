package Model;

import Model.Pessoa;
import Model.Endereco;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author WTNUNES
 */
public class Vendedor extends Pessoa {

    protected String ctps;
    protected LocalDate dataAdmissao;
    protected Double salario;
    protected Endereco endereco;

    public Vendedor() {
    }

    public Vendedor(String ctps, LocalDate dataAdmissao, Double salario) {
        this.ctps = ctps;
        this.dataAdmissao = dataAdmissao;
        this.salario = salario;
    }

    public Vendedor(String ctps, LocalDate dataAdmissao, Double salario, String nome, String login, String senha, String email, String cpf, Endereco endereco) {
        super(nome, login, senha, email, cpf, endereco);
        this.ctps = ctps;
        this.dataAdmissao = dataAdmissao;
        this.salario = salario;
    }

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        return "Vendedor : "
                + "nome='" + nome + '\''
                + ", login='" + login + '\''
                + ", senha='" + senha + '\''
                + ", email='" + email + '\''
                + ", cpf='" + cpf + '\''
                + ", ctps='" + ctps + '\''
                + ", dataAdmissao=" + dataAdmissao.format(formatter)
                + ", salario=" + salario
                + ", cidade='" + endereco.cidade + '\''
                + ", rua='" + endereco.rua + '\''
                + ", numero=" + endereco.numero;
    }

    public String getCtps() {
        return ctps;
    }

    public void setCtps(String ctps) {
        this.ctps = ctps;
    }

    public LocalDate getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(LocalDate dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

}
