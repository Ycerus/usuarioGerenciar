package gerenciamentousuarios;

import java.util.Date;

/**
 *
 * @author WTNUNES
 */
public class Gerente extends Pessoa {

    protected String ctps;
    protected Date dataAdmissao;
    protected Integer salario;
    protected String departamento;
    protected Integer bonus;

    public Gerente() {
    }

    public Gerente(String ctps, Date dataAdmissao, Integer salario, String departamento, Integer bonus) {
        this.ctps = ctps;
        this.dataAdmissao = dataAdmissao;
        this.salario = salario;
        this.departamento = departamento;
        this.bonus = bonus;
    }

    public Gerente(String ctps, Date dataAdmissao, Integer salario, String departamento, Integer bonus, String nome, String login, String senha, String email, String cpf, Endereco endereco) {
        super(nome, login, senha, email, cpf, endereco);
        this.ctps = ctps;
        this.dataAdmissao = dataAdmissao;
        this.salario = salario;
        this.departamento = departamento;
        this.bonus = bonus;
    }

    public String getCtps() {
        return ctps;
    }

    public void setCtps(String ctps) {
        this.ctps = ctps;
    }

    public Date getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(Date dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    public Integer getSalario() {
        return salario;
    }

    public void setSalario(Integer salario) {
        this.salario = salario;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public Integer getBonus() {
        return bonus;
    }

    public void setBonus(Integer bonus) {
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
