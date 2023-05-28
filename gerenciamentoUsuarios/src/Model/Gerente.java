package Model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author WTNUNES
 */
public class Gerente extends Pessoa {

    protected String ctps;
    protected LocalDate dataAdmissao;
    protected Double salario;
    protected String departamento;
    protected Double bonus;

    public Gerente() {
    }

    public Gerente(String ctps, LocalDate dataAdmissao, Double salario, String departamento, Double bonus) {
        this.ctps = ctps;
        this.dataAdmissao = dataAdmissao;
        this.salario = salario;
        this.departamento = departamento;
        this.bonus = bonus;
    }

    public Gerente(String ctps, LocalDate dataAdmissao, Double salario, String departamento, Double bonus, String nome, String login, String senha, String email, String cpf, Endereco endereco) {
        super(nome, login, senha, email, cpf, endereco);
        this.ctps = ctps;
        this.dataAdmissao = dataAdmissao;
        this.salario = salario;
        this.departamento = departamento;
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        return "Gerente : "
                + "nome='" + nome + '\''
                + ", login='" + login + '\''
                + ", senha='" + senha + '\''
                + ", email='" + email + '\''
                + ", cpf='" + cpf + '\''
                + ", ctps='" + ctps + '\''
                + ", dataAdmissao=" + dataAdmissao.format(formatter)
                + ", salario=" + salario
                + ", bonus=" + bonus
                + ", departamento =" + departamento
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

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public Double getBonus() {
        return bonus;
    }

    public void setBonus(Double bonus) {
        this.bonus = bonus;
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

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

}
