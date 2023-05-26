/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package formasgeometricas;

/**
 *
 * @author WTNUNES
 */
public class Triangulo extends FormasGeometricas{
    
    protected double base;
    protected double altura;

    @Override
    public double calcularArea() {
        return (base * altura)/2;
    }
    
    public Triangulo() {
    }

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public Triangulo(double base, double altura, String formato, Integer area, Integer qtdLados) {
        super(formato, area, qtdLados);
        this.base = base;
        this.altura = altura;
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

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    
    
}
