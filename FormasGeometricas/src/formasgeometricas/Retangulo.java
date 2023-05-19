/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package formasgeometricas;

/**
 *
 * @author WTNUNES
 */
public class Retangulo extends FormasGeometricas{
    
    protected double altura;
    
    protected double base;

    public Retangulo() {
    }

    public Retangulo(double altura, double base) {
        this.altura = altura;
        this.base = base;
    }

    public Retangulo(double altura, double base, String formato, Integer area, Integer qtdLados) {
        super(formato, area, qtdLados);
        this.altura = altura;
        this.base = base;
    }

    @Override
    public double calcularArea() {
        return base * altura;
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

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }
    
    
    
}
