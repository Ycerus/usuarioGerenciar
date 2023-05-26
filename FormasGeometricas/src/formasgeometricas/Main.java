/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package formasgeometricas;

/**
 *
 * @author WTNUNES
 */
public class Main {
    
     public static void main(String[] args) {
        Retangulo retangulo = new Retangulo();
        Circulo circulo = new Circulo();
        Triangulo triangulo = new Triangulo();
        
        circulo.setRaio(5);
        
        triangulo.setBase(5);
        triangulo.setAltura(120);
        
        retangulo.setAltura(10);
        retangulo.setBase(10);
        
         System.out.println(retangulo.calcularArea());
         System.out.println(circulo.calcularArea());
         System.out.println(triangulo.calcularArea());
        
    }
    
}
