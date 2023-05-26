package Model;

/**
 *
 * @author WTNUNES
 */
public class Cliente extends Pessoa {

    protected Integer limiteCredito;

    public Cliente() {
    }

    public Cliente(Integer limiteCredito) {
        this.limiteCredito = limiteCredito;
    }

    public Cliente(Integer limiteCredito, String nome, String login, String senha, String email, String cpf, Endereco endereco) {
        super(nome, login, senha, email, cpf, endereco);
        this.limiteCredito = limiteCredito;
    }

    public Integer getLimiteCredito() {
        return limiteCredito;
    }

    public void setLimiteCredito(Integer limiteCredito) {
        this.limiteCredito = limiteCredito;
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
