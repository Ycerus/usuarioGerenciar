package gerenciamentousuarios;
/**
 *
 * @author WTNUNES
 */
public class Pessoa {

    protected String nome;
    protected String login;
    protected String senha;
    protected String email;
    protected String cpf;

    public Pessoa() {
    }

    public Pessoa(String nome, String login, String senha, String email, String cpf) {
        this.nome = nome;
        this.login = login;
        this.senha = senha;
        this.email = email;
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return super.toString(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
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
