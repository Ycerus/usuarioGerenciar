/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package formasgeometricas;

/**
 *
 * @author WTNUNES
 */
public class Circulo extends FormasGeometricas{    

    @Override
    public double calcularArea() {
        return pi_const * Math.pow(raio, 2);
    }
    
    public double pi_const = Math.PI;
    
    public double raio;
    
    public double diametro = this.raio * 2;

    public Circulo() {
    }

    public Circulo(double Raio) {
        this.raio = Raio;
    }

    public Circulo(double Raio, String formato, Integer area, Integer qtdLados) {
        super(formato, area, qtdLados);
        this.raio = Raio;
    }

    public double getPi_const() {
        return pi_const;
    }

    public void setPi_const(double pi_const) {
        this.pi_const = pi_const;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double Raio) {
        this.raio = Raio;
    }

    public double getDiametro() {
        return diametro;
    }

    public void setDiametro(double Diametro) {
        this.diametro = Diametro;
    }

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
    
    
    
}
