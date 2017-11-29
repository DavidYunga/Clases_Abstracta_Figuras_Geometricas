/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figura;

/**
 *
 * @author Usuario
 */
public class Triangulo extends Figura {
    private double altura;
    private double base;

    public Triangulo(double base, double altura) {
        this.altura = altura;
        this.base = base;
    }
    
    

    public double area() {
        double areat = (base * altura)/2 ;
        return areat;
    }

    public double perimetro() {
        double perimetrot = base * 3;
        return perimetrot;

    }
    
}
