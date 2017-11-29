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
public class Circulo extends Figura {

    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }
    

    public double area() {
        double areac = (3.1416) * Math.pow(radio ,2);
        return areac;
    }

    public double perimetro() {
        double perimetroc = 2 * (3.1416) * radio;
        return perimetroc;

    }
}
