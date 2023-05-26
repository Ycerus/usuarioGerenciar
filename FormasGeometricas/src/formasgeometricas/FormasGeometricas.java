package formasgeometricas;

/**
 *
 * @author WTNUNES
 */
public class FormasGeometricas {
    
    public double calcularArea(){
        
        return 0;
    };
    

    public String formato;
    
    public Integer area;
    
    public Integer qtdLados;

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public Integer getArea() {
        return area;
    }

    public void setArea(Integer area) {
        this.area = area;
    }

    public Integer getQtdLados() {
        return qtdLados;
    }

    public void setQtdLados(Integer qtdLados) {
        this.qtdLados = qtdLados;
    }

    public FormasGeometricas() {
    }

    public FormasGeometricas(String formato, Integer area, Integer qtdLados) {
        this.formato = formato;
        this.area = area;
        this.qtdLados = qtdLados;
    }

    @Override
    public String toString() {
        return super.toString(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
}
