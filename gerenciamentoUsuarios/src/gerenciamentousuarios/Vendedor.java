package gerenciamentousuarios;

import java.util.Date;

/**
 *
 * @author WTNUNES
 */
public class Vendedor extends Pessoa {

    protected String ctps;
    protected Date dataAdmissao;
    protected Integer salario;

    public Vendedor() {
    }

    public Vendedor(String ctps, Date dataAdmissao, Integer salario) {
        this.ctps = ctps;
        this.dataAdmissao = dataAdmissao;
        this.salario = salario;
    }

    public Vendedor(String ctps, Date dataAdmissao, Integer salario, String nome, String login, String senha, String email, String cpf, Endereco endereco) {
        super(nome, login, senha, email, cpf, endereco);
        this.ctps = ctps;
        this.dataAdmissao = dataAdmissao;
        this.salario = salario;
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
