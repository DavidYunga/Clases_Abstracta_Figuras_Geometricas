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
public class Rectangulo extends Figura {
    private double ancho;
    private double alto;

    public Rectangulo(double ancho, double alto) {
        this.ancho = ancho;
        this.alto = alto;
    }
    
    
    public double area(){
    double arear = ancho * alto;
    return arear;
    }
    public double perimetro(){
    double perimetror = 2*(alto) + 2*(ancho);
    return perimetror;
    }
}
