package gerenciamentousuarios;

/**
 *
 * @author WTNUNES
 */
public class Endereco {

    protected String cidade;
    protected String rua;
    protected Integer numero;

    public Endereco() {
    }

    public Endereco(String cidade, String rua, Integer numero) {
        this.cidade = cidade;
        this.rua = rua;
        this.numero = numero;
    }

    @Override
    public String toString() {
        return super.toString(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

}
